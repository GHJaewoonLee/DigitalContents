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
	
	Button exit = new Button("����");
	
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
		
		// Exit : ���α׷� ����
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
// Button : Ŭ���� �̺�Ʈ
// TextField : ����Ű �Է½� �̺�Ʈ

// <AdjustmentEvent>
// Scrollbar : ���븦 ������ �� �̺�Ʈ

// <FocusEvent>
// component�� focus�� ��ų� �Ҿ��� ��

// <ItemEvent>
// item�� ���õǰų� ���� �Ǿ��� �� (Choice, CheckBox, List, ...)

// <KeyEvent>
// Ű���带 �Է����� ��

// <MouseEvent>
// ���콺 �����Ͱ� ���ų� �����ų�
// ���콺�� Ŭ���ϰų� ������ �ְų� ������ ��

// <MouseMotionEvent>
// ���콺�� ������ ��, �巡�� �� ��, ���콺 ��

// <TextEvent>

// <WindowAdapter, WindowEvent>


// <Event Listener>
// �ൿ -> Component -> Event �߻� -> ó�� 