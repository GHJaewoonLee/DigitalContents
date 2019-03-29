package com.kitri.awt.event;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorControl implements ActionListener {

	Calculator calculator;
	CalculatorService calculatorService;
	
	
	public CalculatorControl(Calculator calculator) {
		this.calculator = calculator;
		calculatorService = new CalculatorService(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if (ob == calculator.exit) {
			calculatorService.exit(); // 프로그램 종료
		} else {
			char ch = ((Button)ob).getLabel().charAt(0);
			
			if (Character.isDigit(ch)) {
				calculatorService.processNumbers((Button)ob); // 숫자일 때
			} else {
				calculatorService.processOperators((Button)ob); // 연산자일 때
			}
			
		}	
	}
}
