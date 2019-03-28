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


// CheckBox Group 변경 시 Choice 항목도 변경


@SuppressWarnings("serial")
public class ItemTest extends Frame implements ItemListener, ActionListener {

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
				case "아침" : mor.setState(true); break;
				case "점심" : aft.setState(true); break;
				case "저녁" : eve.setState(true); break;
			}
		}
		
		Checkbox sel = cg.getSelectedCheckbox();
		String selStr = sel.getLabel();
		
		ta.setText("-- " + selStr + " --\n");
		ta.append("1. 사과 : " + eatFood(app.getState()) + "\n");
		ta.append("2. 바나나 : " + eatFood(banana.getState()) + "\n");
		ta.append("3. 딸기 : " + eatFood(strawberry.getState()) + "\n");
		
		ch.select(selStr);
	}
	
	private String eatFood(boolean flag) {
		return flag ? "먹었다." : "안 먹었다.";
	}
}
