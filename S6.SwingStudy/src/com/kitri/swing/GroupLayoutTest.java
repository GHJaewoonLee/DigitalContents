package com.kitri.swing;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class GroupLayoutTest extends JFrame {

	JPanel p1 = new JPanel();
	
	JLabel lb1 = new JLabel("Label 1");
	JLabel lb2 = new JLabel("Label 1111");
	JButton btn1 = new JButton("Test1");
	JButton btn2 = new JButton("Test2");
	JButton btn3 = new JButton("Test3");
	
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
		
	GroupLayout gl = new GroupLayout(p1);
	GroupLayout.SequentialGroup hGroup = gl.createSequentialGroup();
	GroupLayout.SequentialGroup vGroup = gl.createSequentialGroup();
	
	
	public GroupLayoutTest() {
		super("GroupLayoutTest");
		
		// Component 사이에 자동적으로 gap을 생성
		gl.setAutoCreateGaps(true);
		// component가 Border를 건드리게 되면 자동적으로 gap을 생성
		gl.setAutoCreateContainerGaps(true);
		
		hGroup.addGroup(gl.createParallelGroup().addComponent(lb1).addComponent(lb2));
		hGroup.addGroup(gl.createParallelGroup().addComponent(tf1).addComponent(tf2));
		hGroup.addGroup(gl.createParallelGroup().addComponent(btn1).addComponent(btn2).addComponent(btn3));
		gl.setHorizontalGroup(hGroup);
		
		vGroup.addGroup(gl.createParallelGroup().addComponent(lb1).addComponent(btn1).addComponent(tf1));
		vGroup.addGroup(gl.createParallelGroup().addComponent(btn3));
		vGroup.addGroup(gl.createParallelGroup(Alignment.BASELINE).addComponent(lb2).addComponent(btn2).addComponent(tf2));
		gl.setVerticalGroup(vGroup);
		
		p1.setLayout(gl);
		add(p1);
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new GroupLayoutTest();
	}
}
