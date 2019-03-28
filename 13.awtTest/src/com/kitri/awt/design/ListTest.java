package com.kitri.awt.design;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;


@SuppressWarnings("serial")
public class ListTest extends Frame {
	
	List listL = new List();
	List listR = new List();
	
	Button btR = new Button("¢¹");
	Button btRAll = new Button("¢º");
	Button btL = new Button("¢·");
	Button btLAll = new Button("¢¸");
	
	TextField tfL = new TextField();
	TextField tfR = new TextField();
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	Font f = new Font("±¼¸²", Font.BOLD, 20);
	
	
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
	}
	
	public static void main(String[] args) {
		new ListTest();
	}
}
