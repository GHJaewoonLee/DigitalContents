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


// CheckBox Group ���� �� Choice �׸� ����


@SuppressWarnings("serial")
public class ItemTest extends Frame {
	
	Panel pS = new Panel();
	Panel pN = new Panel();
	
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox mor = new Checkbox("��ħ", cg, true);
	Checkbox aft = new Checkbox("����", cg, false);
	Checkbox eve = new Checkbox("����", cg, false);
	
	Checkbox app = new Checkbox("���", true);
	Checkbox banana = new Checkbox("�ٳ���", false);
	Checkbox strawberry = new Checkbox("����", false);
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	
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
		
		// Event ó�� �κ��� �и�
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
