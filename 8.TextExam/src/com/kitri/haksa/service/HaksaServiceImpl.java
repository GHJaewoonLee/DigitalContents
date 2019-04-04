package com.kitri.haksa.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;

import com.kitri.haksa.data.HaksaDto;


public class HaksaServiceImpl implements HaksaService {

	private ArrayList<HaksaDto> list;
	private String[] job = {"�й�", "����", "�μ�"};
	private BufferedReader in;
	
	
	public HaksaServiceImpl() {
		list = new ArrayList<HaksaDto>();
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	
	@Override
	public void menu() {
		String menuNum = "";
		
		while (true) {
			System.out.println("========== �޴� ���� ==========");
			System.out.println("1. ���");
			System.out.println("2. ã��");
			System.out.println("3. ����");
			System.out.println("4. ��ü ���");
			System.out.println("--------------------");
			System.out.println("0. ����");
			System.out.println("--------------------");
			System.out.print("��ȣ�� ������ �ּ���..  ");
			
			try {
				menuNum = in.readLine();
				
				switch (menuNum) {
					case "1" : registerMenu();
							   break;
				
					case "2" : findNameMenu();
							   break;
					
					case "3" : deleteMenu();
							   break;
					
					case "4" : selectAll();
							   break;
					
					case "0" : processExit();
							   break;
					
					default : System.out.println("�޴��� �ٽ� �������ּ���.");
				}
			} catch (IOException e) {
				System.out.println("IO Exception�� �߻��Ͽ����ϴ�.");
				e.printStackTrace();
				processExit();
			}
		}
	}

	@Override
	public void registerMenu() {
		boolean continued = true;
		
		while (continued) {
			String age;
			String name;
			String value;
			
			System.out.println("========== �޴� ���� ==========");
			System.out.println("1. �л�");
			System.out.println("2. ����");
			System.out.println("3. ������");
			System.out.println("4. �����޴�");
			System.out.print("��ȣ�� ������ �ּ���.. ");
			
			try {
				int menuRegisterNum = Integer.parseInt(in.readLine());
				
				if (menuRegisterNum < 0 || (menuRegisterNum > 4)) {
					System.out.println("�޴��� �ٽ� �������ּ���.");
					continue;
				}
				
				if (menuRegisterNum == 4) {
					continued = false;
					break;
				}
				
				System.out.print("�� �� : ");
				
				while (true) {
					age = in.readLine();
					
					if (isIntegerNumber(age)) {
						break;
					}
					
					System.out.println("���̸� �ٽ� �Է����ּ���.");
					System.out.print("�� �� : ");
				}
				
				System.out.print("�� �� : ");
				name = in.readLine();
				
				switch (menuRegisterNum) {
					case 1 : System.out.print("�� �� : ");
							 break;
					case 2 : System.out.print("�� �� : ");
							 break;
					case 3 : System.out.print("�� �� : ");
							 break;
				}
				
				value = in.readLine();
				
				register(new HaksaDto(Integer.parseInt(age), name, menuRegisterNum, value));
			} catch (IOException e) {
				System.out.println("IO Exception�� �߻��Ͽ����ϴ�.");
				e.printStackTrace();
				processExit();
			}
		}
	}

	@Override
	public void register(HaksaDto haksa) {
		list.add(haksa);
		
		System.out.println("��ϵǾ����ϴ�.");
	}

	@Override
	public void findNameMenu() {
		HaksaDto haksaDto = null;
		boolean continued = true; 
		
		while (continued) {
			try {
				System.out.println("ã�� �̸��� �Է��� �ּ���.");
				System.out.print("�̸� : ");

				String name = in.readLine();
				haksaDto = findName(name);
				
				if (haksaDto != null) {
					System.out.println("���� : " + haksaDto.getAge() + "\t\t\t" + "�̸� : " + haksaDto.getName() + "\t\t" + job[haksaDto.getKey() - 1] + " : " + haksaDto.getValue());
				} else {
					System.out.println(name + "���� �����ϴ�.");
				}
				
				System.out.print("��� �Ͻ÷��� 1, ���� �Ͻ÷��� 0�� �Է��� �ּ��� ");

				String menu;
				while (true) {
					menu = in.readLine();
				
					if (menu.equals("1")) {
						break;
					} else if (menu.equals("0")) {
						continued = false;
						break;
					} else {
						System.out.print("�ٽ� �Է��� �ּ��� ");
					}
				}
			} catch (IOException e) {
				System.out.println("IO Exception�� �߻��Ͽ����ϴ�.");
				e.printStackTrace();
				processExit();
			}
		}
	}

	@Override
	public HaksaDto findName(String name) {
		HaksaDto haksaDto = null;
		ListIterator<HaksaDto> listIterator = list.listIterator();
		
		while (listIterator.hasNext()) {
			haksaDto = listIterator.next();

			if (name.equals(haksaDto.getName())) {
				return haksaDto;
			}
		}
		
		return null;
	}

	@Override
	public void deleteMenu() {
		boolean continued = true; 
		
		while (continued) {
			try {
				int result;
				System.out.println("������ ����� �̸��� �Է��� �ּ���.");
				System.out.print("�̸� : ");
				
				String name = in.readLine();
				result = delete(name);
				
				switch (result) {
					case 0 : System.out.println(name + "���� �����Ͽ����ϴ�.");
							 break;
							 
					case -1 : System.out.println(name + "���� �����ϴ�.");
							  break;
							  
				    default : System.out.println("�� �� ���� ������ �߻��Ͽ����ϴ�.");
				}
				
				System.out.print("��� �Ͻ÷��� 1, ���� �Ͻ÷��� 0�� �Է��� �ּ��� ");

				String menu;
				while (true) {
					menu = in.readLine();
				
					if (menu.equals("1")) {
						break;
					} else if (menu.equals("0")) {
						continued = false;
						break;
					} else {
						System.out.print("�ٽ� �Է��� �ּ��� ");
					}
				}
			} catch (IOException e) {
				System.out.println("IO Exception�� �߻��Ͽ����ϴ�.");
				e.printStackTrace();
				processExit();
			}
		}
	}

	@Override
	public int delete(String name) {
		HaksaDto haksaDto = findName(name);
		
		if (haksaDto != null) {
			list.remove(haksaDto);
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public void selectAll() {
		boolean continued = true;
		ListIterator<HaksaDto> listIterator;
		HaksaDto haksaDto = null;
		
		while (continued) {
			if (list.size() == 0) {
				System.out.println("�����Ͱ� �����ϴ�.");
				break;
			}
			
			listIterator = list.listIterator();
			
			while (listIterator.hasNext()) {
				haksaDto = listIterator.next();
				System.out.println("���� : " + haksaDto.getAge() + "\t\t\t" + "�̸� : " + haksaDto.getName() + "\t\t" + job[haksaDto.getKey() - 1] + " : " + haksaDto.getValue());
			}
			
			System.out.print("��� �Ͻ÷��� 1, ���� �Ͻ÷��� 0�� �Է��� �ּ��� ");
			try {
				String menu;
				while (true) {
					menu = in.readLine();
				
					if (menu.equals("1")) {
						break;
					} else if (menu.equals("0")) {
						continued = false;
						break;
					} else {
						System.out.print("�ٽ� �Է��� �ּ��� ");
					}
				}
			} catch (IOException e) {
				System.out.println("IO Exception�� �߻��Ͽ����ϴ�.");
				e.printStackTrace();
				processExit();
			}
		}
	}

	@Override
	public void processExit() {
		System.exit(0);
	}
	
	
	private boolean isIntegerNumber(String str) {
		boolean flag = true;
		int len = str.length();
		
		if (len == 0) {
			return false;
		}
		
		for (int i = 0; i < len; i++) {
			if (((str.charAt(i) < '0') || (str.charAt(i) > '9'))) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
}
