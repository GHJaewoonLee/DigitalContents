
public class Chapter3 {

	public static void main(String args[]) {
		
		// 3-2
		int x = 10, y = 20;
		int z = (++x) + (y--); // z = 11 + 20; x = 11, y = 19;
		System.out.println(z);
		System.out.println();
		
		
		// 3-3
		int score = 85;
		String result = (!(score > 90)) ? "��" : "��";
		System.out.println(result);
		System.out.println();
		
		
		// 3-4
		int pencil = 534;
		int students = 30;
		
		// �л� 1��� ���� ��
		int pencilsStudent = pencil / students;
		System.out.println(pencilsStudent);
		
		// ���� ���� ��
		int pencilsLeft = pencil % students;
		System.out.println(pencilsLeft);
		System.out.println();
		
		
		// 3-5
		// 10�� �ڸ� ���� ���� (��� �����ڸ� ���)
		int value = 356;
		System.out.println(value - (value % 100));
		System.out.println();
		
		
		// 3-6
		// ��ٸ����� ����
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 3;
		double area = (double)((lengthTop + lengthBottom) / 2) * height;
		System.out.println(area);
		System.out.println();
		
		
		// 3-7
		int xx = 10;
		int yy = 5;
		
		System.out.println((xx > 7) && (yy <= 5));				// true
		System.out.println(((xx % 3) == 2) || ((yy % 2) != 1));	// false
	}
}
