class Operator1
{
	public static void main(String[] args) 
	{
		int age;
		age = 25;
		System.out.println("당신의 나이는 " + age + "살 입니다.");

		String carName;
		carName = "쏘나타";
		System.out.println("당신의 자동차 이름은 " + carName + "입니다.");

		char gender;
		gender = '여';
		System.out.println("당신의 성별은 " + gender + "입니다.\n");

		int x = 10;
		System.out.println("값 : " + x++);				//10
		System.out.println("값 : " + --x);				//10
		System.out.println("값 : " + x++);				//10
		System.out.println("값 : " + ++x);				//12
		System.out.println("값 : " + x--);				//12
		System.out.println("값 : " + --x);				//10
		System.out.println("값 : " + x++);				//10
		System.out.println("값 : " + x + "\n");			//11

		char c = 'a';
		System.out.println("값 : " + c);
		System.out.println("값(int) : " + (int)c + "\n");

		int yy = c;										//자동 형 변환
		System.out.println("값 : " + yy + "\n");

		c = (char)yy;									//강제 형 변환
		System.out.println("값 : " + c + "\n");

		/*
		boolean b = true;								//boolean은 숫자 형태로 변환이 불가능
		int zz = b;
		*/

		int zz = 30;
		double d = zz;
		//zz = d;
		zz = (int)d;

		int y = 24634535;
		int z = 2986;
		System.out.println(y + "과(와) " + z + "을(를) 더한 값 : " + (y + z));
		System.out.println(y + "에서 " + z + "을(를) 뺀 값 : " + (y - z));
		System.out.println(y + "을(를) " + z + "로 나눈 나머지 : " + (y % z));
		System.out.println(y + "을(를) " + z + "로 나눈 값 : " + (y / z) + "\n");

		// 괄호가 없어도 *, /, %는 +보다 우선순위가 높으므로 먼저 수행.
		System.out.println(y + "과(와) " + z + "을(를) 더한 값 : " + y * z);
		System.out.println(y + "과(와) " + z + "을(를) 더한 값 : " + y / z);
		System.out.println(y + "을(를) " + z + "로 나눈 나머지 : " + y % z);
	}
}