package com.kitri.awt.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;


@SuppressWarnings("serial")
public class Calculator extends Frame {

	Label numL = new Label();
	Label operL = new Label();
	
	Button exit = new Button("종료");
	
	Button[] btn = new Button[16];
	char[] btnL = {'7', '8', '9', '+', '4', '5', '6', '-', '1', '2', '3', '*', '0', 'C', '=', '/'};
	
	Panel pN = new Panel();
	Panel pC = new Panel();
	
	Font f = new Font(Font.SANS_SERIF, Font.BOLD, 15);
	//int color = (int)(Math.random() * 256); // 그라데이션
	
	CalculatorControl calculatorControl;
	
	
	public Calculator() {
		super("Calculator !!!");
		
		setLayout(new BorderLayout());
		
		numL.setBackground(Color.LIGHT_GRAY);
		operL.setBackground(Color.LIGHT_GRAY);
		
		pN.setLayout(new BorderLayout(5, 0));
		numL.setText("0");
		pN.add(numL, "Center");
		pN.add(operL, "East");
		
		pC.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(String.valueOf(btnL, i, 1));
			btn[i].setFont(f);
			//btn[i].setBackground(new Color((color + i + 160) % 256, (color + i + 40) % 256, (color + i) % 256)); // 그라데이션
			pC.add(btn[i]);
		}
		
		add(pN, "North");
		add(pC, "Center");
		add(exit, "South");
		
		setBounds(300, 200, 400, 300);
		setVisible(true);
		
		// Control 객체 생성
		calculatorControl = new CalculatorControl(this);
		
		// 각 Button component에 Listener 추가
		for (int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(calculatorControl);
		}
		
		exit.addActionListener(calculatorControl);
	}


	public static void main(String[] args) {
		new Calculator();
	}
}