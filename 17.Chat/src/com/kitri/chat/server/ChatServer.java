package com.kitri.chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import com.kitri.chat.util.ChatConstance;


public class ChatServer implements Runnable {
	
	Vector<ChatClient> list = new Vector<ChatServer.ChatClient>();
	
	ServerSocket ss;
	
	
	public ChatServer() {
		// create server socket
		try {
			ss = new ServerSocket(ChatConstance.PORT);
			System.out.println("Wait for client");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// for connection between server and client
	@Override
	public void run() {
		// using thread
		// accept client's connection
		// infinite loop until server is closed
		while (true) {
			try {
				Socket socket = ss.accept();
				System.out.println("Connection success : " + socket);
				
				new ChatClient(socket).start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	class ChatClient extends Thread {
		
		String name;
		BufferedReader in;
		OutputStream out;
		Socket socket;
		
		public ChatClient(Socket socket) {
			try {
				this.socket = socket;
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = socket.getOutputStream();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// for chatting
		@Override
		public void run() {
			// using thread
			// client output -> server input
			// server output -> client input
			boolean flag = true;
			
			while (flag) {
				try {
					String msg = in.readLine();
					
					System.out.println("message from client : " + msg);	// protocol|message_format
					
					StringTokenizer st = new StringTokenizer(msg, "|");
					int protocol = Integer.parseInt(st.nextToken());
					
					switch (protocol) {
						case ChatConstance.CS_CONNECT : {
							name = st.nextToken();
							
//							int size = list.size();
//							for (int i = 0; i < size; i++) {
//								ChatClient cc = list.get(i);
//							}
							
							// ���� ������ ���������� ���� ��ȭ���� ����
							multicast(ChatConstance.SC_CONNECT + "|" + name);
							
							// ������ ��ȭ������ ����Ʈ�� ���� �߰�
							list.add(this);
							
							// ������ �ٸ� ������� ��ȭ���� ���� (���� ����)
							for(ChatClient cc : list) {
								unicast((ChatConstance.SC_CONNECT + "|" + cc.name));
							}
							
						} break;
														
						case ChatConstance.CS_ALL : {
							String tmp = st.nextToken();
							
							multicast(ChatConstance.SC_MESSAGE + "|[" + name + "] " + tmp);
						} break;
													
						case ChatConstance.CS_TO : {
							String to = st.nextToken();
							String tmp = st.nextToken();
							
							for(ChatClient cc : list) {
								if (cc.name.equals(to)) {
									cc.unicast((ChatConstance.SC_MESSAGE + "|��" + name + "��" + tmp));
									break;
								}
							}
							
						} break;
													
						case ChatConstance.CS_PAPER : {
							String to = st.nextToken();
							String tmp = st.nextToken();
							
							for(ChatClient cc : list) {
								if (cc.name.equals(to)) {
									cc.unicast((ChatConstance.SC_PAPER + "|" + name + "|" + tmp));
									break;
								}
							}
						} break;
														
						case ChatConstance.CS_RENAME : {
							String before = name;
							String after = st.nextToken();
							boolean find = false;
							
							for(ChatClient cc : list) {
								if (cc.name.equals(after)) {
									unicast((ChatConstance.SC_MESSAGE + "|�ߺ��Ǵ� ��ȭ���� �־� ��ȭ���� �������� ���Ͽ����ϴ�."));
									find = true;
									break;
								}
							}
							
							if (!find) {
								name = after;
								multicast(ChatConstance.SC_RENAME + "|" + before + "|" + after);
							}
						} break;
														
						case ChatConstance.CS_DISCONNECT : {
							multicast(ChatConstance.CS_DISCONNECT + "|" + name);
							list.remove(this);
							
							flag = false; // end thread
							
							in.close();
							out.close();
							socket.close();
						} break;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		private void multicast(String msg) {
			for(ChatClient cc : list) {
				cc.unicast(msg);
			}
		}
		
		private void unicast(String msg) {
			try {
				out.write((msg + "\n").getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	public static void main(String[] args) {
		new Thread(new ChatServer()).start();
	}
}
