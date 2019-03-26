public class Operator2 {

	public static void main(String[] args) {
		// ��� ������ : *, /, %, +, -
		// �� ������ : >, >=, <, <==, ==, !=
		//               instance of : ��ü Ÿ�� ��
		// �� ������ : &&, ||

		int x = 10, y = 15, z = 20;

		System.out.println(x + " > " + y + " : " + (x > y));
		System.out.println(x + " == " + z + " / 2 : " + (x == (z / 2)));
		System.out.println("");

		System.out.println((x < y) && (y > z));	// false
		System.out.println((x < y) || (y > z));	// true
		System.out.println("");

		// ���� ������ : ?

		int jumin = 2;
		String gender = ((jumin % 2) == 0) ? "����" : "����";
		System.out.println("�ֹι�ȣ�� " + jumin + "�� ����� " + gender + "�Դϴ�. \n");

		// ������ 80�� �̻��̸� �հ�, 80�� �̸��̸� ���հ�
		// ����� ������ xx�� �̹Ƿ� xx�Դϴ�.
		int score = 80;
		String result = (score >= 80) ? "�հ�" : "���հ�";
		System.out.println("����� ������ " + score + "�� �̹Ƿ� " + result + "�Դϴ�. \n");

		// ���� ������ : =, +=, -=, *=, /=, %=

		int w = 0;
		System.out.println("1. w = " + w);
		w = 10;
		System.out.println("2. w = " + w);
		w += 5;
		System.out.println("3. w = " + w);
		w -= 5;
		System.out.println("4. w = " + w);
		w *= 5;
		System.out.println("5. w = " + w);
		w /= 5;
		System.out.println("6. w = " + w);

		// Test
		// v�� ���� 1������Ű�� ���?
		/*
			v++;
			++v;
			x = x + 1;
			x += 1;
		*/

		int v = 0 / 10;
		System.out.println("v = " + v);
		/*
		v = 10 / 0;
		System.out.println("v = " + v);
		*/
	}
}
