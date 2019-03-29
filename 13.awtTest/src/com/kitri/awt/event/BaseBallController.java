package com.kitri.awt.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


public class BaseBallController implements ActionListener, AdjustmentListener {

	BaseBall baseBall;
	BaseBallService baseBallService;
	
	
	public BaseBallController(BaseBall baseball) {
		this.baseBall = baseball;
		baseBallService = new BaseBallService(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if (ob == baseBall.newG) {
			baseBallService.newGame();
		} else if (ob == baseBall.clear) {
			baseBallService.clear();
		} else if (ob == baseBall.dap) {
			baseBallService.showDap();
		} else if (ob == baseBall.fontC) {
			baseBallService.fontColorChange();
		} else if (ob == baseBall.exit) {
			baseBallService.exit();
		} else if (ob == baseBall.tf) {
			baseBallService.game();
		} else if (ob == baseBall.fontColorChooser.ok) {
			baseBallService.selectColor();
		}
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		baseBallService.changeColor();
	}
}
