class Operator1
{
	public static void main(String[] args) 
	{
		int age;
		age = 25;
		System.out.println("����� ���̴� " + age + "�� �Դϴ�.");

		String carName;
		carName = "�Ÿ";
		System.out.println("����� �ڵ��� �̸��� " + carName + "�Դϴ�.");

		char gender;
		gender = '��';
		System.out.println("����� ������ " + gender + "�Դϴ�.\n");

		int x = 10;
		System.out.println("�� : " + x++);				//10
		System.out.println("�� : " + --x);				//10
		System.out.println("�� : " + x++);				//10
		System.out.println("�� : " + ++x);				//12
		System.out.println("�� : " + x--);				//12
		System.out.println("�� : " + --x);				//10
		System.out.println("�� : " + x++);				//10
		System.out.println("�� : " + x + "\n");			//11

		char c = 'a';
		System.out.println("�� : " + c);
		System.out.println("��(int) : " + (int)c + "\n");

		int yy = c;										//�ڵ� �� ��ȯ
		System.out.println("�� : " + yy + "\n");

		c = (char)yy;									//���� �� ��ȯ
		System.out.println("�� : " + c + "\n");

		/*
		boolean b = true;								//boolean�� ���� ���·� ��ȯ�� �Ұ���
		int zz = b;
		*/

		int zz = 30;
		double d = zz;
		//zz = d;
		zz = (int)d;

		int y = 24634535;
		int z = 2986;
		System.out.println(y + "��(��) " + z + "��(��) ���� �� : " + (y + z));
		System.out.println(y + "���� " + z + "��(��) �� �� : " + (y - z));
		System.out.println(y + "��(��) " + z + "�� ���� ������ : " + (y % z));
		System.out.println(y + "��(��) " + z + "�� ���� �� : " + (y / z) + "\n");

		// ��ȣ�� ��� *, /, %�� +���� �켱������ �����Ƿ� ���� ����.
		System.out.println(y + "��(��) " + z + "��(��) ���� �� : " + y * z);
		System.out.println(y + "��(��) " + z + "��(��) ���� �� : " + y / z);
		System.out.println(y + "��(��) " + z + "�� ���� ������ : " + y % z);
	}
}