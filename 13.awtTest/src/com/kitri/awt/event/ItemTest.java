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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


// CheckBox Group ���� �� Choice �׸� ����


@SuppressWarnings("serial")
public class ItemTest extends Frame implements ItemListener, ActionListener {

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
		
		
		exit.addActionListener(this);
		
		mor.addItemListener(this);
		aft.addItemListener(this);
		eve.addItemListener(this);
		app.addItemListener(this);
		banana.addItemListener(this);
		strawberry.addItemListener(this);
		ch.addItemListener(this);
	}
	
	
	public static void main(String[] args) {
		new ItemTest();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource();
		
		if (ob == ch) {
			String str = ch.getSelectedItem();
			
			switch (str) {
				case "��ħ" : mor.setState(true); break;
				case "����" : aft.setState(true); break;
				case "����" : eve.setState(true); break;
			}
		}
		
		Checkbox sel = cg.getSelectedCheckbox();
		String selStr = sel.getLabel();
		
		ta.setText("-- " + selStr + " --\n");
		ta.append("1. ��� : " + eatFood(app.getState()) + "\n");
		ta.append("2. �ٳ��� : " + eatFood(banana.getState()) + "\n");
		ta.append("3. ���� : " + eatFood(strawberry.getState()) + "\n");
		
		ch.select(selStr);
	}
	
	private String eatFood(boolean flag) {
		return flag ? "�Ծ���." : "�� �Ծ���.";
	}
}
