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
		System.out.println("1�� ����� ��÷ : " + score);
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
		String str1 = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str1.indexOf("�ڹ�");
		
		if (index == -1) {
			System.out.println("�� ����");
		} else {
			System.out.println("����");
			str1 = str1.replaceAll("�ڹ�", "Java");
			System.out.println("-->" + str1);
		}
		
		
		// 11-8
		String str2 = "���̵�,�̸�,�н�����";
		
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
		
		// ��Ģ������ Wrapper Class�� ==�� !=�� ��ü ������ ���� ���� �� ����. 
		System.out.println(obj1 == obj2); 	// 100��  -128 ~ 127 ������ ���̹Ƿ� ==�� ����Ͽ� �� ���� 
		System.out.println(obj3 == obj4);	// 300��  -128 ~ 127 ������ ���� �ƴϹǷ� ==�� ����Ͽ� �� �Ұ���
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
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� d�� E���� k�� m��");
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