public class condition {

	public static void main(String[] args) {

		// ���ǹ�
		// if (���ǽ�) { ���϶� } ...

		/*
		int x = 10, y = 70;

		if (x > y) {
			System.out.println("x�� ŭ");
		}
		*/

		/*
		int jumin = 2;

		if((jumin % 2) == 0) {
			System.out.println("����� �����Դϴ�.");
		}

		if((jumin % 2) != 0) {
			System.out.println("����� �����Դϴ�.");
		}

		String gender = (jumin % 2) == 0 ? "����" : "����";
		System.out.println(gender);
		System.out.println("");
		*/


		// if (���ǽ�) { ���϶� } else { �����϶� } ...

		//int aa = 100, bb = 100;

		/*
		// ���� ��쿡�� ó�� �� ��
		if(aa > bb) {
			System.out.println(aa + "��(��) " + bb + "���� ũ��.");
		} else {
			System.out.println(aa + "��(��) " + bb + "���� �۴�.");
		}

		String result = "";

		if(aa > bb) {
			result = "ũ��";
		} else {
			result = "�۴�";
		}

		System.out.println(aa + "��(��) " + bb + "����(��) " + result + ".");

		*/

		/*
		String result = "";

		if (aa > bb) {
			result = "ũ��";
		} else {
			if (aa < bb) {
				result = "�۴�";
			} else {
				result = "����";
			}
		}

		result = (aa == bb) ? "����" : ((aa > bb) ? "ũ��" : "�۴�");

		System.out.println(aa + "��(��) " + bb + "����(��) " + result + ".");
		*/


		// if (���ǽ�1) { ���ǽ�1 ���϶� } else if (���ǽ�2) { ���ǽ�2 ���϶� } else { ... } ...

		/*
		String result = "";

		if (aa == bb) {
			result = "����";
		} else if (aa > bb) {
			result = "ũ��";
		} else {
			result = "�۴�";
		}

		System.out.println(aa + "��(��) " + bb + "����(��) " + result + ".");
		*/



		// ������ 90 �̻��̸� A, 80 �̻��̸� B, 70 �̻��̸� C, 60 �̻��̸� D, 60 �̸� F
		// ���� ��� : ������ xx���̹Ƿ� X���� �Դϴ�.
		// X5�� �̻��̸� X+����.

		/*
		int score = 59;
		String grade = "";

		if ((score > 100) || (score < 0)) {
			grade = "�� �� ���� ";
			System.out.println("��ȿ�� ������ �ƴմϴ�.");
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

			System.out.println("������ " + score + "�� �̹Ƿ� " + grade + "�����Դϴ�.");
		}

		System.out.println("����");
		*/


		// switch (��) { case ��1 : ���๮1; [break;] case ��2 : ���๮2; [break;] ... [break;] default : ���๮N } ...
		// �� �񱳴� �������� ����. ��, JDK 7 �̻󿡼��� ���ڿ��� �� ����.

		/*
		int num = 1;

		switch (num) {
			case 1 : System.out.println("1�Դϴ�"); break;
			case 2 : System.out.println("2�Դϴ�"); break;
			case 3 : System.out.println("3�Դϴ�"); break;
			default : System.out.println("123�ƴմϴ�");
		}

		char c = 'a';

		switch (c) {
			case 'a' : System.out.println("a�Դϴ�"); break;
			case 'b' : System.out.println("b�Դϴ�"); break;
			case 'c' : System.out.println("c�Դϴ�"); break;
			default : System.out.println("abc�ƴմϴ�");
		}

		String str = "java";

		switch (str) {
			case "oracle" : System.out.println("oracle�Դϴ�"); break;
			case "java" : System.out.println("java�Դϴ�"); break;
			case "jsp" : System.out.println("jsp�Դϴ�"); break;
			default : System.out.println("��� �ƴմϴ�");
		}
		*/

		/*
		int score = 100;
		String grade = "";

		if ((score > 100) || (score < 0)) {
			grade = "�� �� ���� ";
			System.out.println("��ȿ�� ������ �ƴմϴ�.");
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

		System.out.println("������ " + score + "�� �̹Ƿ� " + grade + "�����Դϴ�.");
		System.out.println("���α׷�����");
		*/


		/*
		double d = Math.random();
		System.out.println("d = " + d);
		System.out.println("");
		*/


		/* ���������� ����
			1.  0 : ����, 1 : ����, 2 : ��
			2. CPU�� ���� �߻� (0 ~ 2 ������ ��)
			3. �÷��̾�� �̸� ������ ������ 0 ~ 2 ������ ���� ����
			4. ��� Logic (Win, Lose, Draw)
			5. ��� ��� (�÷��̾� : ��, CPU : ����, ��� : Player Win)
						 (�÷��̾� : ��, CPU : ��, ��� : Draw)
						 (�÷��̾� : ��, CPU : ����, ��� : Player Lose)
		*/

		/*
		int my = (int)(Math.random() * 3);
		int cpu = (int)(Math.random() * 3);

		int fight = (my - cpu + 2) % 3;     // ���������� ��Ģ

		String myChoice = "";
		String cpuChoice = "";
		String myResult = "";
		String cpuResult = "";

		switch (my) {
			case 0 : myChoice = "����"; break;
			case 1 : myChoice = "����"; break;
			case 2 : myChoice = "��"; break;
			default : myChoice = "�߸��� ��";
		}

		switch (cpu) {
			case 0 : cpuChoice = "����"; break;
			case 1 : cpuChoice = "����"; break;
			case 2 : cpuChoice = "��"; break;
			default : cpuChoice = "�߸��� ��";
		}

		// ���� �� - ������ �� + 1 + 2(������ ��츦 ����Ͽ�) �� ����� 3���� ����.
		switch (fight) {
			case 0 : myResult = "Win"; cpuResult = "Lose"; break;
			case 1 : myResult = "Lose"; cpuResult = "Win"; break;
			case 2 : myResult = cpuResult = "Draw"; break;
			default : myResult = cpuResult = "Unknown";
		}

		System.out.println("�÷��̾� : " + myChoice + ", CPU : " + cpuChoice + ", ��� : Player " + myResult + " - CPU : " + cpuResult);
		*/

		/*
			��   ��   �� - �� + 2	���
			0    0			2		���
			1    1			2		���
			2    2			2		���

			2    1			3		�̱�
			1    0			3		�̱�
			0    2			0		�̱�

			2    0			4		��
			1    2			1		��
			0    1			1		��
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


		// �ݺ���
		// for�� : ��Ģ, Ƚ�� ����
		// for (�ʱⰪ ; ���ǽ� ; ������) { ���๮ } ...

        /*
		int i;

        System.out.println("1 ~ 10 ���� ���");

        for(i = 1 ; i <= 10 ; i++) {
			System.out.print(i + "\t\t");
		}

        System.out.println("\n����");
        */


        // 1 ~ 10 ��  Ȧ���� ���
        /*
        int i;

        System.out.print("1 ~ 10 �� Ȧ�� :\n");
        for(i = 1 ; i <= 10 ; i+=2) {
            //if((i % 2) != 0) {
                System.out.print(i + "  ");
            //}
        }

        // 1 ~ 100 ��� (10�� ���� �� �ٲ�)
        System.out.println("\n\n1 ~ 100 ��� :");
        for(i = 1 ; i <= 100 ; i++) {
            System.out.print(i + "  ");

            if((i % 10) == 0) {
                System.out.print("\n");
            }
        }

        System.out.println("\n");
        */


        /*
            1. 1 ~ 3 ������ ���� �ٸ� ���� 3�� �߻�
            Tip : �������̸� �߸� �Ǵ� �κи� �����ϴ� ���� ���� ���α׷���
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

        System.out.println("���� ��÷ ��ȣ : " + num1 + " " + num2 + " " + num3 + "\n\n");
        */

        /*
        // ������ �� 5�� ���
        System.out.println("*** ������(5��) ***");
        int dan = 5;
        for (int x = 1 ; x <= 9 ; x++) {
            System.out.println(dan + " * " + x + " = " + (dan * x));
        }

        System.out.println("\n");


        int col, row;

        // ������1 :
        System.out.println("*** ������1 ***");
        for(col = 1 ; col <= 9 ; col++) {

            for (row = 2 ; row <= 9 ; row++) {
                System.out.print(row + " * " + col + " = " + (row * col) + "   ");
            }

            System.out.println("");
        }

        System.out.println("\n");


        // ������2 :
        System.out.println("*** ������2 ***");
        for(col = 2 ; col <= 9 ; col++) {

            for (row = 1 ; row <= 9 ; row++) {
                System.out.print(col + " * " + row + " = " + (col * row) + "   ");
            }

            System.out.println("");
        }

        System.out.println("\n");
        */


        // while : ����
        // while (���ǽ�) { ���๮ } ...

        /*
        int num = 0;

        System.out.println("1 ~ 10���� ��� :");

        while (num < 10) {
            System.out.print(++num + "  ");
        }

        System.out.println("\n");
        */

        /* 0�� ������ ���� */
        /*
        boolean flag = true;
        int random, counter = 0;

        System.out.println("1 ~ 10������ ���� �� ���� �߻� :");

        while (flag) {
            counter++;
            random = (int)(Math.random() * 11);

            if (random != 0) {
                System.out.print(random + "  ");
            } else {
                System.out.println("");
                System.out.println(counter + "��° ���� ����");
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

        System.out.println("���� ��÷ ��ȣ : " + num1 + " " + num2 + " " + num3 + "\n");
        */

        /*
        int col = 1, row = 2;

        System.out.println("*** ������1 ***");

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

        System.out.println("*** ������2 ***");

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


        // do ~ while : �ּ� 1�� �̻� ����, ���� ���� ����
        // do { ���๮ } while (���ǽ�)

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

            System.out.println(count + "ȸ�� : " + num1 + "  " + num2 + "  " + num3 + "  " + num4 + "  " + num5 + "  " + num6);
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
            ���� �ζ�
        */
        int lotto[] = {0, 0, 0, 0, 0, 0};                           // ������ ������ �����ϱ� ���� �迭 ����
        int numOfGame = 3;                                          // ���� Ƚ��
        int count, cnt, index = 0;                                  // index : �� ��° ��ȣ�� �����ϰ� �ִ���
        int sort, temp;

        boolean isDuplicated = false;                               // �ζ� ��ȣ�� �ߺ� Ȯ��

        for (count = 1 ; count <= numOfGame ; count++) {
            System.out.print(count + "��° Game : ");

            while((index < 6) && !isDuplicated) {                   // 6���� ������ �����ϴ� ���� �ߺ��� ���� ������
                lotto[index] = (int)((Math.random() * 45) + 1);     // 1 ~ 45 ������ ���� ����

                for(cnt = 0 ; cnt < 6 ; cnt++) {
                    if(index == cnt) {                              // �ڱ� �ڽ��� ���� �ʿ䰡 �����Ƿ� ���� �ε����� �Ѿ
                        continue;
                    }

                    if(lotto[index] == lotto[cnt]) {                // ���� ��ȣ�� �߰� �Ǹ� �� �̻� ���� �ʿ� ����
                        isDuplicated = true;
                        break;
                    }
                }

                if (isDuplicated) {                                 // ���� ��ȣ�� ���� ���� Ȯ�� �Ǹ� �ٽ� ������ ����
                    isDuplicated = false;
                    continue;
                }

                index++;                                            // ���� ����
            }

            /* ���� */
            for (sort = 5 ; sort > 0 ; sort--) {
                for (cnt = 0 ; cnt < sort ; cnt++) {
                    if (lotto[cnt] > lotto[cnt + 1]) {              // ���� ���ڰ� ������ ���ں��� ũ�� swap
                        temp = lotto[cnt];
                        lotto[cnt] = lotto[cnt + 1];
                        lotto[cnt + 1] = temp;
                    }
                }
            }

            for(cnt = 0 ; cnt < 6 ; cnt++) {
                System.out.print(lotto[cnt] + "  ");                // ������ ���� ���
                lotto[cnt] = 0;                                     // �迭 �ʱ�ȭ
            }

            index = 0;                                              // ���� ������ ���� ���� �ʱ�ȭ

            System.out.println();                                   // �������� ���ؼ� �� �� ����
        }
	}
}
