public class CarUser {

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.carInfo());

        Car car2 = new Car("White");
        System.out.println(car2.carInfo());

        // method ȣ�� �� parameter�� ���� ���
        Car car3 = new Car("Grandeur", "White");
        System.out.println(car3.carInfo());

        Car car4 = new Car("K5", "Silver", "KIA");
        System.out.println(car4.carInfo());


        System.out.println("car4�� �ӵ��� 3ȸ ����");
        for(int i = 0 ; i < 3 ; i++) {
            car4.speedUp();
        }
        System.out.println("car4�� �ӵ� : " + car4.speed);

        System.out.println("car4�� �ӵ��� 85��ŭ ����");
        int speed = car4.speedUp(85);
        System.out.println("car4�� �ӵ� : " + speed);

        System.out.println("car4�� �ӵ��� 185��ŭ ����");
        speed = car4.speedDown(185);
        System.out.println("car4�� �ӵ� : " + speed);
    }
}
