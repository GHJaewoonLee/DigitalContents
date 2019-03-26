import java.util.Scanner;

public class Chapter5 {

	public static void main(String[] args) {
		
		// 5-6
		int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		System.out.println(array.length); // 3
		System.out.println(array[2].length); // 5
		System.out.println();
		
		
		// 5-7
		// �迭�� �ִ밪 ���ϱ�
		int max = 0;
		int[] array1 = {1, 5, 3, 8, 2};
		
		for(int index = 0 ; index < array1.length ; index++) {
			if (array1[index] >= max) {
				max = array1[index];
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println();
		
		
		// 5-8
		// ��ø for���� �̿��Ͽ� �迭�� ��ü �հ� ��� ���ϱ�
		int sum = 0;
		int count = 0;
		double avg = 0.0;
		
		int[][] array2 = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		
		for(int idx1 = 0 ; idx1 < array2.length ; idx1++) {
			for(int idx2 = 0 ; idx2 < array2[idx1].length ; idx2++) {
				sum += array2[idx1][idx2];
				count++;
			}
		}
		
		avg = ((double)sum / count);
		
		System.out.println("�� �� : " + sum + ", ��� : " + avg);
		System.out.println();
		
		
		// 5-9
		// �л� ��, �л����� ������ �Է� �޾Ƽ� �ְ����� ����� ���ϱ�
		boolean run = true;
		boolean step1 = false, step2 = false;
		int studentNum = 0;
		int[] scores = null;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("------------------------------------------");
			System.out.println("���� > ");
			
			int select = scan.nextInt();
			
			int maxScore = 0;
			int sumScore = 0;
			double avgScore = 0.0;
			
			switch (select) {
				case 1 : if (step1) {
							 scores = null;
							 step1 = false;
						 }
					
						 System.out.println("�л� �� : ");
						 studentNum = scan.nextInt();
						 
						 if (studentNum <= 0) {
							 System.out.println("�л� ���� �ùٸ��� �ʽ��ϴ�.");
							 break;
						 }
						 
						 scores = new int[studentNum];
						 step1 = true;
						 break;
						 
				case 2 : if (!step1) {
							 System.out.println("���� �л� ���� �Է��ϼ���.");
							 step2 = false;
							 break;
						 }
				
						 System.out.println("���� �Է� : ");
						 for(int idx = 0 ; idx < scores.length ; idx++) {
							 scores[idx] = scan.nextInt();
						 }
						 
						 step2 = true;
						 break;
						 
				case 3 : if (!step2) {
							 System.out.println("���� ������ �Է��ϼ���.");
						 }
					
						 System.out.println("���� ����Ʈ : ");
						 for(int idx = 0 ; idx < scores.length ; idx++) {
							 System.out.print(scores[idx] + "  ");
						 }
						 System.out.println();
						 break;
						 
				case 4 : if (!step2) {
					 		 System.out.println("���� ������ �Է��ϼ���.");
				 		 }
				
					     System.out.println("�м� : ");
						 for(int idx = 0 ; idx < scores.length ; idx++) {
							 sumScore += scores[idx];
							 if (scores[idx] >= maxScore) {
								 maxScore = scores[idx];
							 }
						 }
				
						 avgScore = ((double)sumScore / studentNum);
						 
						 System.out.println("�ְ� ���� : " + maxScore);
						 System.out.println("��� ���� : " + avgScore);
						 break;
					
				case 5 :
				default : run = false;
						  scores = null;
						  step1 = false;
						  step2 = false;
						  System.out.println("���α׷� ����");
			}
		}
	}

}
