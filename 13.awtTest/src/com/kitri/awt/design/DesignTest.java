package com.kitri.awt.design;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.plaf.FontUIResource;


// 1. Frame 상속
// 2. 선언부에 필요한 객체 생성
// 3. 배치부에서 design (Component 배치)
// 4. 작업은 소 -> 대
// 5. 모든 작업 완료 후에 setVisible


public class DesignTest extends Frame {
	// 선언부
	
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	Label l = new Label("입력", Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("전송");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	
	Font f = new Font(Font.SANS_SERIF, Font.BOLD, 15);
	
	public DesignTest() {
		// 배치부

		super("Design Test !!!");
		
		setLayout(new BorderLayout(0, 5));
		
		pN.setLayout(new BorderLayout(5, 0));
		
		l.setBackground(Color.BLUE);
		l.setForeground(Color.RED);
		l.setFont(f);
		
		send.setFont(f);
		exit.setFont(f);
		
		pN.add(l, "West");
		pN.add(tf, "Center");
		pN.add(send, "East");

		ch.addItem("서울");
		ch.addItem("경기, 인천");
		ch.addItem("강원");
		ch.addItem("춘천");

		pS.setLayout(new GridLayout(1, 2, 5, 0));
		pS.add(ch);
		pS.add(exit);
		
		add(pN, "North");
		add(ta, "Center");
		add(pS, "South");
		
		setBounds(300, 200, 300, 400);
//		setLocation(300, 200);
		setSize(300, 400);
		setResizable(false);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new DesignTest();
	}
}
