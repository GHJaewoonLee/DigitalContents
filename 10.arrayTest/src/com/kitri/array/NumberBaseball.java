package com.kitri.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// com, my 3자리 배열
// com : 세자리 난수 발생 >> comRandom()  -- 중복 X, 0으로 시작 X, 

// 내가 생성한 3자리 숫자를 my 배열에 넣기
// com과 my의 숫자와 자리비교

// 숫자가 같으면
// 자리수도 같으면 strike
//       다르면 ball

// strike가 3 : XXX는 몇번째 만에 정답
// 	계속(1), 종료(0)

// strike가 3이 아니면
//  xxx는 X strike X ball

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
			System.out.print("숫자입력 : ");
			int myNum;
			int one, two, three;
			
			myNum = getNumber();
			
			one = (myNum / 100);
			two = (myNum % 100) / 10;
			three = (myNum % 10);

			if ((myNum < 100) || (one == two) || (one == three) || (two == three)) {
				System.out.println("중복되는 숫자가 있습니다.");
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
			
			// 결과
			if (strike != 3) {
				System.out.println(tryCount + ". " + myNum + "은(는) " + strike + " strike " + ball + " ball");
			} else {
				System.out.println(myNum + "은(는) " + tryCount + "번째 만에 정답");
				System.out.println("계속(1), 종료(0)");
				
				tryCount = 0;
				
				if (getNumber() == 0) {
					System.out.println("게임 종료");
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
				System.out.println("3자리 숫자가 아닙니다.");
				tryCount++;
			}
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식이 아닙니다.");
			tryCount++;
		} catch (IOException e) {
			System.out.println("입력 과정에서 예외가 발생하였습니다.");
		}
		
		return num;
	}
		
	public static void main(String[] args) {
		NumberBaseball nbb = new NumberBaseball();
		
		nbb.game();
	}	
}
