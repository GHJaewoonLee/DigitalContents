import java.util.Scanner;

public class Chapter5 {

	public static void main(String[] args) {
		
		// 5-6
		int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		System.out.println(array.length); // 3
		System.out.println(array[2].length); // 5
		System.out.println();
		
		
		// 5-7
		// 배열의 최대값 구하기
		int max = 0;
		int[] array1 = {1, 5, 3, 8, 2};
		
		for(int index = 0 ; index < array1.length ; index++) {
			if (array1[index] >= max) {
				max = array1[index];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println();
		
		
		// 5-8
		// 중첩 for문을 이용하여 배열의 전체 합과 평균 구하기
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
		
		System.out.println("총 합 : " + sum + ", 평균 : " + avg);
		System.out.println();
		
		
		// 5-9
		// 학생 수, 학생들의 접수를 입력 받아서 최고점과 평균을 구하기
		boolean run = true;
		boolean step1 = false, step2 = false;
		int studentNum = 0;
		int[] scores = null;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택 > ");
			
			int select = scan.nextInt();
			
			int maxScore = 0;
			int sumScore = 0;
			double avgScore = 0.0;
			
			switch (select) {
				case 1 : if (step1) {
							 scores = null;
							 step1 = false;
						 }
					
						 System.out.println("학생 수 : ");
						 studentNum = scan.nextInt();
						 
						 if (studentNum <= 0) {
							 System.out.println("학생 수가 올바르지 않습니다.");
							 break;
						 }
						 
						 scores = new int[studentNum];
						 step1 = true;
						 break;
						 
				case 2 : if (!step1) {
							 System.out.println("먼저 학생 수를 입력하세요.");
							 step2 = false;
							 break;
						 }
				
						 System.out.println("점수 입력 : ");
						 for(int idx = 0 ; idx < scores.length ; idx++) {
							 scores[idx] = scan.nextInt();
						 }
						 
						 step2 = true;
						 break;
						 
				case 3 : if (!step2) {
							 System.out.println("먼저 점수를 입력하세요.");
						 }
					
						 System.out.println("점수 리스트 : ");
						 for(int idx = 0 ; idx < scores.length ; idx++) {
							 System.out.print(scores[idx] + "  ");
						 }
						 System.out.println();
						 break;
						 
				case 4 : if (!step2) {
					 		 System.out.println("먼저 점수를 입력하세요.");
				 		 }
				
					     System.out.println("분석 : ");
						 for(int idx = 0 ; idx < scores.length ; idx++) {
							 sumScore += scores[idx];
							 if (scores[idx] >= maxScore) {
								 maxScore = scores[idx];
							 }
						 }
				
						 avgScore = ((double)sumScore / studentNum);
						 
						 System.out.println("최고 점수 : " + maxScore);
						 System.out.println("평균 점수 : " + avgScore);
						 break;
					
				case 5 :
				default : run = false;
						  scores = null;
						  step1 = false;
						  step2 = false;
						  System.out.println("프로그램 종료");
			}
		}
	}

}
