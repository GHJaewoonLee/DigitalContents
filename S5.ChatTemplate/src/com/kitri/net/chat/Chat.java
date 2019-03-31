package com.kitri.net.chat;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;


@SuppressWarnings("serial")
public class Chat extends JFrame{

	JTextArea area = new JTextArea();
	JList<Object> list = new JList<Object>();
	
	JTextField globalSend = new JTextField();
	JTextField whomSend = new JTextField();
	
	JLabel whom = new JLabel("귓속말");
	
	JButton rename = new JButton("대화명변경");
	JButton paper = new JButton("쪽지보내기");
	JButton close = new JButton("나    가    기");
	
	JColorChooser cc = new JColorChooser();
	
	EtchedBorder ebR;
	BevelBorder bbL, bbL2;
	EmptyBorder emb1, emb2, emb3;
	CompoundBorder cb, cb2;
	
	JPanel p = new JPanel();
	
	GroupLayout gl = new GroupLayout(p);
	GroupLayout.SequentialGroup hGroup = gl.createSequentialGroup();
	GroupLayout.SequentialGroup vGroup = gl.createSequentialGroup();

	
	public Chat() {
		super("즐거운 채팅.. ^^*");
		
		cc.setColor(JColorChooser.showDialog(this, "배경 색상 선택", getBackground()));
		
		EtchedBorder ebR = new EtchedBorder(EtchedBorder.LOWERED);
		BevelBorder bbL = new BevelBorder(BevelBorder.RAISED, cc.getColor().darker(), cc.getColor().brighter());
		BevelBorder bbL2 = new BevelBorder(BevelBorder.RAISED);
		EmptyBorder emb1 = new EmptyBorder(5, 5, 5, 5);
		EmptyBorder emb2 = new EmptyBorder(0, 30, 0, 30);
		EmptyBorder emb3 = new EmptyBorder(0, 0, 0, 30);
		CompoundBorder cb = new CompoundBorder(bbL, ebR);
		CompoundBorder cb2 = new CompoundBorder(bbL2, emb2);
		CompoundBorder cb3 = new CompoundBorder(emb1, ebR);
		
		area.setBorder(ebR);
		globalSend.setBorder(ebR);
		whom.setBorder(emb3);
		whom.setBackground(cc.getColor());
		whom.setForeground(cc.getColor().darker());
		whomSend.setBorder(ebR);
		
		list.setBorder(cb);
		rename.setBorder(cb2);
		paper.setBorder(cb2);
		close.setBorder(cb2);
		
		gl.setAutoCreateGaps(true);
		gl.setAutoCreateContainerGaps(true);
		hGroup.addGroup(gl.createSequentialGroup().addGroup(gl.createParallelGroup().addComponent(area).addComponent(globalSend).addGroup(gl.createSequentialGroup().addComponent(whom).addComponent(whomSend)))
												  .addGroup(gl.createParallelGroup().addComponent(list).addComponent(rename).addComponent(paper).addComponent(close)));
		gl.setHorizontalGroup(hGroup);
		vGroup.addGroup(gl.createParallelGroup(Alignment.BASELINE).addComponent(area).addComponent(list, Alignment.LEADING).addComponent(rename, Alignment.TRAILING));
		vGroup.addGroup(gl.createParallelGroup(Alignment.BASELINE).addComponent(globalSend).addComponent(paper));
		vGroup.addGroup(gl.createParallelGroup(Alignment.BASELINE).addComponent(whom).addComponent(whomSend).addComponent(close));
		
		gl.setVerticalGroup(vGroup);
		
		p.setLayout(gl);
		p.setBackground(cc.getColor());
		p.setBorder(cb3);
		
		add(p);
		
		setSize(470, 345);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chat();
	}
}
