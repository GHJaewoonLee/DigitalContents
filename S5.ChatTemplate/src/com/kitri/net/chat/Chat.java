package com.kitri.net.chat;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Chat extends JFrame{

	JTextArea area = new JTextArea();
	JList list = new JList();
	
	JTextField globalSend = new JTextField();
	JTextField whomSend = new JTextField();
	
	JLabel whom = new JLabel("�ӼӸ�");
	
	JButton rename = new JButton("��ȭ����");
	JButton paper = new JButton("����������");
	JButton close = new JButton("�� �� ��");
	
	EmptyBorder emb1 = new EmptyBorder(5, 5, 5, 5);
	
	JPanel p0 = new JPanel();
	JPanel p1 = new JPanel();
	
	public Chat() {
		
		p1.setLayout(new BorderLayout(5, 0));
		
		p0.setBorder(emb1);
		
		add(p0, "Center");
		
		setSize(600, 400);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chat();
	}
}
