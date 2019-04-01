package com.kitri.util.jcf;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Lotto {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Set<Integer> set = new HashSet<Integer>();
		
		/* 规过1
		int total = 6;
		int index = 0;
		int rand;
		
		while(index != total) {
			rand = random.nextInt(45) + 1;
			
			if (!set.contains(rand)) {
				set.add(rand);
				index++;
			}
		}
		
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + "  ");
		}
		*/
		
		/* 规过2 */
		while(set.size() < 6) {
			set.add(random.nextInt(45) + 1);
		}
				
		Integer[] s = set.toArray(new Integer[0]);
		Arrays.sort(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + "  ");
		}
		
	}
}
