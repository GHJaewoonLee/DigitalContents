package com.kitri.awt.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


@SuppressWarnings("serial")
public class Calculator extends Frame implements MouseListener {

	Label numL = new Label();
	Label operL = new Label();
	
	Button exit = new Button("종료");
	
	Button[] btn = new Button[16];
	char[] btnL = {'7', '8', '9', '+', '4', '5', '6', '-', '1', '2', '3', '*', '0', 'C', '=', '/'};
	
	Panel pN = new Panel();
	Panel pC = new Panel();
	
	Font f = new Font(Font.SANS_SERIF, Font.BOLD, 15);
	int color = (int)(Math.random() * 256);
	
	int first, second; //
	boolean isOperation = false;
	
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
			btn[i].setBackground(new Color((color + i + 160) % 256, (color + i + 40) % 256, (color + i) % 256));
			pC.add(btn[i]);
		}
		
		add(pN, "North");
		add(pC, "Center");
		add(exit, "South");
		
		setBounds(300, 200, 400, 300);
		setVisible(true);
		
		
		for (int i = 0; i < btn.length; i++) {
			btn[i].addMouseListener(this);
		}
		
		exit.addMouseListener(this);
	}


	public static void main(String[] args) {
		new Calculator();
	}

	//
	@Override
	public void mouseClicked(MouseEvent e) {
		Component c = e.getComponent();
		
		// Exit : 프로그램 종료
		if (c.equals(exit)) {
			System.exit(0);
		}
		
		String s = ((Button)c).getLabel();		
		char ch = s.charAt(0);
		
		if (Character.isDigit(ch)) {
			if(isOperation) {
				numL.setText("");
				isOperation = false;
			}
			
			if (!numL.getText().equals("0")) {
				numL.setText(numL.getText() + ((Button)c).getLabel());
			}
		} else {
			switch (ch) {
				case '+' : 
				case '-' :
				case '*' :
				case '/' : if (!operL.getText().isEmpty()) {
							   second = Integer.parseInt(numL.getText());
							   first = calcTwoNumber(first, operL.getText().charAt(0), second);
							   numL.setText("" + first);
							   operL.setText(((Button)c).getLabel());
							   isOperation = true;
							   break;
						   }
					
						   first = Integer.parseInt(numL.getText());
						   operL.setText(((Button)c).getLabel());
						   isOperation = true;
						   break;
						   
				case '=' : if (numL.getText().isEmpty() || operL.getText().isEmpty()) {
							   isOperation = true;
							   break;
						   }				
					
						   second = Integer.parseInt(numL.getText());
						   second = calcTwoNumber(first, operL.getText().charAt(0), second);
						   numL.setText("" + second);
						   operL.setText("");
						   isOperation = true;
						   break;
				
				case 'C' : numL.setText("");
						   operL.setText("");
						   first = second = 0;
						   isOperation = false;
						   break;
			}
		}
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public int calcTwoNumber(int first, char ch, int second) {
		int result = 0;
		
		switch (ch) {
			case '+' : result =  first + second; break;
			case '-' : result =  first - second; break;
			case '*' : result =  first * second; break;
			case '/' : result =  first / second; break;
			default : return second;
		}
		
		return result;
	}
}

// <ActionEvent>
// Button : 클릭시 이벤트
// TextField : 엔터키 입력시 이벤트

// <AdjustmentEvent>
// Scrollbar : 막대를 움직일 시 이벤트

// <FocusEvent>
// component에 focus를 얻거나 잃었을 때

// <ItemEvent>
// item이 선택되거나 비선택 되었을 때 (Choice, CheckBox, List, ...)

// <KeyEvent>
// 키보드를 입력했을 때

// <MouseEvent>
// 마우스 포인터가 들어가거나 나가거나
// 마우스를 클릭하거나 누르고 있거나 떼었을 때

// <MouseMotionEvent>
// 마우스가 움직일 때, 드래그 할 때, 마우스 휠

// <TextEvent>

// <WindowAdapter, WindowEvent>


// <Event Listener>
// 행동 -> Component -> Event 발생 -> 처리 