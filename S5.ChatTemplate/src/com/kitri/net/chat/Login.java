package com.kitri.net.chat;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;


@SuppressWarnings("serial")
public class Login extends JFrame {

	JTextField ipTF = new JTextField();
	JTextField nameTF = new JTextField();
	
	JLabel ip = new JLabel("I         P  : ");
	JLabel chatName = new JLabel("대화명  : ");
	
	JButton ok = new JButton("확 인");
	JButton cancel = new JButton("취 소");
	
	EtchedBorder eb = new EtchedBorder(EtchedBorder.RAISED);
	EmptyBorder emb = new EmptyBorder(5, 5, 5, 5);
	CompoundBorder cb = new CompoundBorder(emb, eb);
	
	JColorChooser cc = new JColorChooser();
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	
	GroupLayout gl = new GroupLayout(p1);
	GroupLayout gl2 = new GroupLayout(p2);
	GroupLayout.SequentialGroup hGroup = gl2.createSequentialGroup();
	GroupLayout.SequentialGroup vGroup = gl2.createSequentialGroup();
	
	public Login() {
		super("Login!!");
		
		cc.setColor(JColorChooser.showDialog(this, "배경 색상 선택", getBackground()));
		
		p3.setBorder(eb);
		p3.setBackground(cc.getColor());
		p3.add(ok);
		p3.add(Box.createHorizontalStrut(10));
		p3.add(cancel);
		
		gl2.setAutoCreateGaps(true);
		gl2.setAutoCreateContainerGaps(true);
		hGroup.addGroup(gl2.createParallelGroup().addComponent(ip).addComponent(chatName));
		hGroup.addGroup(gl2.createParallelGroup().addComponent(ipTF).addComponent(nameTF));
		gl2.setHorizontalGroup(hGroup);
		vGroup.addGroup(gl2.createParallelGroup(Alignment.BASELINE).addComponent(ip).addComponent(ipTF));
		vGroup.addGroup(gl2.createParallelGroup(Alignment.BASELINE).addComponent(chatName).addComponent(nameTF));
		gl2.setVerticalGroup(vGroup);
		
		p2.setLayout(gl2);
		p2.setBackground(cc.getColor());
		
		gl.setAutoCreateGaps(true);
		gl.setAutoCreateContainerGaps(false);
		gl.setHorizontalGroup(gl.createParallelGroup().addComponent(p2).addComponent(p3));
		gl.setVerticalGroup(gl.createParallelGroup().addGroup(gl.createSequentialGroup().addComponent(p2).addComponent(p3)));
		
		p1.setLayout(gl);
		p1.setBorder(cb);
		p1.setBackground(cc.getColor());
		
		add(p1);
		
		setSize(260, 170);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Login();
	}
}
