package com.kitri.awt.design;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;


public class ColorSelector extends Frame {

	Label lR = new Label("»¡°­", Label.CENTER);
	Label lG = new Label("ÃÊ·Ï", Label.CENTER);
	Label lB = new Label("ÆÄ¶û", Label.CENTER);
	
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 128, 10, 0, 255); 
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 128, 10, 0, 255); 
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 128, 10, 0, 255); 
	
	Panel colorP = new Panel();
	Label colorL = new Label();
	Button ok = new Button("È®ÀÎ");
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	Panel pW = new Panel();
	Panel pE = new Panel();
	Panel pS = new Panel();
	
	public ColorSelector() {
		super("Color Selector !!!");
		
		setLayout(new GridLayout(1, 2, 5, 0));
		
		p1.setLayout(new BorderLayout(5, 0));
		p1.add(lR, "West");
		p1.add(sbR, "Center");
		
		p2.setLayout(new BorderLayout(5, 0));
		p2.add(lG, "West");
		p2.add(sbG, "Center");
		
		p3.setLayout(new BorderLayout(5, 0));
		p3.add(lB, "West");
		p3.add(sbB, "Center");
		
		pW.setLayout(new GridLayout(3, 1, 0, 10));
		pW.add(p1);
		pW.add(p2);
		pW.add(p3);
		
		pS.setLayout(new BorderLayout(5, 0));
		pS.add(colorL, "Center");
		pS.add(ok, "East");
		
		pE.setLayout(new BorderLayout(5, 0));
		pE.add(colorP, "Center");
		pE.add(pS, "South");
		
		add(pW, "West");
		add(pE, "East");
		
		setBounds(300, 200, 400, 300);
		setResizable(true);
		setVisible(true);
	}


	public static void main(String[] args) {
		new ColorSelector();
	}
}
