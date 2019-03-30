package com.kitri.net.chat;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;


@SuppressWarnings("serial")
public class Chat extends JFrame{

	JTextArea area = new JTextArea();
	JList<String> list = new JList<String>();
	
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
	
	JPanel p0 = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	JPanel p7 = new JPanel();
	JPanel p8 = new JPanel();
	
		
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
		
		
		p8.setLayout(new BorderLayout());
		p8.setBackground(cc.getColor());
		whom.setBorder(emb3);
		whom.setBackground(cc.getColor());
		whom.setForeground(cc.getColor().darker());
		p8.add(whom, "West");
		whomSend.setBorder(ebR);
		p8.add(whomSend, "Center");

		p7.setLayout(new GridLayout(2, 1, 0, 5));
		p7.setBackground(cc.getColor());
		globalSend.setBorder(ebR);
		p7.add(globalSend);
		p7.add(p8);
				
		p6.setLayout(new BorderLayout(0, 5));
		p6.setBackground(cc.getColor());
		area.setBorder(ebR);
		p6.add(area, "Center");
		p6.add(p7, "South");
		
		p5.setLayout(new GridLayout(3, 1, 0, 5));
		p5.setBackground(cc.getColor());
		rename.setBorder(cb2);
		p5.add(rename);
		paper.setBorder(cb2);
		p5.add(paper);
		close.setBorder(cb2);
		p5.add(close);
		
		p4.setLayout(new BorderLayout(0, 5));
		p4.setBackground(cc.getColor());
		list.setBorder(cb);
		p4.add(list, "Center");
		p4.add(p5, "South");
		
		p3.setLayout(new BorderLayout());
		p3.setBackground(cc.getColor());
		p3.add(p4);
		
		p2.setLayout(new BorderLayout(5, 0));
		p2.setBackground(cc.getColor());
		p2.setBorder(emb1);
		p2.add(p3, "East");
		p2.add(p6, "Center");
		
		p1.setLayout(new BorderLayout(5, 5));
		p1.setBorder(ebR);
		p1.add(p2);
		
		p0.setLayout(new BorderLayout());
		p0.setBackground(cc.getColor());
		p0.setBorder(emb1);
		p0.add(p1, "Center");
		
		add(p0, "Center");
		
		setSize(470, 345);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chat();
	}
}
