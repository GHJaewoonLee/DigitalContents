
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

	// Child 클래스의 생성자는 Parent 클래스의 기본 생성자를 호출하는데 Parent 클래스에서는 기본 생성자가 없다. (명시적인 생성자가 있으므로)  
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
		this("대한민국");
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
		this("홍길동");
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
		System.out.println("일반 타이어");
	}
}

class SnowTire extends Tire {
	
	@Override
	public void run() {
		System.out.println("눈길 타이어");
	}
}