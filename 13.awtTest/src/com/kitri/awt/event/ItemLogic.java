package com.kitri.awt.event;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class ItemLogic implements ItemListener, ActionListener {
	
	ItemTest itemTest;
	
	
	public ItemLogic(ItemTest itemTest) {
		this.itemTest = itemTest;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource();
		
		if (ob == itemTest.ch) {
			String str = itemTest.ch.getSelectedItem();
			
			switch (str) {
				case "¾ÆÄ§" : itemTest.mor.setState(true); break;
				case "Á¡½É" : itemTest.aft.setState(true); break;
				case "Àú³á" : itemTest.eve.setState(true); break;
			}
		}
		
		Checkbox sel = itemTest.cg.getSelectedCheckbox();
		String selStr = sel.getLabel();
		
		itemTest.ta.setText("-- " + selStr + " --\n");
		itemTest.ta.append("1. »ç°ú : " + eatFood(itemTest.app.getState()) + "\n");
		itemTest.ta.append("2. ¹Ù³ª³ª : " + eatFood(itemTest.banana.getState()) + "\n");
		itemTest.ta.append("3. µþ±â : " + eatFood(itemTest.strawberry.getState()) + "\n");
		
		itemTest.ch.select(selStr);
	}
	
	private String eatFood(boolean flag) {
		return flag ? "¸Ô¾ú´Ù." : "¾È ¸Ô¾ú´Ù.";
	}
}
