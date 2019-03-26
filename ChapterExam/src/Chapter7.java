
public class Chapter7 {

	public static void main(String[] args) {
		
		// 7-6
		Child child = new Child();
		System.out.println();
		
		
		// 7-7
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}

}

// 7-5
/*
class Parent {
	
	public String name;

	public Parent(String name) {
		this.name = name;
	}
}

class Child extends Parent {
	
	private int studentNo;

	// Child Ŭ������ �����ڴ� Parent Ŭ������ �⺻ �����ڸ� ȣ���ϴµ� Parent Ŭ���������� �⺻ �����ڰ� ����. (������� �����ڰ� �����Ƿ�)  
	public Child(String name, int studentNo) {
		this.name = name;
		this.studentNo = studentNo;
	}
}
*/


// 7-6
class Parent {
	
	public String nation;

	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() call");	// 2nd
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");	// 1st
	}
}

class Child extends Parent {
	
	private String name;

	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");	// 4th
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");	// 3rd
	}
}


// 7-7
class Tire {
	
	public void run() {
		System.out.println("�Ϲ� Ÿ�̾�");
	}
}

class SnowTire extends Tire {
	
	@Override
	public void run() {
		System.out.println("���� Ÿ�̾�");
	}
}