package com.kitri.awt.design;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;


public class ListTest extends Frame {
	
	TextArea listL = new TextArea();
	TextArea listR = new TextArea();
	
	Button btR = new Button("¢¹");
	Button btRAll = new Button("¢º");
	Button btL = new Button("¢·");
	Button btLAll = new Button("¢¸");
	
	TextField tfL = new TextField();
	TextField tfR = new TextField();
	
	Panel pN1 = new Panel();
	Panel pN2 = new Panel();
	Panel pN3 = new Panel();
	
	
	public ListTest() {
		super("List Test !!!");
		
		setLayout(new GridLayout(1, 3, 10, 10));
		
		pN1.setLayout(new BorderLayout());
		pN1.add(listL, "West");
		pN1.add(tfL, "South");
		
		pN2.setLayout(new GridLayout(4, 1, 20, 20));
		pN2.add(btR);
		pN2.add(btRAll);
		pN2.add(btL);
		pN2.add(btLAll);
		
		pN3.setLayout(new BorderLayout());
		pN3.add(listR, "East");
		pN3.add(tfR, "South");
		
		add(pN1, "West");
		add(pN2, "Center");
		add(pN3, "East");
		
		setBounds(300, 200, 300, 400);
		setResizable(true);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListTest();
	}
}
