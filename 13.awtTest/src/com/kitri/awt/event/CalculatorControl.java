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
			calculatorService.exit(); // ���α׷� ����
		} else {
			char ch = ((Button)ob).getLabel().charAt(0);
			
			if (Character.isDigit(ch)) {
				calculatorService.processNumbers((Button)ob); // ������ ��
			} else {
				calculatorService.processOperators((Button)ob); // �������� ��
			}
			
		}	
	}
}
