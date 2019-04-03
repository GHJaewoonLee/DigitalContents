package com.kitri.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileReaderTest {

	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		try {
			File inFile = new File("d:\\iotest\\hello.txt");
			fr = new FileReader(inFile);
			long length = inFile.length();
			char[] c = new char[(int)length];
			int x = fr.read(c);
			System.out.println(x + "characters read");
			String str = new String(c);
			System.out.println(str);
			
			File outFile = new File("d:\\iotest\\hello_copy2.txt");
			fw = new FileWriter(outFile);
			fw.write(str);
			// write 후 close 해야 내용이 저장됨
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
				
				if (fr != null) {
					fr.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
