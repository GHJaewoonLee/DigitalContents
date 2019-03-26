package com.kitri.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// com, my 3�ڸ� �迭
// com : ���ڸ� ���� �߻� >> comRandom()  -- �ߺ� X, 0���� ���� X, 

// ���� ������ 3�ڸ� ���ڸ� my �迭�� �ֱ�
// com�� my�� ���ڿ� �ڸ���

// ���ڰ� ������
// �ڸ����� ������ strike
//       �ٸ��� ball

// strike�� 3 : XXX�� ���° ���� ����
// 	���(1), ����(0)

// strike�� 3�� �ƴϸ�
//  xxx�� X strike X ball

public class NumberBaseball {

	private int strike;
	private int ball;
	private int tryCount;
	private String str;
	
	private int my[] = new int[3];
	private int com[] = new int[3];
	
	BufferedReader in;
	
	
	public NumberBaseball() {
		tryCount = 0;
		
		comRandom();
		
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	private void comRandom() {
		int comR;
		int one, two, three;
		
		do {
			comR = (int)((Math.random() * 900) + 100);
			
			one = (comR / 100);
			two = (comR % 100) / 10;
			three = (comR % 10);
		} while ((one == two) || (one == three) || (two == three));
		
		com[0] = one;
		com[1] = two;
		com[2] = three;
	}
	
	private void game() {
		while (true) {
			strike = ball = 0;
			System.out.print("�����Է� : ");
			int myNum;
			int one, two, three;
			
			myNum = getNumber();
			
			one = (myNum / 100);
			two = (myNum % 100) / 10;
			three = (myNum % 10);

			if ((myNum < 100) || (one == two) || (one == three) || (two == three)) {
				System.out.println("�ߺ��Ǵ� ���ڰ� �ֽ��ϴ�.");
				tryCount++;
				continue;
			}
			
			my[0] = one;
			my[1] = two;
			my[2] = three;
			
			// compare
			int comLen = com.length;
			int myLen = my.length;
			for (int i = 0; i < comLen; i++) {
				for (int j = 0; j < myLen; j++) {
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

			tryCount++;
			
			// ���
			if (strike != 3) {
				System.out.println(tryCount + ". " + myNum + "��(��) " + strike + " strike " + ball + " ball");
			} else {
				System.out.println(myNum + "��(��) " + tryCount + "��° ���� ����");
				System.out.println("���(1), ����(0)");
				
				tryCount = 0;
				
				if (getNumber() == 0) {
					System.out.println("���� ����");
					System.exit(0);
				}
				
				comRandom();
			}
		}
	}
	
	private int getNumber() {
		int num = 0;
		
		try {
			str = in.readLine();
			
			if (str.length() == 3) {
				num = Integer.parseInt(str);
			} else {
				System.out.println("3�ڸ� ���ڰ� �ƴմϴ�.");
				tryCount++;
			}
		} catch (NumberFormatException e) {
			System.out.println("���� ������ �ƴմϴ�.");
			tryCount++;
		} catch (IOException e) {
			System.out.println("�Է� �������� ���ܰ� �߻��Ͽ����ϴ�.");
		}
		
		return num;
	}
		
	public static void main(String[] args) {
		NumberBaseball nbb = new NumberBaseball();
		
		nbb.game();
	}	
}
