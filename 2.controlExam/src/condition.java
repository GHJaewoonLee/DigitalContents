public class condition {

	public static void main(String[] args) {

		// 조건문
		// if (조건식) { 참일때 } ...

		/*
		int x = 10, y = 70;

		if (x > y) {
			System.out.println("x가 큼");
		}
		*/

		/*
		int jumin = 2;

		if((jumin % 2) == 0) {
			System.out.println("당신은 여자입니다.");
		}

		if((jumin % 2) != 0) {
			System.out.println("당신은 남자입니다.");
		}

		String gender = (jumin % 2) == 0 ? "여자" : "남자";
		System.out.println(gender);
		System.out.println("");
		*/


		// if (조건식) { 참일때 } else { 거짓일때 } ...

		//int aa = 100, bb = 100;

		/*
		// 같은 경우에는 처리 못 함
		if(aa > bb) {
			System.out.println(aa + "은(는) " + bb + "보다 크다.");
		} else {
			System.out.println(aa + "은(는) " + bb + "보다 작다.");
		}

		String result = "";

		if(aa > bb) {
			result = "크다";
		} else {
			result = "작다";
		}

		System.out.println(aa + "은(는) " + bb + "보다(과) " + result + ".");

		*/

		/*
		String result = "";

		if (aa > bb) {
			result = "크다";
		} else {
			if (aa < bb) {
				result = "작다";
			} else {
				result = "같다";
			}
		}

		result = (aa == bb) ? "같다" : ((aa > bb) ? "크다" : "작다");

		System.out.println(aa + "은(는) " + bb + "보다(과) " + result + ".");
		*/


		// if (조건식1) { 조건식1 참일때 } else if (조건식2) { 조건식2 참일때 } else { ... } ...

		/*
		String result = "";

		if (aa == bb) {
			result = "같다";
		} else if (aa > bb) {
			result = "크다";
		} else {
			result = "작다";
		}

		System.out.println(aa + "은(는) " + bb + "보다(과) " + result + ".");
		*/



		// 점수가 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 60 이상이면 D, 60 미만 F
		// 실행 결과 : 점수가 xx점이므로 X학점 입니다.
		// X5점 이상이면 X+학점.

		/*
		int score = 59;
		String grade = "";

		if ((score > 100) || (score < 0)) {
			grade = "알 수 없는 ";
			System.out.println("유효한 점수가 아닙니다.");
		} else {
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}

			if((score == 100) || ((score > 60) && ((score % 10) >= 5))) {
				grade += "+";
			}

			System.out.println("점수가 " + score + "점 이므로 " + grade + "학점입니다.");
		}

		System.out.println("종료");
		*/


		// switch (값) { case 값1 : 실행문1; [break;] case 값2 : 실행문2; [break;] ... [break;] default : 실행문N } ...
		// 값 비교는 숫자형만 가능. 단, JDK 7 이상에서는 문자열도 비교 가능.

		/*
		int num = 1;

		switch (num) {
			case 1 : System.out.println("1입니다"); break;
			case 2 : System.out.println("2입니다"); break;
			case 3 : System.out.println("3입니다"); break;
			default : System.out.println("123아닙니다");
		}

		char c = 'a';

		switch (c) {
			case 'a' : System.out.println("a입니다"); break;
			case 'b' : System.out.println("b입니다"); break;
			case 'c' : System.out.println("c입니다"); break;
			default : System.out.println("abc아닙니다");
		}

		String str = "java";

		switch (str) {
			case "oracle" : System.out.println("oracle입니다"); break;
			case "java" : System.out.println("java입니다"); break;
			case "jsp" : System.out.println("jsp입니다"); break;
			default : System.out.println("모두 아닙니다");
		}
		*/

		/*
		int score = 100;
		String grade = "";

		if ((score > 100) || (score < 0)) {
			grade = "알 수 없는 ";
			System.out.println("유효한 점수가 아닙니다.");
		} else {
			switch (score / 10) {
				case 10 : grade = "A+"; break;

				case 9 : grade = "A"; break;

				case 8 : grade = "B"; break;

				case 7 : grade = "C"; break;

				case 6 : grade = "D"; break;

				default : grade = "F";
			}

			if((score > 60) && ((score % 10) >= 5)) {
				grade += "+";
			}
		}

		System.out.println("점수가 " + score + "점 이므로 " + grade + "학점입니다.");
		System.out.println("프로그램종료");
		*/


		/*
		double d = Math.random();
		System.out.println("d = " + d);
		System.out.println("");
		*/


		/* 가위바위보 게임
			1.  0 : 가위, 1 : 바위, 2 : 보
			2. CPU는 난수 발생 (0 ~ 2 사이의 값)
			3. 플레이어는 미리 정수형 변수에 0 ~ 2 사이의 값을 정함
			4. 결과 Logic (Win, Lose, Draw)
			5. 결과 출력 (플레이어 : 보, CPU : 바위, 결과 : Player Win)
						 (플레이어 : 보, CPU : 보, 결과 : Draw)
						 (플레이어 : 보, CPU : 가위, 결과 : Player Lose)
		*/

		/*
		int my = (int)(Math.random() * 3);
		int cpu = (int)(Math.random() * 3);

		int fight = (my - cpu + 2) % 3;     // 가위바위보 규칙

		String myChoice = "";
		String cpuChoice = "";
		String myResult = "";
		String cpuResult = "";

		switch (my) {
			case 0 : myChoice = "가위"; break;
			case 1 : myChoice = "바위"; break;
			case 2 : myChoice = "보"; break;
			default : myChoice = "잘못된 패";
		}

		switch (cpu) {
			case 0 : cpuChoice = "가위"; break;
			case 1 : cpuChoice = "바위"; break;
			case 2 : cpuChoice = "보"; break;
			default : cpuChoice = "잘못된 패";
		}

		// 나의 패 - 상대방의 패 + 1 + 2(음수인 경우를 고려하여) 의 결과를 3으로 나눔.
		switch (fight) {
			case 0 : myResult = "Win"; cpuResult = "Lose"; break;
			case 1 : myResult = "Lose"; cpuResult = "Win"; break;
			case 2 : myResult = cpuResult = "Draw"; break;
			default : myResult = cpuResult = "Unknown";
		}

		System.out.println("플레이어 : " + myChoice + ", CPU : " + cpuChoice + ", 결과 : Player " + myResult + " - CPU : " + cpuResult);
		*/

		/*
			나   컴   나 - 컴 + 2	결과
			0    0			2		비김
			1    1			2		비김
			2    2			2		비김

			2    1			3		이김
			1    0			3		이김
			0    2			0		이김

			2    0			4		짐
			1    2			1		짐
			0    1			1		짐
		*/

		/*
		fight = my - cpu;

		if (fight == 0) {
			result = "Draw";
		} else if (fight > 0) {
			if (fight == 2) {
				result = "Lose";
			} else {
				result = "Win";
			}
		} else {
			if (fight == -2) {
				result = "Win";
			} else {
				result = "Lose";
			}
		}
		*/


		// 반복문
		// for문 : 규칙, 횟수 지정
		// for (초기값 ; 조건식 ; 증감식) { 실행문 } ...

        /*
		int i;

        System.out.println("1 ~ 10 까지 출력");

        for(i = 1 ; i <= 10 ; i++) {
			System.out.print(i + "\t\t");
		}

        System.out.println("\n종료");
        */


        // 1 ~ 10 중  홀수만 출력
        /*
        int i;

        System.out.print("1 ~ 10 중 홀수 :\n");
        for(i = 1 ; i <= 10 ; i+=2) {
            //if((i % 2) != 0) {
                System.out.print(i + "  ");
            //}
        }

        // 1 ~ 100 출력 (10개 단위 줄 바꿈)
        System.out.println("\n\n1 ~ 100 출력 :");
        for(i = 1 ; i <= 100 ; i++) {
            System.out.print(i + "  ");

            if((i % 10) == 0) {
                System.out.print("\n");
            }
        }

        System.out.println("\n");
        */


        /*
            1. 1 ~ 3 까지의 서로 다른 난수 3개 발생
            Tip : 가급적이면 잘못 되는 부분만 변경하는 것이 좋은 프로그래밍
        */

        /*
        //int z;
        int num1 = 0, num2 = 0, num3 = 0;
        // boolean b = true;

        num1 = (int)((Math.random() * 3) + 1);

        for ( ; ; ) {
        // for ( ; b ; ) {
        //for(z = 0 ; z == 0 ; z += 0) {
            num2 = (int)((Math.random() * 3) + 1);
            //num3 = (int)((Math.random() * 3) + 1);

            //(num2 != num3) && (num1 != num3)
            if(num1 != num2) {
                // z = 1;
                break;
                // b = false;
            }
        }

        for ( ; ; ) {
        // for ( ; b ; ) {
        //for(z = 0 ; z == 0 ; z += 0) {
            num3 = (int)((Math.random() * 3) + 1);

            //(num1 != num2)
            if((num2 != num3) && (num1 != num3)) {
                // z = 1;
                break;
                // b = false;
            }
        }

        System.out.println("금주 당첨 번호 : " + num1 + " " + num2 + " " + num3 + "\n\n");
        */

        /*
        // 구구단 중 5단 출력
        System.out.println("*** 구구단(5단) ***");
        int dan = 5;
        for (int x = 1 ; x <= 9 ; x++) {
            System.out.println(dan + " * " + x + " = " + (dan * x));
        }

        System.out.println("\n");


        int col, row;

        // 구구단1 :
        System.out.println("*** 구구단1 ***");
        for(col = 1 ; col <= 9 ; col++) {

            for (row = 2 ; row <= 9 ; row++) {
                System.out.print(row + " * " + col + " = " + (row * col) + "   ");
            }

            System.out.println("");
        }

        System.out.println("\n");


        // 구구단2 :
        System.out.println("*** 구구단2 ***");
        for(col = 2 ; col <= 9 ; col++) {

            for (row = 1 ; row <= 9 ; row++) {
                System.out.print(col + " * " + row + " = " + (col * row) + "   ");
            }

            System.out.println("");
        }

        System.out.println("\n");
        */


        // while : 조건
        // while (조건식) { 실행문 } ...

        /*
        int num = 0;

        System.out.println("1 ~ 10까지 출력 :");

        while (num < 10) {
            System.out.print(++num + "  ");
        }

        System.out.println("\n");
        */

        /* 0이 나오면 종료 */
        /*
        boolean flag = true;
        int random, counter = 0;

        System.out.println("1 ~ 10까지의 숫자 중 난수 발생 :");

        while (flag) {
            counter++;
            random = (int)(Math.random() * 11);

            if (random != 0) {
                System.out.print(random + "  ");
            } else {
                System.out.println("");
                System.out.println(counter + "번째 만에 종료");
                flag = false;
            }
        }
        */

        /*
        int num1 = 0, num2 = 0, num3 = 0;
        boolean flag = true;

        num1 = (int)((Math.random() * 3) + 1);

        while (flag) {
            num2 = (int)((Math.random() * 3) + 1);

            if (num1 != num2) {
                flag = false;
            }
        }

        flag = true;

        while (flag) {
            num3 = (int)((Math.random() * 3) + 1);

            if ((num2 != num3) && (num1 != num3)) {
                flag = false;
            }
        }

        System.out.println("금주 당첨 번호 : " + num1 + " " + num2 + " " + num3 + "\n");
        */

        /*
        int col = 1, row = 2;

        System.out.println("*** 구구단1 ***");

        while (col <= 9) {
            while (row <= 9) {
                System.out.print(row + " * " + col + " = " + (row * col) + "   ");
                row++;
            }

            System.out.println("");
            col++;
            row = 2;
        }

        System.out.println("");

        col = 1;
        row = 2;

        System.out.println("*** 구구단2 ***");

        while (row <= 9) {
            while (col <= 9) {
                System.out.print(row + " * " + col + " = " + (row * col) + "   ");
                col++;
            }

            System.out.println("");
            row++;
            col = 1;
        }

        System.out.println("\n");
        */


        // do ~ while : 최소 1번 이상 실행, 조건 전에 수행
        // do { 실행문 } while (조건식)

        int num1, num2, num3, num4, num5, num6;
        int countOfGame = 5;

        for(int count = 1 ; count <= countOfGame ; count++) {
            num1 = (int)((Math.random() * 45) + 1);

            do {
                num2 = (int)((Math.random() * 45) + 1);
            }
            while (num1 == num2);

            do {
                num3 = (int)((Math.random() * 45) + 1);
            }
            while ((num1 == num3) || (num2 == num3));

            do {
                num4 = (int)((Math.random() * 45) + 1);
            }
            while ((num1 == num4) || (num2 == num4) || (num3 == num4));

            do {
                num5 = (int)((Math.random() * 45) + 1);
            }
            while ((num1 == num5) || (num2 == num5) || (num3 == num5) || (num4 == num5));

            do {
                num6 = (int)((Math.random() * 45) + 1);
            }
            while ((num1 == num6) || (num2 == num6) || (num3 == num6) || (num4 == num6) || (num5 == num6));

            System.out.println(count + "회차 : " + num1 + "  " + num2 + "  " + num3 + "  " + num4 + "  " + num5 + "  " + num6);
        }

        System.out.println("");


        // break;
        // continue;
        // return;

        /*
        int num, counter = 0;

        while (counter < 10) {
            counter++;
            num = (int)(Math.random() * 10);

            if (num == 0) {
                System.out.println("Number is 0. Program end");
                break;
            }

            System.out.println("Number : " + num);
        }

        System.out.println("-----------------------------");

        counter = 0;

        while (counter < 10) {
            counter++;
            num = (int)(Math.random() * 10);

            if (num == 0) {
                System.out.println("Number is 0. Continue");
                continue;
                // return;
            }

            System.out.println("Number : " + num);
        }
        */


        /*
            실제 로또
        */
        int lotto[] = {0, 0, 0, 0, 0, 0};                           // 생성된 난수를 저장하기 위한 배열 생성
        int numOfGame = 3;                                          // 게임 횟수
        int count, cnt, index = 0;                                  // index : 몇 번째 번호를 생성하고 있는지
        int sort, temp;

        boolean isDuplicated = false;                               // 로또 번호의 중복 확인

        for (count = 1 ; count <= numOfGame ; count++) {
            System.out.print(count + "번째 Game : ");

            while((index < 6) && !isDuplicated) {                   // 6개의 난수를 생성하는 동안 중복이 없을 때까지
                lotto[index] = (int)((Math.random() * 45) + 1);     // 1 ~ 45 사이의 난수 생성

                for(cnt = 0 ; cnt < 6 ; cnt++) {
                    if(index == cnt) {                              // 자기 자신은 비교할 필요가 없으므로 다음 인덱스로 넘어감
                        continue;
                    }

                    if(lotto[index] == lotto[cnt]) {                // 같은 번호가 발견 되면 더 이상 비교할 필요 없음
                        isDuplicated = true;
                        break;
                    }
                }

                if (isDuplicated) {                                 // 같은 번호가 나온 것이 확인 되면 다시 난수를 생성
                    isDuplicated = false;
                    continue;
                }

                index++;                                            // 다음 난수
            }

            /* 정렬 */
            for (sort = 5 ; sort > 0 ; sort--) {
                for (cnt = 0 ; cnt < sort ; cnt++) {
                    if (lotto[cnt] > lotto[cnt + 1]) {              // 왼쪽 숫자가 오른쪽 숫자보다 크면 swap
                        temp = lotto[cnt];
                        lotto[cnt] = lotto[cnt + 1];
                        lotto[cnt + 1] = temp;
                    }
                }
            }

            for(cnt = 0 ; cnt < 6 ; cnt++) {
                System.out.print(lotto[cnt] + "  ");                // 생성된 난수 출력
                lotto[cnt] = 0;                                     // 배열 초기화
            }

            index = 0;                                              // 다음 게임을 위한 변수 초기화

            System.out.println();                                   // 가독성을 위해서 한 줄 내림
        }
	}
}
