import java.util.Scanner;

public class Chapter6 {

	// 6-20
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 6-15
		MemberService ms = new MemberService();
		boolean result = ms.login("hong", "12345");
		
		if (result) {
			System.out.println("Login");
			ms.logout("hong");
		} else {
			System.out.println("Wrong ID/PW");
		}
		
		System.out.println();
		
		
		// 6-16
		Printer p = new Printer();
		p.println(true);
		p.println(3.0);
		p.println(5);
		p.println("Name");
		System.out.println();
		
		
		// 6-17
		/*
		Printer.println(true);
		Printer.println(3.0);
		Printer.println(5);
		Printer.println("Name");
		System.out.println();
		*/
		
		
		// 6-19
		/*
		Account account = new Account();
		
		account.deposit(500000);
		System.out.println("���� �ܾ� : " + account.getBalance());
		
		account.withdraw(300000);
		System.out.println("���� �ܾ� : " + account.getBalance());
		
		account.deposit(400000);
		System.out.println("���� �ܾ� : " + account.getBalance());
		
		account.withdraw(700000);
		System.out.println("���� �ܾ� : " + account.getBalance());
		
		account.deposit(300000);
		System.out.println("���� �ܾ� : " + account.getBalance());
		
		account.deposit(800000);
		System.out.println("���� �ܾ� : " + account.getBalance());
		
		account.withdraw(700000);
		System.out.println("���� �ܾ� : " + account.getBalance());
		System.out.println();
		*/
		
		
		// 6-20
		boolean run = true;
		
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("--------------------------------------------");
			System.out.print("���� > ");
			
			int selectNo = scanner.nextInt();
			
			switch (selectNo) {
				case 1 : createAccount(); break;
				case 2 : accountList(); break;
				case 3 : deposit(); break;
				case 4 : withdraw(); break;
				case 5 : run = false; break;
				default : System.out.println("�߸� �Է�");
			}
		}
		
		System.out.println("���α׷� ����");
	}
	
	// 6-20
	private static void createAccount() {
		int len = accountArray.length;
		
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		
		for (int i = 0; i < len; i++) {
			if (accountArray[i] == null) {
				String str1, str2;
				int initDeposit;
				
				do {
					System.out.print("���¹�ȣ : ");
					str1 = scanner.next();
				} while ((str1.length() != 7) || !(str1.substring(3, 4).equals("-")));
				
				System.out.print("������ : ");
				str2 = scanner.next();
				
				do {
					System.out.print("�ʱ��Աݾ� : ");
					initDeposit = scanner.nextInt();
				} while (initDeposit < 0);
				
				System.out.print("��� : ");
				accountArray[i] = new Account(str1, str2, initDeposit);
				break;
			}
		}
	}
	
	private static void accountList() {
		int len = accountArray.length;
		
		System.out.println("------");
		System.out.println("���¸��");
		System.out.println("------");
		
		for (int i = 0; i < len; i++) {
			if (accountArray[i] == null) {
				break;
			}
			
			System.out.println(accountArray[i].toString());
		}
	}
	
	private static void deposit() {
		Account account;
		int money;
		String str;
		
		System.out.println("----");
		System.out.println("����");
		System.out.println("----");
		
		System.out.print("���¹�ȣ : ");
		str = scanner.next();
		System.out.print("���ݾ� : ");
		money = scanner.nextInt();
		
		account = findAccount(str);
		
		System.out.print("��� : ");
		if (account != null) {
			if (money >= 0) {
				account.setBalance(account.getBalance() + money);
				System.out.println("������ �����ǿ����ϴ�");
			} else {
				System.out.println("���ݾ��� ������ �� �� �����ϴ�");
			}
		} else {
			System.out.println("�ش� ���°� �����ϴ�.");
		}
	}
	
	private static void withdraw() {
		Account account;
		int money;
		String str;
		
		System.out.println("----");
		System.out.println("���");
		System.out.println("----");
		
		System.out.print("���¹�ȣ : ");
		str = scanner.next();
		System.out.print("��ݾ� : ");
		money = scanner.nextInt();
		
		account = findAccount(str);
		
		System.out.print("��� : ");
		if (account != null) {
			if (account.getBalance() >= money) {
				if (money >= 0) {
					account.setBalance(account.getBalance() - money);
					System.out.println("����� �����ǿ����ϴ�");
				} else {
					System.out.println("��ݾ��� ������ �� �� �����ϴ�");
				}
			} else {
				System.out.println("�����ܾ��� ��ݾ׺��� �����ϴ�.");
			}
		} else {
			System.out.println("�ش� ���°� �����ϴ�.");
		}
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		int len = accountArray.length;
		
		for (int i = 0; i < len; i++) {
			if (accountArray[i] == null) {
				break;
			}
			
			if (accountArray[i].getAno().equals(ano)) {
				account = accountArray[i];
			}
		}
		
		return account;
	}
}

// 6-12
/*
class Member {
	
	private String name; 				// field
	private Member(String name) {} 		// constructor
	public void setName(String name) {} // method
}
*/


// 6-13
/*
class Member {
	
	String name;
	String id;
	String password;
	int age;
	
	// 6-14
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
}
*/

// 6-15
class MemberService {
	
	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}
		
		return false;
	}
	
	void logout(String id) {
		if (id.equals("hong")) {
			System.out.println("Logout");
		}
	}
}


// 6-16, 6-17
class Printer {
	
	/*static*/ void println(int i) {
		System.out.println(i);
	}
	
	/*static*/ void println(double d) {
		System.out.println(d);
	}
	
	/*static*/ void println(String s) {
		System.out.println(s);
	}
	
	/*static*/ void println(boolean b) {
		System.out.println(b);
	}
}


// 6-19
/*
class Account {
	
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000;
	
	private int balance;
	
	Account() {
		balance = MIN_BALANCE;
	}
	
	void deposit(int money) {
		if (money < 0) {
			System.out.println("�ݾ��� ������ �� �� �����ϴ�.");
			return;
		}
		
		if ((this.balance + money) > MAX_BALANCE) {
			System.out.println("���� �ѵ��� �ʰ��ϴ� �ݾ��� �Ա��� �� �����ϴ�.");
			return;
		}
		
		System.out.println(money + "���� �Ա޵Ǿ����ϴ�.");
		this.balance += money; 
	}
	
	void withdraw(int money) {
		if (money < 0) {
			System.out.println("�ݾ��� ������ �� �� �����ϴ�.");
			return;
		}
		
		if ((this.balance - money) < MIN_BALANCE) {
			System.out.println("���� �ѵ��� �ʰ��ϴ� �ݾ��� ����� �� �����ϴ�.");
			return;
		}
		
		System.out.println(money + "���� ��޵Ǿ����ϴ�.");
		this.balance -= money; 
	}
	
	int getBalance() {
		return balance;
	}
}
*/


// 6-20
class Account {
	
	private String ano;
	private String onwer;
	private int balance;
	
	
	public Account(String ano, String onwer, int balance) {
		this.ano = ano;
		this.onwer = onwer;
		this.balance = balance;
		System.out.println("���°� �����Ǿ����ϴ�.");
	}


	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOnwer() {
		return onwer;
	}

	public void setOnwer(String onwer) {
		this.onwer = onwer;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return getAno() + "\t\t" + getOnwer() + "\t\t" + getBalance();
	}
}