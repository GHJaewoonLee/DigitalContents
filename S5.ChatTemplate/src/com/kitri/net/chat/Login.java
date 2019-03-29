package com.kitri.net.chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;


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
	
	JPanel p0 = new JPanel();
	JPanel p00 = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p11 = new JPanel();
	JPanel p12 = new JPanel();
	JPanel p3 = new JPanel();
		
	public Login() {
		super("Login!!");
		
		p11.setLayout(new BorderLayout(10, 0));
		p11.setBackground(Color.WHITE);
		p11.add(ip, "West");
		p11.add(ipTF, "Center");
		
		p12.setLayout(new BorderLayout(10, 0));
		p12.setBackground(Color.WHITE);
		p12.add(chatName, "West");
		p12.add(nameTF, "Center");
		
		p1.setLayout(new GridLayout(2, 1, 0, 5));
		p1.setBorder(emb2);		
		p1.setBackground(Color.WHITE);
		p1.add(p11);
		p1.add(p12);
		
		p3.setLayout(new FlowLayout());
		p3.setBackground(Color.WHITE);
		p3.setBorder(eb);
		p3.add(ok);
		p3.add(Box.createRigidArea(new Dimension(20, 0)));
		p3.add(cancel);
		
		p00.setLayout(new BorderLayout(10, 10));
		p00.setBorder(eb);
		p00.setBackground(Color.WHITE);
		p00.add(p1,"Center");
		p00.add(p3, "South");
		
		p0.setLayout(new BorderLayout(0, 0));
		p0.setBorder(emb1);
		p0.setBackground(Color.WHITE);
		p0.add(p00, "Center");
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
