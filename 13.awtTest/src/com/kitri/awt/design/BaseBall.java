package com.kitri.awt.design;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class BaseBall extends Frame {
	
	TextArea ta = new TextArea();
	
	Label l = new Label("숫자", Label.CENTER);
	TextField tf = new TextField();
	
	Button newG = new Button("새게임");
	Button clear = new Button("지우기");
	Button dap = new Button("명암");
	Button fontC = new Button("글자색");
	Button exit = new Button("종료");
	
	Panel pE = new Panel();
	Panel pS = new Panel();
	Panel p = new Panel();
	
	
	public BaseBall() {
		super("BaseBall !!!");
		
		setLayout(new BorderLayout(5, 5));
		
		p.setLayout(new BorderLayout());
		
		pE.setLayout(new GridLayout(5, 1, 10, 10));
		pE.add(newG);
		pE.add(clear);
		pE.add(dap);
		pE.add(fontC);
		pE.add(exit);
		
		pS.setLayout(new BorderLayout(5, 0));
		pS.add(l, "West");
		pS.add(tf, "Center");
		
		p.add(ta, "Center");
		p.add(pS, "South");
		add(p, "Center");
		add(pE, "East");
		
		setBounds(300, 200, 400, 300);
		setResizable(true);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new BaseBall();
	}
}
