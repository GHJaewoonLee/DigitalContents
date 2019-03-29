package com.kitri.awt.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;


// CheckBox Group 변경 시 Choice 항목도 변경


@SuppressWarnings("serial")
public class ItemTest extends Frame {
	
	Panel pS = new Panel();
	Panel pN = new Panel();
	
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
	
	ItemLogic itemLogic;
	
	
	public ItemTest() {
		super("Item Test !!!");
		
		setLayout(new BorderLayout(0, 10));
		
		pN.setLayout(new GridLayout(2, 3, 10, 10));
		
		pN.add(mor);
		pN.add(aft);
		pN.add(eve);
		pN.add(app);
		pN.add(banana);
		pN.add(strawberry);
		
		ch.addItem(mor.getLabel());
		ch.addItem(aft.getLabel());
		ch.addItem(eve.getLabel());
		
		pS.setLayout(new BorderLayout(5, 0));
		pS.add(ch, "Center");
		pS.add(exit, "East");
		
		add(pN, "North");
		add(ta, "Center");
		add(pS, "South");
		
		setBounds(300, 200, 300, 500);
		setVisible(true);
		
		// Event 처리 부분을 분리
		itemLogic = new ItemLogic(this);
		
		exit.addActionListener(itemLogic);
		
		mor.addItemListener(itemLogic);
		aft.addItemListener(itemLogic);
		eve.addItemListener(itemLogic);
		app.addItemListener(itemLogic);
		banana.addItemListener(itemLogic);
		strawberry.addItemListener(itemLogic);
		ch.addItemListener(itemLogic);
	}
	
	
	public static void main(String[] args) {
		new ItemTest();
	}
}
