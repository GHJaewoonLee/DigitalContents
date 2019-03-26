public class Operator2 {

	public static void main(String[] args) {
		// 산술 연산자 : *, /, %, +, -
		// 비교 연산자 : >, >=, <, <==, ==, !=
		//               instance of : 객체 타입 비교
		// 논리 연산자 : &&, ||

		int x = 10, y = 15, z = 20;

		System.out.println(x + " > " + y + " : " + (x > y));
		System.out.println(x + " == " + z + " / 2 : " + (x == (z / 2)));
		System.out.println("");

		System.out.println((x < y) && (y > z));	// false
		System.out.println((x < y) || (y > z));	// true
		System.out.println("");

		// 삼항 연산자 : ?

		int jumin = 2;
		String gender = ((jumin % 2) == 0) ? "여자" : "남자";
		System.out.println("주민번호가 " + jumin + "인 당신은 " + gender + "입니다. \n");

		// 점수가 80점 이상이면 합격, 80점 미만이면 불합격
		// 당신의 점수는 xx점 이므로 xx입니다.
		int score = 80;
		String result = (score >= 80) ? "합격" : "불합격";
		System.out.println("당신의 점수는 " + score + "점 이므로 " + result + "입니다. \n");

		// 대입 연산자 : =, +=, -=, *=, /=, %=

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
		// v의 값을 1증가시키는 방법?
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
