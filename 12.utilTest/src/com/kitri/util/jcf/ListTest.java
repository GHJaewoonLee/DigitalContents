package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.List;


public class ListTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		System.out.println("초기 크기 : " + list.size());
		
		list.add("허경민");
		list.add("정수빈");
		list.add("박건우");
		list.add("김재환");
		
		System.out.println("초기 크기 : " + list.size());
		System.out.println("-- 두산의 타순 --");
		
		int len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println((i + 1) + "번째 타자 : " + list.get(i));
		}
		
//		ListIterator<String> iterator = list.listIterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next() + "  ");
//		}
		
		String name = "정수빈";
		int index = list.indexOf(name);
		System.out.println(name + "은 " + (index + 1) + "번째 타자입니다.");

		/*
		for (int i = 0; i < len; i++) {
			if (list.get(i).equals(name)) {
				System.out.println(name + "은 " + (i + 1) + "번째 타자입니다.");
				break;
			}
		}
		*/
		
		String name2 = "오재원";
		list.set(index, name2);
		System.out.println(name + "을 " + name2 + "으로 교체");
		
		/*
		for (int i = 0; i < len; i++) {
			if (list.get(i).equals(name)) {
				System.out.println(name + "은 " + (i + 1) + "번째 타자입니다.");
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
			System.out.println((i + 1) + "번째 타자 : " + list.get(i));
		}
	}
}
