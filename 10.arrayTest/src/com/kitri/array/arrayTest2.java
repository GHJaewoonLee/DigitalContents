package com.kitri.array;

public class arrayTest2 {

	public static void main(String[] args) {
		
		Car car[] = new Car[6];
		car[0] = new Car("Sonata", "Black", "Hyundai");
		car[1] = new Car("K5", "White", "KIA");
		car[2] = new Car("SM5", "Silver", "Samsung");
		car[3] = new Car("Avante", "Blue", "Hyundai");
		car[4] = new Car("Nero", "Pigeon", "KIA");
		car[5] = new Car("Santafe", "Black", "Hyundai");
		int i;
		for (i = 0; i < car.length; i++) {
			System.out.println((i + 1) + "��° ���� : " + car[i]);
		}

		String name = "Nero";
		//String name = "QM5";
		
		//Car findCar = null;
		//int count = 0;
		for (i = 0; i < car.length; i++) {
			if (car[i].getCarName().equals(name)) {
				// findCar = car[i];
				// count = i + 1;
				System.out.println(car[i].getColor() + "�� " + car[i].getCarName() + "(" + car[i].getCarMaker() + ")��(��) " + (i + 1) + "��°�� �ֽ��ϴ�.");
				break;
			}
		}
		
		if (i == (car.length)) {
			System.out.println(name + "��(��) �����ϴ�.");
		}
		
		/*
		if (findCar != null) {
			System.out.println(findCar.getColor() + "�� " + findCar.getCarName() + "(" + findCar.getCarMaker() + ")��(��) " + count + "��°�� �ֽ��ϴ�.");
		} else {
			System.out.println(name + "��(��) �����ϴ�.");
		}
		*/
		
//		Car car1[] = {new Car("1", "1", "1"), new Car("2", "2", "2"), new Car("3", "3", "3")};
//		for (int j = 0; j < car1.length; j++) {
//			System.out.println(car1[j].getCarName());
//		}
	}
}