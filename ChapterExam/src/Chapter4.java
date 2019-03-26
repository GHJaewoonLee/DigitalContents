import java.util.Scanner;

public class Chapter4 {

	public static void main(String[] args) {
		
		// 4-3
		// for���� �̿��Ͽ� 1~100 �� 3�� ����� ��
		int sum = 0;
		for(int index = 1 ; index <= 100 ; index++) {
			if ((index % 3) == 0) {
				sum += index;
			}
		}
		
		System.out.println("3�� ����� �� : " + sum);
		System.out.println();
		
		
		// 4-4
		// while, Math.random() ����Ͽ� �� ���� �ֻ����� ������ �� (��1, ��2) ���·� ��� (���� ���� 5�� ���ö�����)
		int nun1 = 0, nun2 = 0;
		
		while((nun1 + nun2) != 5) {
			nun1 = (int)((Math.random() * 6) + 1);
			nun2 = (int)((Math.random() * 6) + 1);
			System.out.println("(" + nun1 + ", " + nun2 + ")");
		}
		
		System.out.println();
		
		
		// 4-5
		// ��ø for���� ����Ͽ� 4x + 5y = 60�� �� ���ϱ� (x, y�� 10 ������ �ڿ���)
		for(int x = 1 ; x <= 10 ; x++) {
			for(int y = 1 ; y <= 10 ; y++) {
				if ((4 * x + 5 * y) == 60) {
					System.out.println("x = " + x + ", y = " + y);
				}
			}
		}
		
		System.out.println();
		
		
		// 4-6
		// *
		// **
		// ***
		// ****
		// *****
		for(int y = 1 ; y <= 5 ; y++) {
			for(int x = 1 ; x <= y ; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 4-7
		// while, Scanner ����Ͽ� ����� �Է� �����ͷ� ����,���,��ȸ,���� ��� ����
		boolean run = true;
		int balance = 0;
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------");
			System.out.println("���� > ");
			
			num = scan.nextInt();
			
			int money = 0;
			
			switch (num) {
				case 1 : System.out.println("���ݾ� : ");
						 balance += scan.nextInt();
						 break;
						 
				case 2 : System.out.println("��ݾ� : ");
						 money = scan.nextInt();
						 
						 if (money > balance) {
							 System.out.println("�ܾ� ����");
						 } else {
							 balance -= money;
						 }
						 break;
						 
				case 3 : System.out.println("�ܰ� : " + balance);
						 break;
						 
				case 4 :
				default : run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
