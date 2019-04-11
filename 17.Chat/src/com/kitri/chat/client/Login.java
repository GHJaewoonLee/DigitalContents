package com.kitri.chat.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.kitri.chat.util.ChatConstance;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener, ListSelectionListener, Runnable {
	
	Socket socket;
	
	String myid;
	String previous = "";
	
	BufferedReader in;
	OutputStream out;
	
	JLabel ip;
	JLabel name;
	JTextField ipTf;
	JTextField nameTf;
	JButton cancel;
	JButton ok;
	
	Chat chat;
	Paper paper;
	Rename rename;

	public Login() {
		super("Login!!");
		initGUI();
		
		chat = new Chat();
		paper = new Paper();
		rename = new Rename();
		
		// Login 창 event 등록
		nameTf.addActionListener(this);
		ok.addActionListener(this);
		cancel.addActionListener(this);
		
		// Chat 창 event 등록
		chat.globalsend.addActionListener(this);
		chat.whomsend.addActionListener(this);
		chat.paper.addActionListener(this);
		chat.rename.addActionListener(this);
		chat.exit.addActionListener(this);
		chat.list.addListSelectionListener(this);
		chat.addWindowListener(new WindowAdapter() {
									@Override
									public void windowClosing(WindowEvent e) {
										closeProcess();
									}
								});
		
		paper.ok.addActionListener(this);
		paper.cancel.addActionListener(this);
		paper.answer.addActionListener(this);
		paper.addWindowListener(new WindowAdapter() {
									@Override
									public void windowClosing(WindowEvent e) {
										closePaperProcess();
									}
								});
		
		rename.ok.addActionListener(this);
		rename.cancel.addActionListener(this);
		rename.addWindowListener(new WindowAdapter() {
									@Override
									public void windowClosing(WindowEvent e) {
										closeRenameProcess();
									}
								});
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(244,243,242));
			{
				ip = new JLabel();
				getContentPane().add(ip);
				ip.setText("\uc544\uc774\ud53c");
				ip.setBounds(12, 12, 60, 30);
				ip.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				ip.setFocusable(false);
				ip.setRequestFocusEnabled(false);
				ip.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				name = new JLabel();
				getContentPane().add(name);
				name.setText("\ub300\ud654\uba85");
				name.setBounds(12, 47, 60, 30);
				name.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				name.setFocusable(false);
				name.setRequestFocusEnabled(false);
				name.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				ipTf = new JTextField();
				getContentPane().add(ipTf);
				ipTf.setBounds(78, 12, 209, 30);
			}
			{
				nameTf = new JTextField();
				getContentPane().add(nameTf);
				nameTf.setBounds(78, 47, 209, 30);
			}
			{
				ok = new JButton();
				getContentPane().add(ok);
				ok.setText("\ub85c\uadf8\uc778");
				ok.setBounds(83, 83, 61, 32);
				ok.setBackground(new java.awt.Color(237,236,233));
				ok.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
			}
			{
				cancel = new JButton();
				getContentPane().add(cancel);
				cancel.setText("\ucde8 \uc18c");
				cancel.setBounds(153, 83, 59, 32);
				cancel.setBackground(new java.awt.Color(237,236,233));
				cancel.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
			}
			pack();
			this.setSize(303, 150);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Login inst = new Login();
				inst.setLocationRelativeTo(null);
				inst.setResizable(false);
				inst.setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if (ob == nameTf || ob == ok) {
			connectProcess();
		} else if (ob == cancel) {
			System.exit(0);
		} else if (ob == chat.globalsend) {
			globalsendProcess();
		} else if (ob == chat.whomsend) {
			whomsendProcess();
		} else if (ob == chat.paper) {
			openPaper();
		} else if (ob == chat.rename) {
			openRename();
		} else if (ob == chat.exit) {
			closeProcess();
		} else if (ob == paper.ok) {
			paperProcess();
		} else if (ob == paper.answer) {
			answerProcess();
		} else if (ob == paper.cancel) {
			closePaperProcess();
		} else if (ob == rename.ok) {
			renameProcess();
		} else if (ob == rename.cancel) {
			closeRenameProcess();
		}
	}
	

	@Override
	public void valueChanged(ListSelectionEvent e) {
		String selName = chat.list.getSelectedValue();
		chat.whom.setText(selName);
	}

	private void renameProcess() {
		String newName = rename.newname.getText().trim();
		
		if (newName.isEmpty()) {
			JOptionPane.showMessageDialog(rename, "변경할 대화명 입력하세요.", "변경 오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(newName.equals(myid)) {
			JOptionPane.showMessageDialog(rename, "변경할 대화명은 이전 대화명과 같을 수 없습니다.", "변경 오류", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		sendMassage(ChatConstance.CS_RENAME + "|" + newName);
		
		closeRenameProcess();
	}

	private void closeRenameProcess() {
		rename.oldname.setText("");
		rename.newname.setText("");
		rename.setVisible(false);
	}

	private void openRename() {
		rename.oldname.setText(myid);
		rename.setVisible(true);
	}
	
	private void answerProcess() {
		String to = paper.from.getText();
		String msg = paper.letter.getText().trim();
		
		paper.setTitle("답장보내기");
		paper.from.setText(myid);
		paper.to.setText(to);
		
		paper.letter.setText(msg + "\n");
		paper.letter.setEditable(true);
		
		previous = paper.letter.getText().trim();
		
		paper.card.show(paper.cardp, "ok");
	}
	
	private void closePaperProcess() {
		paper.from.setText("");
		paper.to.setText("");
		paper.letter.setText("");
		paper.setVisible(false);
	}
	
	// 1. 받는 사람 유효성 검사
	// 2. Paper 창 띄우기
	private void openPaper() {
		String to = chat.whom.getText();
		
		if (to.isEmpty()) {
			JOptionPane.showMessageDialog(chat, "대상자를 선택하세요.", "대상자 오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(to.equals(myid)) {
			JOptionPane.showMessageDialog(chat, "자기 자신에게 쪽지를 보낼 수 없습니다.", "대상자 오류", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		paper.from.setText(myid);
		paper.to.setText(to);
		paper.letter.setText("");
		paper.setVisible(true);
	}
	

	private void paperProcess() {
		String to = paper.to.getText();
		String msg = paper.letter.getText().trim();
		
		if(msg.isEmpty() || previous.equals(msg)) {
			JOptionPane.showMessageDialog(paper, "메시지를 입력하세요.", "쪽지 전송 오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if (msg.indexOf(ChatConstance.INDICATOR) != -1) {
			JOptionPane.showMessageDialog(paper, "메시지에 사용할 수 없는 문자가 있습니다.", "쪽지 전송 오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		sendMassage(ChatConstance.CS_PAPER + "|" + to + "|" + msg.replace("\n", ChatConstance.INDICATOR));
		
		closePaperProcess();
	}

	// 1.server에 접속종료 알림
	private void closeProcess() {
		sendMassage(ChatConstance.CS_DISCONNECT + "|");
	}

	// 1. 대상자, 메시지 get (유효성 검사 : 메시지 - 비었는지,대상자 선택 - 자기자신 제외, 비었는지)
	// 2. server에 메시지 보내기
	// 3. 현재 메시지 지우기
	private void whomsendProcess() {
		String msg = chat.whomsend.getText().trim();
		chat.whomsend.setText("");
		
		if (msg.isEmpty()) {
			return;
		}
		
		String to = chat.whom.getText();
		
		if (to.isEmpty()) {
			JOptionPane.showMessageDialog(chat, "대상자를 선택하세요.", "대상자 오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(to.equals(myid)) {
			JOptionPane.showMessageDialog(chat, "자기 자신에게 귓말을 보낼 수 없습니다.", "대상자 오류", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		sendMassage(ChatConstance.CS_TO + "|" + to + "|" + msg);
		viewMessage("★" + to + "★ " + msg);
	}	

	// 1. 메시지 get (유효성검사)
	// 2. server로 메시지 전송
	private void globalsendProcess() {
		String msg = chat.globalsend.getText().trim();
		chat.globalsend.setText("");
		
		if (msg.isEmpty()) {
			return;
		}
		
		sendMassage(ChatConstance.CS_ALL + "|" + msg);
	}

	// 1. IP, 대화명 get(유효성검사 - 대화명:3자 이상)
	// 2. 1의 IP를 이용해서 Socket 생성
	// 3. IO (BufferedReader, OutputStream) 생성
	// 4. login 창 닫고, chat 창 열기
	// 5. server로 메시지 전송
	// 6. Thread 실행
	private void connectProcess() {
		String ip = ipTf.getText().trim();
		myid = nameTf.getText().trim();
		
		if (myid.length() < 3) {
			JOptionPane.showMessageDialog(this, "대화명은 3자 이상입니다.", "대화명 오류", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		try {
			socket = new Socket(ip, ChatConstance.PORT);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = socket.getOutputStream();
			
			this.setVisible(false);
			chat.setVisible(true);
			
			sendMassage(ChatConstance.CS_CONNECT + "|" + myid);
			
			new Thread(this).start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void sendMassage(String msg) {
		try {
			out.write((msg + "\n").getBytes());	// BufferedReader는 enter key 기준
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	@Override
	public void run() {
		boolean flag = true;
		
		while (flag) {
			try {
				String msg = in.readLine();
				System.out.println("message from server : " + msg);	// protocol|message_format
				
				StringTokenizer st = new StringTokenizer(msg, "|");
				int protocol = Integer.parseInt(st.nextToken());
				
				switch (protocol) {
					case ChatConstance.SC_CONNECT : {
						String tmp = st.nextToken();
						viewMessage("[알림] " + tmp + "님이 접속하였습니다.");
						
						chat.listData.add(tmp);
						chat.list.setListData(chat.listData);
					} break;
													
					case ChatConstance.SC_MESSAGE : {
						String tmp = st.nextToken();
						viewMessage(tmp);
					} break;
													
					case ChatConstance.SC_PAPER : {
						String from = st.nextToken();
						String tmp = st.nextToken();
						
						paper.setTitle("쪽지받기");
						paper.from.setText(from);
						paper.to.setText(myid);
						paper.letter.setText(tmp.replace(ChatConstance.INDICATOR, "\n"));
						paper.letter.append("\n--------------- Message from " + from + " ---------------\n");
						paper.letter.setEditable(false);
						paper.card.show(paper.cardp, "answer");
						
						paper.setVisible(true);
					} break;
													
					case ChatConstance.SC_RENAME : {
						String before = st.nextToken();
						String after = st.nextToken();
						
						viewMessage("[알림] " + before + " 님이 대화명을 " + after + "로 변경하였습니다.");
						
						int index = chat.listData.indexOf(before);
						chat.listData.set(index, after);
						chat.list.setListData(chat.listData);
						
						if (myid.equals(before)) {
							myid = after;
						}
					} break;
													
					case ChatConstance.SC_DISCONNECT : {
						String tmp = st.nextToken();
						
						if (!tmp.equals(myid)) {
							viewMessage("[알림] " + tmp + "님이 접속을 종료하였습니다.");
							chat.listData.remove(tmp);
							chat.list.setListData(chat.listData);
						} else {
							flag = false; // end thread
							
							in.close();
							out.close();
							socket.close();
							
							chat.area.setText("");
							chat.listData.clear();
							chat.list.setListData(chat.listData);
							
							chat.setVisible(false);
							setVisible(true);
						}
					} break;
				}
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}
	
	private void viewMessage(String msg) {
		chat.area.append(msg + "\n");
		chat.area.setCaretPosition(chat.area.getDocument().getLength());
	}
}
