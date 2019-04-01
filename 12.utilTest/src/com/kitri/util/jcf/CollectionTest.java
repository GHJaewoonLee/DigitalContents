package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class CollectionTest {

	public static void main(String[] args) {
	
		// ArrayList를 참조하기 때문에 들어가는 순서가 정해짐
		//Collection collection = new ArrayList();
		
		// HashSet을 참조하기 때문에 들어가는 순서가 불규칙함
		
		// Generic을 쓰지 않았기 때문에 Object 배열로 값을 얻어오고, 나중에 강제 형변환이 필요함
		
		Collection collection = new HashSet();
		
		System.out.println("초기 크기 : " + collection.size());
		
		collection.add("홍길동");
		collection.add("이순신");
		collection.add("강감찬");
		collection.add("윤봉길");
		//collection.add(new Integer(10)); // 다른 type의 값을 넣을 일이 없음
		
		System.out.println("마지막 크기 : " + collection.size());
		
		Object[] ob = collection.toArray();
		for (int i = 0; i < ob.length; i++) {
			System.out.println((String)ob[i]);
		}
	}
}
