package com.kitri.net.chat;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;


@SuppressWarnings("serial")
public class Paper extends JFrame {

	JLabel f = new JLabel("From : ");
	JLabel t = new JLabel("T o : ");
	
	JTextField from = new JTextField();
	JTextField to = new JTextField();
	
	JTextArea letter = new JTextArea();
	
	JButton send = new JButton("보내기");
	JButton cancel = new JButton("취  소");
	
	EtchedBorder ebL = new EtchedBorder(EtchedBorder.LOWERED);
	EmptyBorder emb1 = new EmptyBorder(5, 5, 5, 5);
	EmptyBorder emb2 = new EmptyBorder(0, 10, 0, 10);
	EmptyBorder emb3 = new EmptyBorder(0, 0, 0, 10);
	EmptyBorder emb4 = new EmptyBorder(0, 15, 0, 15);
	BevelBorder bbL = new BevelBorder(BevelBorder.RAISED);
	CompoundBorder cb1 = new CompoundBorder(ebL, emb1);
	CompoundBorder cb2 = new CompoundBorder(bbL, emb4);
	
	JColorChooser cc = new JColorChooser();
	
	JPanel p0 = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	JPanel p7 = new JPanel();
	
	GroupLayout gl = new GroupLayout(p7);
	
	
	public Paper() {
		super("쪽지보내기~~~");
		
		cc.setColor(JColorChooser.showDialog(this, "배경 색상 선택", getBackground()));
		
		gl.setAutoCreateGaps(false);
		gl.setAutoCreateContainerGaps(false);
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(send).addGap(5).addComponent(cancel));
		gl.setVerticalGroup(gl.createSequentialGroup().addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(send).addComponent(cancel)));
		
		cancel.setBorder(cb2);
		send.setBorder(cb2);
		p7.setLayout(gl);
		p7.setBackground(cc.getColor());
		p7.setBorder(ebL);
		
		p6.setBackground(cc.getColor());
		p6.add(p7);
		
		p5.setLayout(new BorderLayout());
		p5.setBackground(cc.getColor());
		t.setBorder(emb3);
		p5.add(t, "West");
		to.setBorder(emb2);
		to.setEditable(false);
		to.setBackground(cc.getColor().darker());
		p5.add(to, "Center");
		
		p4.setLayout(new BorderLayout());
		p4.setBackground(cc.getColor());
		f.setBorder(emb3);
		p4.add(f, "West");
		from.setBorder(emb2);
		from.setEditable(false);
		from.setBackground(cc.getColor().darker());
		p4.add(from, "Center");
				
		p3.setLayout(new GridLayout(1, 2, 15, 0));
		p3.setBackground(cc.getColor());
		p3.setBorder(emb2);
		p3.add(p4);
		p3.add(p5);
		
		p2.setLayout(new BorderLayout(5, 5));
		p2.setBackground(cc.getColor());
		letter.setBorder(ebL);
		p2.add(letter, "Center");
		p2.add(p3, "North");
		p2.add(p6, "South");
		
		p1.setLayout(new BorderLayout());
		p1.setBackground(cc.getColor());
		p1.setBorder(cb1);
		p1.add(p2, "Center");
		
		p0.setLayout(new BorderLayout());
		p0.setBackground(cc.getColor());
		p0.setBorder(emb1);
		p0.add(p1, "Center");
		
		add(p0, "Center");
		
		setSize(300, 305);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Paper();
	}
}
