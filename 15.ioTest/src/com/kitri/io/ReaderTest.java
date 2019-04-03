package com.kitri.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


// BufferedReader.readLine();
// DataInput.readLine();
// DataInputStream.readUTF();

public class ReaderTest {

	public static void main(String[] args) {
		
		Reader in = null;
		try {
			in = new InputStreamReader(System.in);
			char[] c = new char[100];
			System.out.print("입력 : ");
			int x = in.read(c);
			System.out.println("x = : " + x);
			
			int len = c.length;
			for (int i = 0; i < len; i++) {
				System.out.println(c[i]);
			}
			
			// 일일이 배열을 만들고 String으로 변환해야 하는 번거로움 존재
			
			String str = new String(c, 0, x - 2);
			System.out.println("x = : " + str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
