package com.kitri.net.chat;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;


@SuppressWarnings("serial")
public class Rename extends JFrame {

	JLabel oldN = new JLabel("Old Name : ");
	JLabel newN = new JLabel("New Name : ");
	
	JTextField oldName = new JTextField();
	JTextField newName = new JTextField();
	
	JButton ok = new JButton("변 경");
	JButton cancel = new JButton("취 소");
	
	EtchedBorder ebR = new EtchedBorder(EtchedBorder.RAISED);
	EtchedBorder ebL = new EtchedBorder(EtchedBorder.LOWERED);
	EmptyBorder emb1 = new EmptyBorder(5, 5, 5, 5);
	EmptyBorder emb2 = new EmptyBorder(0, 15, 0, 15);
	EmptyBorder emb3 = new EmptyBorder(5, 15, 5, 5);
	BevelBorder bbL = new BevelBorder(BevelBorder.RAISED);
	CompoundBorder cb = new CompoundBorder(bbL, emb2);
	
	JColorChooser cc = new JColorChooser();
	
	JPanel p0 = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	
	GroupLayout gl = new GroupLayout(p3);
	
	
	public Rename() {
		super("대화명 변경");
		
		cc.setColor(JColorChooser.showDialog(this, "배경 색상 선택", getBackground()));
		
		p6.setLayout(new BorderLayout(15, 0));
		p6.setBackground(cc.getColor());
		p6.add(oldN, "West");
		oldName.setBackground(cc.getColor());
		oldName.setBorder(null);
		oldName.setEditable(false);
		p6.add(oldName, "Center");
		
		p5.setLayout(new BorderLayout(10, 0));
		p5.setBackground(cc.getColor());
		p5.add(newN, "West");
		p5.add(newName, "Center");
		
		p4.setLayout(new GridLayout(2, 1, 0, 5));
		p4.setBackground(cc.getColor());
		p4.setBorder(emb3);		
		p4.add(p6);
		p4.add(p5);
		
		gl.setAutoCreateGaps(false);
		gl.setAutoCreateContainerGaps(false);
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(ok).addGap(5).addComponent(cancel));
		gl.setVerticalGroup(gl.createSequentialGroup().addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(ok).addComponent(cancel)));
		
		ok.setBorder(cb);
		cancel.setBorder(cb);
		p3.setLayout(gl);
		p3.setBackground(cc.getColor());
		p3.setBorder(ebL);
		
		p2.setBackground(cc.getColor());
		p2.add(p3);
		
		p1.setLayout(new BorderLayout(10, 5));
		p1.setBackground(cc.getColor());
		p1.setBorder(ebR);
		p1.add(p4,"Center");
		p1.add(p2, "South");
		
		p0.setLayout(new BorderLayout());
		
		p0.setBorder(emb1);
		p0.add(p1, "Center");
		
		add(p0, "Center");
		p0.setBackground(cc.getColor());
		setSize(250, 150);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Rename();
	}
}
