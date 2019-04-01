package com.kitri.util.jcf;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetTest {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("B");
		
		System.out.println("setÀÇ Å©±â : " + set.size());
		
		String[] s = set.toArray(new String[0]);
		for (int i = 0; i < s.length; i++) {
			System.out.println((String)s[i]);
		}
		
		System.out.println("-----------------------------------------------------");
		Iterator<String> iterate = set.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}
}
