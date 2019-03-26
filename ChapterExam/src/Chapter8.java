
public class Chapter8 {

	// 8-3
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		
		// 8-3
		printSound(new Cat());
		printSound(new Dog());
		System.out.println();
		
		
		// 8-4
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		System.out.println();
		
		
		// 8-5
		Action action = new Action() {
							public void work() {
								System.out.println("����");
							}
						};
		
		action.work();
	}
}


// 8-3
interface Soundable {
	
	String sound();
}

class Cat implements Soundable {
	
	public String sound() {
		return "�߿�";
	}
}

class Dog implements Soundable {
	
	public String sound() {
		return "�۸�";
	}
}


// 8-4
interface DataAccessObject {
	
	void select();
	void insert();
	void update();
	void delete();
}

class OracleDao implements DataAccessObject {
	private String name;
	
	OracleDao() {
		name = "Oracle DB";
	}

	public String getName() {
		return name;
	}

	@Override
	public void select() {
		System.out.println(getName() + "���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println(getName() + "�� ����");		
	}

	@Override
	public void update() {
		System.out.println(getName() + "�� ����");
	}

	@Override
	public void delete() {
		System.out.println(getName() + "���� ����");
	}
}

class MySqlDao implements DataAccessObject {
	private String name;
	
	MySqlDao() {
		name = "MySql DB";
	}

	public String getName() {
		return name;
	}

	@Override
	public void select() {
		System.out.println(getName() + "���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println(getName() + "�� ����");		
	}

	@Override
	public void update() {
		System.out.println(getName() + "�� ����");
	}

	@Override
	public void delete() {
		System.out.println(getName() + "���� ����");
	}
}


// 8-5
interface Action {
	void work();
}