package com.kitri.awt.design;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;


public class ItemTest extends Frame {

	Panel pN = new Panel();
	Panel pN1 = new Panel();
	Panel pN2 = new Panel();
	Panel pS = new Panel();
	
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox mor = new Checkbox("아침", cg, true);
	Checkbox aft = new Checkbox("점심", cg, false);
	Checkbox eve = new Checkbox("저녁", cg, false);
	
	Checkbox app = new Checkbox("사과", true);
	Checkbox banana = new Checkbox("바나나", false);
	Checkbox strawberry = new Checkbox("딸기", false);
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	
	
	public ItemTest() {
		super("Item Test !!!");
		
		setLayout(new BorderLayout(0, 5));
		
		pN.setLayout(new GridLayout(2, 1));
		
		pN1.setLayout(new GridLayout(1, 3));
		pN1.add(mor);
		pN1.add(aft);
		pN1.add(eve);
		
		pN2.setLayout(new GridLayout(1, 3));
		pN2.add(app);
		pN2.add(banana);
		pN2.add(strawberry);

		pN.add(pN1);
		pN.add(pN2);
		
		ch.addItem(mor.getLabel());
		ch.addItem(aft.getLabel());
		ch.addItem(eve.getLabel());
		
		pS.setLayout(new BorderLayout(5, 0));
		pS.add(ch, "Center");
		pS.add(exit, "East");
		
		add(pN, "North");
		add(ta, "Center");
		add(pS, "South");
		
		setBounds(300, 200, 300, 400);
		setResizable(true);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ItemTest();
	}
}
