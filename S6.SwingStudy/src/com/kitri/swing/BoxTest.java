package com.kitri.swing;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class BoxTest extends JFrame {

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	
	JButton btn1 = new JButton("Test1");
	JButton btn2 = new JButton("Test2");
	JButton btn3 = new JButton("Test3");
	JButton btn4 = new JButton("Test4");
	JButton btn5 = new JButton("Test5");
	JButton btn6 = new JButton("Test6");
	
	Box b1 = Box.createHorizontalBox();
	Box b2 = Box.createVerticalBox();
	
	
	public BoxTest() {
		super("BoxTest");
		
		p1.add(btn1);
		// 임의의 크기의 보이지 않는 공간을 생성
		p1.add(Box.createRigidArea(new Dimension(150, 0)));
		p1.add(btn2);
		
		b1.add(btn3);
		b1.add(btn4);
		p2.add(b1);
		
		b2.add(btn5);
		b2.add(btn6);
		p3.add(b2);
		
		add(p1, "North");
		add(p2, "Center");
		add(p3, "South");
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new BoxTest();
	}
}
