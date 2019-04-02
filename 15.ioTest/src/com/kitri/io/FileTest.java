package com.kitri.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileTest {

	public static void main(String[] args) {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			File inFile = new File("d:\\iotest\\hello.txt");
			in = new FileInputStream(inFile);
			long length = inFile.length();
			byte[] b = new byte[(int)length];
			int x = in.read(b);
			String str = new String(b, 0, x);
			System.out.println(x + "bytes read");
			System.out.println(str);
			
			File outFile = new File("d:\\iotest\\hello_copy.txt");
			out = new FileOutputStream(outFile);
			out.write(b);
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
