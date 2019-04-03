package com.kitri.io;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderTest {

	public static void main(String[] args) {

//		InputStream is = System.in;
//		Reader r = new InputStreamReader(is);
//		BufferedReader in = new BufferedReader(r);
		
		BufferedReader fin = null;
		FileWriter fw = null;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("파일이름 : ");
			String inFile = in.readLine();
			System.out.println("inFile = " + inFile);
			
			System.out.print("복사할 파일이름 : ");
			String outFile = in.readLine();
			fw = new FileWriter(new File(outFile));
			
			fin = new BufferedReader(new InputStreamReader(/* System, File, Network */new FileInputStream(new File(inFile))));
			String str = null;
			while ((str = fin.readLine()) != null) {
				System.out.println(str);
				fw.write(str + "\r\n");
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
				
				if (fin != null) {
					fin.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
