package com.kitri.awt.event;

import java.awt.Button;
import java.awt.Label;


public class CalculatorService {

	CalculatorControl calculatorControl;
	private Calculator calculator; 

	private Label labelNum;
	private Label labelOperator;
	
	private double first, second;
	private boolean isOperation = false;
	private boolean isFirstOperation = true;
	
		
	public CalculatorService(CalculatorControl calculatorControl) {
		this.calculatorControl = calculatorControl;
		this.calculator = calculatorControl.calculator;
		
		labelNum = calculator.numL;
		labelOperator = calculator.operL;
	}

	
	// 숫자일 때
	public void processNumbers(Button b) {
		if (isOperation) {
			labelNum.setText("");
			
			if (labelOperator.getText().equals("")) {
				first = second = 0;
				isFirstOperation = true;
			}
			
			if (!isFirstOperation) {
				first = second;
			}
			
			isOperation = false;
		}
		
		if (labelNum.getText().equals("0")) {
			labelNum.setText(((Button)b).getLabel());
		} else {
			labelNum.setText(labelNum.getText() + ((Button)b).getLabel());
		}
	}
	
	// 연산기호일 때
	public void processOperators(Button b) {
		char operator = b.getLabel().charAt(0);
		
		switch (operator) {
			case '+' : 
			case '-' :
			case '*' :
			case '/' : if (isOperation) {
						   first = second;
						   labelOperator.setText(b.getLabel());
						   break;
					   }
				
					   if (!labelOperator.getText().isEmpty()) {
						   second = Double.parseDouble(labelNum.getText());
						   second = calcTwoNumber(first, labelOperator.getText().charAt(0), second);
						   labelNum.setText("" + second);
						   labelOperator.setText(b.getLabel());
						   break;
					   }
				
					   first = Double.parseDouble(labelNum.getText());
					   labelOperator.setText(b.getLabel());
					   isOperation = true;
					   break;
					   
			case '=' : if (labelOperator.getText().isEmpty()) {
						   isOperation = true;
						   break;
					   }
				
					   second = Double.parseDouble(labelNum.getText());
					   second = calcTwoNumber(first, labelOperator.getText().charAt(0), second);
					   labelNum.setText("" + second);
					   labelOperator.setText("");
					   break;
			
			case 'C' : labelNum.setText("0");
					   labelOperator.setText("");
					   first = second = 0;
					   isOperation = false;
					   isFirstOperation = true;
					   break;
		}
	}

	// 종료
	public void exit() {
		System.exit(0);
	}

	
	// 두 수를 계산
	private double calcTwoNumber(double first, char ch, double second) {
		double result = 0;
		
		switch (ch) {
			case '+' : result =  first + second; break;
			case '-' : result =  first - second; break;
			case '*' : result =  first * second; break;
			case '/' : result =  first / second; break;
			default : result = 0;
		}
		
		isOperation = true;
		isFirstOperation = false;
		return result;
	}
}
