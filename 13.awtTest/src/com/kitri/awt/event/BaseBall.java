package com.kitri.awt.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;


@SuppressWarnings("serial")
public class BaseBall extends Frame {
	
	TextArea ta = new TextArea();
	
	Label l = new Label("숫자", Label.CENTER);
	TextField tf = new TextField();
	
	Button newG = new Button("새게임");
	Button clear = new Button("지우기");
	Button dap = new Button("정답");
	Button fontC = new Button("글자색");
	Button exit = new Button("종료");
	
	Panel pE = new Panel();
	Panel pCS = new Panel();
	Panel pC = new Panel();
	
	BaseBallController baseBallController;
	FontColorChooser fontColorChooser = new FontColorChooser();
	
	
	public BaseBall() {
		super("BaseBall !!!");
		
		setLayout(new BorderLayout(10, 0));
		
		pC.setLayout(new BorderLayout(0, 10));
		
		pE.setLayout(new GridLayout(5, 1, 0, 10));
		pE.add(newG);
		pE.add(clear);
		pE.add(dap);
		pE.add(fontC);
		pE.add(exit);
		 
		pCS.setLayout(new BorderLayout(10, 0));
		pCS.add(l, "West");
		pCS.add(tf, "Center");
		
		ta.setFont(new Font("굴림", Font.BOLD, 15));
		ta.setEditable(false);
		pC.add(ta, "Center");
		pC.add(pCS, "South");
		add(pC, "Center");
		add(pE, "East");
		
		setBounds(300, 200, 500, 400);
		setVisible(true);
		
		
		baseBallController = new BaseBallController(this);
		
		// BaseBall  Class Event
		newG.addActionListener(baseBallController);
		clear.addActionListener(baseBallController);
		dap.addActionListener(baseBallController);
		fontC.addActionListener(baseBallController);
		exit.addActionListener(baseBallController);
		tf.addActionListener(baseBallController);
		
		addWindowListener(baseBallController);
		
		// FontColorChooser  Class Event
		fontColorChooser.sbR.addAdjustmentListener(baseBallController);
		fontColorChooser.sbG.addAdjustmentListener(baseBallController);
		fontColorChooser.sbB.addAdjustmentListener(baseBallController);
		fontColorChooser.ok.addActionListener(baseBallController);
		
		//fontColorChooser.addWindowListener(baseBallController);
	}
	
	
	public static void main(String[] args) {
		new BaseBall();
	}
}
