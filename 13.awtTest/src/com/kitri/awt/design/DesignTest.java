package com.kitri.awt.design;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.plaf.FontUIResource;


// 1. Frame ���
// 2. ����ο� �ʿ��� ��ü ����
// 3. ��ġ�ο��� design (Component ��ġ)
// 4. �۾��� �� -> ��
// 5. ��� �۾� �Ϸ� �Ŀ� setVisible


public class DesignTest extends Frame {
	// �����
	
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	Label l = new Label("�Է�", Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("����");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	
	Font f = new Font(Font.SANS_SERIF, Font.BOLD, 15);
	
	public DesignTest() {
		// ��ġ��

		super("Design Test !!!");
		
		setLayout(new BorderLayout(0, 5));
		
		pN.setLayout(new BorderLayout(5, 0));
		
		l.setBackground(Color.BLUE);
		l.setForeground(Color.RED);
		l.setFont(f);
		
		send.setFont(f);
		exit.setFont(f);
		
		pN.add(l, "West");
		pN.add(tf, "Center");
		pN.add(send, "East");

		ch.addItem("����");
		ch.addItem("���, ��õ");
		ch.addItem("����");
		ch.addItem("��õ");

		pS.setLayout(new GridLayout(1, 2, 5, 0));
		pS.add(ch);
		pS.add(exit);
		
		add(pN, "North");
		add(ta, "Center");
		add(pS, "South");
		
		setBounds(300, 200, 300, 400);
//		setLocation(300, 200);
		setSize(300, 400);
		setResizable(false);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new DesignTest();
	}
}
