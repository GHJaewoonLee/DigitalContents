public class CarUser {

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.carInfo());

        Car car2 = new Car("White");
        System.out.println(car2.carInfo());

        // method 호출 시 parameter의 순서 고려
        Car car3 = new Car("Grandeur", "White");
        System.out.println(car3.carInfo());

        Car car4 = new Car("K5", "Silver", "KIA");
        System.out.println(car4.carInfo());


        System.out.println("car4의 속도를 3회 증가");
        for(int i = 0 ; i < 3 ; i++) {
            car4.speedUp();
        }
        System.out.println("car4의 속도 : " + car4.speed);

        System.out.println("car4의 속도를 85만큼 증가");
        int speed = car4.speedUp(85);
        System.out.println("car4의 속도 : " + speed);

        System.out.println("car4의 속도를 185만큼 감소");
        speed = car4.speedDown(185);
        System.out.println("car4의 속도 : " + speed);
    }
}
