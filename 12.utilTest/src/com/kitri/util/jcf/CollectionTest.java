package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class CollectionTest {

	public static void main(String[] args) {
	
		// ArrayList�� �����ϱ� ������ ���� ������ ������
		//Collection collection = new ArrayList();
		
		// HashSet�� �����ϱ� ������ ���� ������ �ұ�Ģ��
		
		// Generic�� ���� �ʾұ� ������ Object �迭�� ���� ������, ���߿� ���� ����ȯ�� �ʿ���
		
		Collection collection = new HashSet();
		
		System.out.println("�ʱ� ũ�� : " + collection.size());
		
		collection.add("ȫ�浿");
		collection.add("�̼���");
		collection.add("������");
		collection.add("������");
		//collection.add(new Integer(10)); // �ٸ� type�� ���� ���� ���� ����
		
		System.out.println("������ ũ�� : " + collection.size());
		
		Object[] ob = collection.toArray();
		for (int i = 0; i < ob.length; i++) {
			System.out.println((String)ob[i]);
		}
	}
}
