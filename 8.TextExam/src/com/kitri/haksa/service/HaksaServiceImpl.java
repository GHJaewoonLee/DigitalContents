package com.kitri.haksa.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;

import com.kitri.haksa.data.HaksaDto;


public class HaksaServiceImpl implements HaksaService {

	private ArrayList<HaksaDto> list;
	private String[] job = {"학번", "과목", "부서"};
	private BufferedReader in;
	
	
	public HaksaServiceImpl() {
		list = new ArrayList<HaksaDto>();
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	
	@Override
	public void menu() {
		String menuNum = "";
		
		while (true) {
			System.out.println("========== 메뉴 선택 ==========");
			System.out.println("1. 등록");
			System.out.println("2. 찾기");
			System.out.println("3. 삭제");
			System.out.println("4. 전체 출력");
			System.out.println("--------------------");
			System.out.println("0. 종료");
			System.out.println("--------------------");
			System.out.print("번호를 선택해 주세요..  ");
			
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
					
					default : System.out.println("메뉴를 다시 선택해주세요.");
				}
			} catch (IOException e) {
				System.out.println("IO Exception이 발생하였습니다.");
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
			
			System.out.println("========== 메뉴 선택 ==========");
			System.out.println("1. 학생");
			System.out.println("2. 교수");
			System.out.println("3. 관리자");
			System.out.println("4. 이전메뉴");
			System.out.print("번호를 선택해 주세요.. ");
			
			try {
				int menuRegisterNum = Integer.parseInt(in.readLine());
				
				if (menuRegisterNum < 0 || (menuRegisterNum > 4)) {
					System.out.println("메뉴를 다시 선택해주세요.");
					continue;
				}
				
				if (menuRegisterNum == 4) {
					continued = false;
					break;
				}
				
				System.out.print("나 이 : ");
				
				while (true) {
					age = in.readLine();
					
					if (isIntegerNumber(age)) {
						break;
					}
					
					System.out.println("나이를 다시 입력해주세요.");
					System.out.print("나 이 : ");
				}
				
				System.out.print("이 름 : ");
				name = in.readLine();
				
				switch (menuRegisterNum) {
					case 1 : System.out.print("학 번 : ");
							 break;
					case 2 : System.out.print("과 목 : ");
							 break;
					case 3 : System.out.print("부 서 : ");
							 break;
				}
				
				value = in.readLine();
				
				register(new HaksaDto(Integer.parseInt(age), name, menuRegisterNum, value));
			} catch (IOException e) {
				System.out.println("IO Exception이 발생하였습니다.");
				e.printStackTrace();
				processExit();
			}
		}
	}

	@Override
	public void register(HaksaDto haksa) {
		list.add(haksa);
		
		System.out.println("등록되었습니다.");
	}

	@Override
	public void findNameMenu() {
		HaksaDto haksaDto = null;
		boolean continued = true; 
		
		while (continued) {
			try {
				System.out.println("찾을 이름을 입력해 주세요.");
				System.out.print("이름 : ");

				String name = in.readLine();
				haksaDto = findName(name);
				
				if (haksaDto != null) {
					System.out.println("나이 : " + haksaDto.getAge() + "\t\t\t" + "이름 : " + haksaDto.getName() + "\t\t" + job[haksaDto.getKey() - 1] + " : " + haksaDto.getValue());
				} else {
					System.out.println(name + "님은 없습니다.");
				}
				
				System.out.print("계속 하시려면 1, 종료 하시려면 0을 입력해 주세요 ");

				String menu;
				while (true) {
					menu = in.readLine();
				
					if (menu.equals("1")) {
						break;
					} else if (menu.equals("0")) {
						continued = false;
						break;
					} else {
						System.out.print("다시 입력해 주세요 ");
					}
				}
			} catch (IOException e) {
				System.out.println("IO Exception이 발생하였습니다.");
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
				System.out.println("삭제할 사람의 이름을 입력해 주세요.");
				System.out.print("이름 : ");
				
				String name = in.readLine();
				result = delete(name);
				
				switch (result) {
					case 0 : System.out.println(name + "님을 삭제하였습니다.");
							 break;
							 
					case -1 : System.out.println(name + "님은 없습니다.");
							  break;
							  
				    default : System.out.println("알 수 없는 문제가 발생하였습니다.");
				}
				
				System.out.print("계속 하시려면 1, 종료 하시려면 0을 입력해 주세요 ");

				String menu;
				while (true) {
					menu = in.readLine();
				
					if (menu.equals("1")) {
						break;
					} else if (menu.equals("0")) {
						continued = false;
						break;
					} else {
						System.out.print("다시 입력해 주세요 ");
					}
				}
			} catch (IOException e) {
				System.out.println("IO Exception이 발생하였습니다.");
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
				System.out.println("데이터가 없습니다.");
				break;
			}
			
			listIterator = list.listIterator();
			
			while (listIterator.hasNext()) {
				haksaDto = listIterator.next();
				System.out.println("나이 : " + haksaDto.getAge() + "\t\t\t" + "이름 : " + haksaDto.getName() + "\t\t" + job[haksaDto.getKey() - 1] + " : " + haksaDto.getValue());
			}
			
			System.out.print("계속 하시려면 1, 종료 하시려면 0을 입력해 주세요 ");
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
						System.out.print("다시 입력해 주세요 ");
					}
				}
			} catch (IOException e) {
				System.out.println("IO Exception이 발생하였습니다.");
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
