package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.List;


public class ListTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		System.out.println("�ʱ� ũ�� : " + list.size());
		
		list.add("����");
		list.add("������");
		list.add("�ڰǿ�");
		list.add("����ȯ");
		
		System.out.println("�ʱ� ũ�� : " + list.size());
		System.out.println("-- �λ��� Ÿ�� --");
		
		int len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println((i + 1) + "��° Ÿ�� : " + list.get(i));
		}
		
//		ListIterator<String> iterator = list.listIterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next() + "  ");
//		}
		
		String name = "������";
		int index = list.indexOf(name);
		System.out.println(name + "�� " + (index + 1) + "��° Ÿ���Դϴ�.");

		/*
		for (int i = 0; i < len; i++) {
			if (list.get(i).equals(name)) {
				System.out.println(name + "�� " + (i + 1) + "��° Ÿ���Դϴ�.");
				break;
			}
		}
		*/
		
		String name2 = "�����";
		list.set(index, name2);
		System.out.println(name + "�� " + name2 + "���� ��ü");
		
		/*
		for (int i = 0; i < len; i++) {
			if (list.get(i).equals(name)) {
				System.out.println(name + "�� " + (i + 1) + "��° Ÿ���Դϴ�.");
				break;
			}
		}
		
		for (int i = 0; i < len; i++) {
			if (list.get(i).equals(name)) {
				list.set(i, name2);
				break;
			}
		}
		*/
		
		len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println((i + 1) + "��° Ÿ�� : " + list.get(i));
		}
	}
}
