package com.kitri.net.chat;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
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
	EmptyBorder emb2 = new EmptyBorder(0, 15, 0, 15);
	BevelBorder bbL = new BevelBorder(BevelBorder.RAISED);
	CompoundBorder cb1 = new CompoundBorder(emb1, ebL);
	CompoundBorder cb2 = new CompoundBorder(bbL, emb2);
	
	JColorChooser cc = new JColorChooser();
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	
	GroupLayout gl = new GroupLayout(p2);
	GroupLayout gl2 = new GroupLayout(p3);
	GroupLayout gl3 = new GroupLayout(p1);
	GroupLayout.SequentialGroup hGroup = gl3.createSequentialGroup();
	GroupLayout.SequentialGroup vGroup = gl3.createSequentialGroup();
	
	
	public Paper() {
		super("쪽지보내기~~~");
		
		cc.setColor(JColorChooser.showDialog(this, "배경 색상 선택", getBackground()));
		
		from.setEditable(false);
		from.setBackground(cc.getColor().darker());
		to.setEditable(false);
		to.setBackground(cc.getColor().darker());
		
		gl2.setAutoCreateGaps(true);
		gl2.setAutoCreateContainerGaps(true);
		gl2.setHorizontalGroup(gl2.createSequentialGroup().addComponent(f).addComponent(from).addComponent(t).addComponent(to));
		gl2.setVerticalGroup(gl2.createSequentialGroup().addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(f).addComponent(from).addComponent(t).addComponent(to)));
		
		p3.setLayout(gl2);
		p3.setBackground(cc.getColor());
		
		cancel.setBorder(cb2);
		send.setBorder(cb2);
		
		gl.setAutoCreateGaps(false);
		gl.setAutoCreateContainerGaps(false);
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(send).addGap(5).addComponent(cancel));
		gl.setVerticalGroup(gl.createSequentialGroup().addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(send).addComponent(cancel)));
		
		p2.setLayout(gl);
		p2.setBackground(cc.getColor());
		p2.setBorder(ebL);
		
		gl3.setAutoCreateGaps(true);
		gl3.setAutoCreateContainerGaps(true);
		hGroup.addGroup(gl3.createParallelGroup().addComponent(p3).addComponent(letter).addComponent(p2, Alignment.CENTER));
		gl3.setHorizontalGroup(hGroup);
		vGroup.addGroup(gl3.createParallelGroup().addComponent(p3));
		vGroup.addGroup(gl3.createParallelGroup().addComponent(letter));
		vGroup.addGroup(gl3.createParallelGroup(Alignment.BASELINE).addComponent(p2, Alignment.CENTER));
		gl3.setVerticalGroup(vGroup);
		
		p1.setLayout(gl3);
		p1.setBackground(cc.getColor());
		p1.setBorder(cb1);
		
		add(p1);
		
		setSize(300, 305);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Paper();
	}
}
