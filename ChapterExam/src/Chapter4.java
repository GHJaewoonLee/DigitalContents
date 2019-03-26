import java.util.Scanner;

public class Chapter4 {

	public static void main(String[] args) {
		
		// 4-3
		// for문을 이용하여 1~100 중 3의 배수의 합
		int sum = 0;
		for(int index = 1 ; index <= 100 ; index++) {
			if ((index % 3) == 0) {
				sum += index;
			}
		}
		
		System.out.println("3의 배수의 합 : " + sum);
		System.out.println();
		
		
		// 4-4
		// while, Math.random() 사용하여 두 개의 주사위를 던졌을 때 (눈1, 눈2) 형태로 출력 (눈의 합이 5가 나올때까지)
		int nun1 = 0, nun2 = 0;
		
		while((nun1 + nun2) != 5) {
			nun1 = (int)((Math.random() * 6) + 1);
			nun2 = (int)((Math.random() * 6) + 1);
			System.out.println("(" + nun1 + ", " + nun2 + ")");
		}
		
		System.out.println();
		
		
		// 4-5
		// 중첩 for문을 사용하여 4x + 5y = 60의 해 구하기 (x, y는 10 이하의 자연수)
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
		// while, Scanner 사용하여 사용자 입력 데이터로 예금,출금,조회,종료 기능 구현
		boolean run = true;
		int balance = 0;
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.println("선택 > ");
			
			num = scan.nextInt();
			
			int money = 0;
			
			switch (num) {
				case 1 : System.out.println("예금액 : ");
						 balance += scan.nextInt();
						 break;
						 
				case 2 : System.out.println("출금액 : ");
						 money = scan.nextInt();
						 
						 if (money > balance) {
							 System.out.println("잔액 부족");
						 } else {
							 balance -= money;
						 }
						 break;
						 
				case 3 : System.out.println("잔고 : " + balance);
						 break;
						 
				case 4 :
				default : run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
