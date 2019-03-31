package com.kitri.net.chat;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
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
	BevelBorder bbL = new BevelBorder(BevelBorder.RAISED);
	CompoundBorder cb1 = new CompoundBorder(bbL, emb2);
	CompoundBorder cb2 = new CompoundBorder(emb1, ebR);
	
	JColorChooser cc = new JColorChooser();
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	
	GroupLayout gl1 = new GroupLayout(p2);
	GroupLayout gl2 = new GroupLayout(p3);
	GroupLayout.SequentialGroup hGroup = gl2.createSequentialGroup();
	GroupLayout.SequentialGroup vGroup = gl2.createSequentialGroup();
	
	GroupLayout gl3 = new GroupLayout(p1);
	GroupLayout.SequentialGroup hGroup2 = gl3.createSequentialGroup();
	GroupLayout.SequentialGroup vGroup2 = gl3.createSequentialGroup();
	
	public Rename() {
		super("대화명 변경");
		
		cc.setColor(JColorChooser.showDialog(this, "배경 색상 선택", getBackground()));
		
		oldName.setBackground(cc.getColor());
		oldName.setBorder(null);
		oldName.setEditable(false);

		gl2.setAutoCreateGaps(true);
		gl2.setAutoCreateContainerGaps(true);
		hGroup.addGroup(gl2.createParallelGroup().addComponent(oldN).addComponent(newN));
		hGroup.addGroup(gl2.createParallelGroup().addComponent(oldName).addComponent(newName));
		gl2.setHorizontalGroup(hGroup);
		vGroup.addGroup(gl2.createParallelGroup(Alignment.BASELINE).addComponent(oldN).addComponent(oldName));
		vGroup.addGroup(gl2.createParallelGroup(Alignment.BASELINE).addComponent(newN).addComponent(newName));
		gl2.setVerticalGroup(vGroup);
		
		p3.setLayout(gl2);
		p3.setBackground(cc.getColor());
		
		ok.setBorder(cb1);
		cancel.setBorder(cb1);
		gl1.setAutoCreateGaps(true);
		gl1.setAutoCreateContainerGaps(false);
		gl1.setHorizontalGroup(gl1.createSequentialGroup().addComponent(ok).addComponent(cancel));
		gl1.setVerticalGroup(gl1.createSequentialGroup().addGroup(gl1.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(ok).addComponent(cancel)));
		
		p2.setLayout(gl1);
		p2.setBackground(cc.getColor());
		p2.setBorder(ebL);
		
		gl3.setAutoCreateGaps(false);
		gl3.setAutoCreateContainerGaps(false);
		hGroup2.addGroup(gl3.createParallelGroup().addComponent(p3).addComponent(p2, Alignment.CENTER));
		gl3.setHorizontalGroup(hGroup2);
		vGroup2.addGroup(gl3.createParallelGroup().addComponent(p3, Alignment.CENTER));
		vGroup2.addGroup(gl3.createParallelGroup().addComponent(p2, Alignment.CENTER));
		gl3.setVerticalGroup(vGroup2);
		
		p1.setLayout(gl3);
		p1.setBackground(cc.getColor());
		p1.setBorder(cb2);
		
		add(p1);
		
		setSize(250, 150);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Rename();
	}
}
