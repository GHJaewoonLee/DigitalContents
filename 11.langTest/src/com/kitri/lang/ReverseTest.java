package com.kitri.lang;


public class ReverseTest {

	public static void main(String[] args) {
		
		String str = "!!! avaJ olleH";
				
		long start;
		long end;
		
		// 1)
		String str1 = "";
		int len1 = str.length();
		start = System.nanoTime();
		for (int i = 0; i < len1; i++) {
			str1 = str.substring(i, i + 1) + str1;
		}
		end = System.nanoTime();
		System.out.println(end - start);
		System.out.println(str1);
		System.out.println("e는 " + (str1.indexOf('e') + 1) + "번째에 있습니다.");
		
		// 1-1)
		String strA = "";
		int lenA = str.length();
		start = System.nanoTime();
		for (int i = (lenA - 1); i >= 0; i--) {
			strA = strA.concat(str.substring(i, i + 1));
		}
		end = System.nanoTime();
		System.out.println(end - start);
		System.out.println(strA);
		System.out.println("e는 " + (strA.indexOf('e') + 1) + "번째에 있습니다.");
		
		// 1-2)
		String strB = "";
		int lenB = str.length();
		start = System.nanoTime();
		for (int i = (lenB - 1); i >= 0; i--) {
			strB += str.charAt(i);
		}
		end = System.nanoTime();
		System.out.println(end - start);
		System.out.println(strB);
		System.out.println("e는 " + (strB.indexOf('e') + 1) + "번째에 있습니다.");
				
		// 2)
		String[] s = str.split("");
		String str2 = "";
		int len2 = s.length;
		start = System.nanoTime();
		for (int i = (len2 - 1); i >= 0; i--) {
			str2 += s[i];
		}
		end = System.nanoTime();
		System.out.println(end - start);
		System.out.println(str2);
		System.out.println("e는 " + (str2.indexOf('e') + 1) + "번째에 있습니다.");
		
		// 3)
		String str3 = "";
		char[] c = str.toCharArray();
		int len3 = c.length;
		start = System.nanoTime();
		for (int i = (len3 - 1); i >= 0; i--) {
			str3 += c[i];
		}
		end = System.nanoTime();
		System.out.println(end - start);
		System.out.println(str3);
		System.out.println("e는 " + (str3.indexOf('e') + 1) + "번째에 있습니다.");
		
		// 4)
		String str4 = str;
		start = System.nanoTime();
		str4 = reverseString(str4);
		end = System.nanoTime();
		System.out.println(end - start);
		System.out.println(str4);
		System.out.println("e는 " + (str4.indexOf('e') + 1) + "번째에 있습니다.");
		
		// 5)
		String str5 = "";
		byte[] b = str.getBytes();
		int len5 = b.length;
		start = System.nanoTime();
		for (int i = (len5 - 1); i >= 0; i--) {
			str5 += (char)b[i];
		}
		end = System.nanoTime();
		System.out.println(end - start);
		System.out.println(str5);
		System.out.println("e는 " + (str5.indexOf('e') + 1) + "번째에 있습니다.");
	}

	public static String reverseString(String s) {
		int len = s.length();
		
		if (len == 0 || len == 1) {
			return s;
		}
		
		if ((len % 2) == 0) {
			return reverseString(s.substring(len / 2, len)) + reverseString(s.substring(0, len / 2));
		} else {
			return reverseString(s.substring((len / 2) + 1, len)) + s.substring(len / 2, (len / 2) + 1) + reverseString(s.substring(0, len / 2));
		}
	}
	
}
