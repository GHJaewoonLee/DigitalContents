package com.kitri.android;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.kitri.dto.Child;
import com.kitri.dto.Product;


public class SerializeTest {
	
	public static void main(String[] args) {
		// File name : a.ser
		// 출력스트림 : FileOutputStream
		// 객체출력스트림 : ObjectOutputStream
		ObjectOutputStream objectOutputStream = null;
		try {
			Date now = new Date();
			
			Product product = new Product();
			product.setProd_no("001");
			product.setProd_name("아메리카노");
			product.setProd_price(2500);
			
			Child c = new Child();
			c.setC("Child Instance Variable");
			
			objectOutputStream = new ObjectOutputStream(new FileOutputStream("a.ser"));
			objectOutputStream.writeObject(now);
			objectOutputStream.writeObject(product);
			objectOutputStream.writeObject(c);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (objectOutputStream != null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		// File name : a.ser
		// 입력스트림 : FileInputStream
		// 객체입력스트림 : ObjectInputStream
		ObjectInputStream objectInputStream = null;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream("a.ser"));
			Object obj = objectInputStream.readObject();
			System.out.println(obj);
			
			obj = objectInputStream.readObject();
			System.out.println(obj);
			
			obj = objectInputStream.readObject();
			Child c1 = (Child)obj;
			System.out.println(c1.getC());
			System.out.println(c1.getP());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (objectInputStream != null) {
				try {
					objectInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
