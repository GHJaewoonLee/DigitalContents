package com.kitri.swing;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


// BorderFactory를 사용하면 여러 Border를 객체 생성 없이 사용할 수 있음.

@SuppressWarnings("serial")
public class BorderFactoryTest extends JFrame {

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	JButton btn1 = new JButton("Test1");
	JButton btn2 = new JButton("Test2");
	JButton btn3 = new JButton("Test3");
	JButton btn4 = new JButton("Test4");
	

	public BorderFactoryTest() {
		super("BorderFactoryTest");
		
		p1.setBorder(BorderFactory.createBevelBorder(0/*BevelBorder.RAISED*/));
		p1.add(btn1);
		p1.add(btn2);
		
		p2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		p2.add(btn3);
		p2.add(btn4);
		
		add(p1, "North");
		add(p2, "South");
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new BorderFactoryTest();
	}
}
