package com.kitri.awt.event;

import java.awt.Color;
import java.util.Random;


public class BaseBallService {

	BaseBallController baseBallController;
	private FontColorChooser fcc;
	private BaseBall bb;
	
	Random random = new Random();
	
	private int my[];
	private int com[];
	int gameLength;
	int count; 
	
	int r, g, b;
	
	public BaseBallService(BaseBallController baseBallController) {
		this.baseBallController = baseBallController;
		bb = baseBallController.baseBall;
		fcc = bb.fontColorChooser;
		
		gameLength = 3;
		my = new int[gameLength];
		com = new int[gameLength];
		newGame();
	}

	
	public void newGame() {
		count = 0;
		
		com[0] = random.nextInt(9) + 1;

		do {
			com[1] = random.nextInt(10);
		} while (com[0] == com[1]);
		
		do {
			com[2] = random.nextInt(10);
		} while ((com[0] == com[2]) || (com[1] == com[2]));
		
		bb.tf.setEnabled(true);
		
		clear();
		viewResult("���ο� ���� ����");
	}

	public void clear() {
		bb.ta.setText(" ");
	}

	public void showDap() {
		bb.ta.append("������ " + com[0] + com[1] + com[2] + " �Դϴ�.\n");
		viewResult("������ �Ǵ� ���� ��ư �Է�");
		bb.tf.setEnabled(false);
	}

	public void fontColorChange() {
		fcc.setVisible(true);
		changeColor();
	}

	public void exit() {
		System.exit(0);
	}

	public void game() {
		int strike = 0;
		int ball = 0;
		
		String myNumStr = bb.tf.getText().trim();
		bb.tf.setText("");
		
		if (myNumStr.length() != gameLength) {
			viewResult("���ڸ� ���ڸ� �Է�");
			return;
		}
		
		if (!isNumber(myNumStr)) {
			viewResult("���ڰ� �ƴ� ���ڸ� �Է��� �� ����");
			return;
		}
		
		for (int i = 0; i < gameLength; i++) {
			//my[i] = Integer.parseInt(myNumStr.substring(i, i + 1));
			my[i] = myNumStr.charAt(i) - 48;
		}
		
		for (int i = 0; i < gameLength; i++) {
			for (int j = 0; j < gameLength; j++) {
				if (my[j] == com[i]) {
					if (j == i) {
						strike++;
					} else {
						ball++;
					}
					break;
				}
			}
		}
		
		count++;
		
		if (strike != gameLength) {
			viewResult(count + ". " + myNumStr + "��(��) " + strike + " strike " + ball + " ball");
		} else {
			viewResult(myNumStr + "��(��) " + count + "��° ���� ����");
			viewResult("������ �Ǵ� ���� ��ư �Է�");
			bb.tf.setEnabled(false);
		}
	}

	public void selectColor() {
		bb.ta.setForeground(new Color(r, g, b));
		fcc.setVisible(false);
	}
	
	
	private void viewResult(String msg) {
		bb.ta.append(msg + "\n");
	}
	
	private boolean isNumber(String str) {
		boolean flag = true;
		int len = str.length();
		
		if (len == 0) {
			return false;
		}
		
		for (int i = 0; i < len; i++) {
			if (((str.charAt(i) < '0') || (str.charAt(i) > '9'))) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
	public void changeColor() {
		r = fcc.sbR.getValue();
		g = fcc.sbG.getValue();
		b = fcc.sbB.getValue();
		
		fcc.colorP.setBackground(new Color(r, g, b));
		fcc.colorL.setText("R = " + r + " G = " + g + " B = " + b);
	}
}
