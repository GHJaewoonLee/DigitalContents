package com.kitri.awt.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class ListTest extends Frame implements ActionListener {
	
	// 다중선택 불가 상태
	List listL = new List();
	List listR = new List(0, true);
	
	Button btR = new Button("▷");
	Button btRAll = new Button("▶");
	Button btL = new Button("◁");
	Button btLAll = new Button("◀");
	
	TextField tfL = new TextField();
	TextField tfR = new TextField();
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	Font f = new Font("굴림", Font.BOLD, 20);
	
	
	public ListTest() {
		super("List Test !!!");
		
		setLayout(new GridLayout(1, 3, 10, 0));
		
		p1.setLayout(new BorderLayout(0, 10));
		p1.add(listL, "Center");
		p1.add(tfL, "South");
		
		btR.setFont(f);
		btRAll.setFont(f);
		btL.setFont(f);
		btLAll.setFont(f);
		
		//p2.setLayout(new GridLayout(4, 1, 0, 20));
		
		p2.setLayout(new GridLayout(6, 1, 0, 20));
		p2.add(new Label(""));
		p2.add(btR);
		p2.add(btRAll);
		p2.add(btL);
		p2.add(btLAll);
		
		p3.setLayout(new BorderLayout(0, 10));
		p3.add(listR, "Center");
		p3.add(tfR, "South");
		
		add(p1);
		add(p2);
		add(p3);
		
		setBounds(300, 200, 300, 500);
		setVisible(true);
		
		
		tfL.addActionListener(this);
		tfR.addActionListener(this);
		btR.addActionListener(this);
		btRAll.addActionListener(this);
		btL.addActionListener(this);
		btLAll.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new ListTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if (ob == tfL) {
			String str = tfL.getText().trim();
			if (!str.isEmpty()) {
				listL.add(str);
			}
			tfL.setText("");
		} else if (ob == tfR) {
			String str = tfR.getText().trim();
			if (!str.isEmpty()) {
				listR.add(str);
			}
			tfR.setText("");
		} else if (ob == btR) {
			String str = listL.getSelectedItem();
			if (str != null) {
				listR.add(str);
				listL.remove(listL.getSelectedIndex());
			}
		} else if (ob == btRAll) {
			int count = listL.getItemCount();
			String str;
			for (int i = 0; i < count; i++) {
				str = listL.getItem(i);
				listR.add(str);
			}
			//listL.removeAll();
			for (int i = (count - 1); i >= 0; i--) {
				listL.remove(i);
			}
		} else if (ob == btL) {
			String str = listR.getSelectedItem();
			if (str != null) {
				listL.add(str);
				listR.remove(listR.getSelectedIndex());
			}
		} else if (ob == btLAll) {
			String s[] = listR.getSelectedItems(); 
			int index[] = listR.getSelectedIndexes();
					
			for (int i = 0; i < index.length; i++) {
				listL.add(s[i]);
			}
			
			for (int i = (index.length - 1); i >= 0; i--) {
				listR.remove(index[i]);
			}
		} 
	}
}
