package com.kitri.net.chat;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;


@SuppressWarnings("serial")
public class Login extends JFrame {

	JTextField ipTF = new JTextField();
	JTextField nameTF = new JTextField();
	
	JLabel ip = new JLabel("I        P    :  ");
	JLabel chatName = new JLabel("대화명   :  ");
	
	JButton ok = new JButton("확 인");
	JButton cancel = new JButton("취 소");
	
	EtchedBorder eb = new EtchedBorder(EtchedBorder.RAISED);
	EmptyBorder emb1 = new EmptyBorder(5, 5, 5, 5);
	EmptyBorder emb2 = new EmptyBorder(5, 20, 5, 5);
	
	JColorChooser cc = new JColorChooser();
	
	JPanel p0 = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	
	
	public Login() {
		super("Login!!");
		
		cc.setColor(JColorChooser.showDialog(this, "배경 색상 선택", getBackground()));
		
		p5.setLayout(new BorderLayout(10, 0));
		p5.setBackground(cc.getColor());
		p5.add(ip, "West");
		p5.add(ipTF, "Center");
		
		p4.setLayout(new BorderLayout(10, 0));
		p4.setBackground(cc.getColor());
		p4.add(chatName, "West");
		p4.add(nameTF, "Center");
		
		p3.setLayout(new GridLayout(2, 1, 0, 5));
		p3.setBorder(emb2);		
		p3.setBackground(cc.getColor());
		p3.add(p5);
		p3.add(p4);
		
		p2.setLayout(new FlowLayout());
		p2.setBackground(cc.getColor());
		p2.setBorder(eb);
		p2.add(ok);
		p2.add(Box.createHorizontalStrut(20));
		p2.add(cancel);
		
		p1.setLayout(new BorderLayout(10, 10));
		p1.setBorder(eb);
		p1.setBackground(cc.getColor());
		p1.add(p3,"Center");
		p1.add(p2, "South");
		
		p0.setLayout(new BorderLayout());
		p0.setBorder(emb1);
		p0.setBackground(cc.getColor());
		p0.add(p1, "Center");
		
		add(p0, "Center");
		
		setSize(250, 150);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Login();
	}
}
