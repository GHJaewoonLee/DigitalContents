package com.kitri.awt.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;


@SuppressWarnings("serial")
public class FontColorChooser extends Frame {

	Label lR = new Label("빨강", Label.CENTER);
	Label lG = new Label("초록", Label.CENTER);
	Label lB = new Label("파랑", Label.CENTER);
	
	// Scrollbar의 최대값 : 막대 두께 + 값의 최대 범위, 중간 = (최대값 - 두께) / 2
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265); 
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265); 
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265); 
	
	Panel colorP = new Panel();
	Label colorL = new Label();
	Button ok = new Button("선택");
	
	Panel p11 = new Panel();
	Panel p12 = new Panel();
	Panel p13 = new Panel();
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p21 = new Panel();
	
	
	public FontColorChooser() {
		super("Color Selector Chooser !!!");
		
		setLayout(new GridLayout(1, 2, 10, 0));
		
		p11.setLayout(new BorderLayout(10, 0));
		p11.add(lR, "West");
		p11.add(sbR, "Center");
		
		p12.setLayout(new BorderLayout(10, 0));
		p12.add(lG, "West");
		p12.add(sbG, "Center");
		
		p13.setLayout(new BorderLayout(10, 0));
		p13.add(lB, "West");
		p13.add(sbB, "Center");
		
		//p1.setLayout(new GridLayout(3, 1, 0, 10));
		p1.setLayout(new GridLayout(5, 1, 0, 20));
		p1.add(new Label());
		p1.add(p11);
		p1.add(p12);
		p1.add(p13);
		
		p21.setLayout(new BorderLayout(10, 0));
		p21.add(colorL, "Center");
		p21.add(ok, "East");
		
		p2.setLayout(new BorderLayout(0, 10));
		p2.add(colorP, "Center");
		p2.add(p21, "South");
		
		add(p1, "West");
		add(p2, "East");
		
		setBounds(300, 200, 500, 400);
	}
}