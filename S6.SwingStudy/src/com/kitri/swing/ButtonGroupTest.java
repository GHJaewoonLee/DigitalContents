package com.kitri.swing;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


// JButton, JMenuItem, JToggleButton 들을 Group으로 묶어서 관리  

@SuppressWarnings("serial")
public class ButtonGroupTest extends JFrame {

	JPanel p1 = new JPanel();
	
	JButton btn1 = new JButton("Test1");
	JButton btn2 = new JButton("Test2");
	JButton btn3 = new JButton("Test3");
	JButton btn4 = new JButton("Test4");
	JButton btn5 = new JButton("Test5");
	JButton btn6 = new JButton("Test6");
	
	ButtonGroup bg = new ButtonGroup();
	
	public ButtonGroupTest() {
		super("ButtonGroupTest");
		
		bg.add(btn1);
		bg.add(btn2);
		bg.add(btn3);
		bg.add(btn4);
		bg.add(btn5);
		bg.add(btn6);
		
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p1.add(btn5);
		p1.add(btn6);
		
		add(p1, "Center");
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		bg.clearSelection();
	}
	

	public static void main(String[] args) {
		new ButtonGroupTest();
	}
}
