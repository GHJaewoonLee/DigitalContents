package com.kitri.awt.design;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;


public class Calculator extends Frame {

	Label numL = new Label();
	Label operL = new Label();
	
	Button exit = new Button("Á¾·á");
	
	Button[] btn = new Button[16];
	
	char[] btnL = {'7', '8', '9', '+', '4', '5', '6', '-', '1', '2', '3', '*', '0', 'C', '=', '/'};
	
	Panel pN = new Panel();
	Panel pC = new Panel();
	
	Font f = new Font(Font.SANS_SERIF, Font.BOLD, 15);
	int color = (int)(Math.random() * 256);
	
	public Calculator() {
		super("Calculator !!!");
		
		setLayout(new BorderLayout());
		
		pN.setLayout(new BorderLayout(5, 0));
		pN.add(numL, "Center");
		pN.add(operL, "East");
		
		pC.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(String.valueOf(btnL, i, 1));
			btn[i].setFont(f);
			btn[i].setBackground(new Color((color + i*5) % 256, (color + i*4) % 256, (color + i*3) % 256));
			pC.add(btn[i]);
		}
		
		add(pN, "North");
		add(pC, "Center");
		add(exit, "South");
				
		setBounds(300, 200, 400, 300);
		setResizable(true);
		setVisible(true);
	}


	public static void main(String[] args) {
		new Calculator();
	}

}
