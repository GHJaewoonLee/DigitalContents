import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Chapter11 {

	public static void main(String[] args) {
		
		// 11-3
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 헉생의 총첨 : " + score);
		System.out.println();
		
		
		// 11-4
		Member member = new Member("Blue", "Lee");
		System.out.println(member);
		System.out.println();
		
		
		// 11-6
		byte[] values = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(values);
		System.out.println(str);
		System.out.println();
		
		
		// 11-7
		String str1 = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str1.indexOf("자바");
		
		if (index == -1) {
			System.out.println("미 포함");
		} else {
			System.out.println("포함");
			str1 = str1.replaceAll("자바", "Java");
			System.out.println("-->" + str1);
		}
		
		
		// 11-8
		String str2 = "아이디,이름,패스워드";
		
		String[] split = str2.split(",");
		int len1 = split.length;
		for (int i = 0; i < len1; i++) {
			System.out.println(split[i]);
		}
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str2, ",");
		int len2 = st.countTokens();
		for (int i = 0; i < len2; i++) {
			System.out.println(st.nextToken());
		}
		System.out.println();
		
		
		// 11-9
		String str3 = "";
		for (int i = 1; i <= 100; i++) {
			str3 += i;
		}
		
		System.out.println(str3);
		
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			strBuilder.append(i);
		}
		
		System.out.println(strBuilder);
		System.out.println();
		
		
		// 11-10
		String id = "5Angel004";
		String regExp = "[a-zA-Z][a-zA-Z_0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		
		if (isMatch) {
			System.out.println("Possible");
		} else {
			System.out.println("Impossible");
		}
		System.out.println();
		
		
		// 11-11
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		// 원칙적으로 Wrapper Class는 ==나 !=로 객체 내부의 값을 비교할 수 없음. 
		System.out.println(obj1 == obj2); 	// 100은  -128 ~ 127 사이의 값이므로 ==를 사용하여 비교 가능 
		System.out.println(obj3 == obj4);	// 300은  -128 ~ 127 사이의 값이 아니므로 ==를 사용하여 비교 불가능
		System.out.println();
		
		
		// 11-12
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		System.out.println(intData1);
		
		int intData2 = 150;
		String strData2 = "" + intData2;
		System.out.println(strData2);
		System.out.println();
		
		
		// 11-13
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 d일 E요일 k시 m분");
		System.out.println(sdf.format(now));
	}

}


// 11-3
class Student {
	
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student student = (Student)obj;
	
		return getStudentNum().hashCode() == student.studentNum.hashCode();
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}


// 11-4
class Member {
	
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + " : " + name;
	}
}