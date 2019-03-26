public class Inheritance {

    public static void main(String[] args) {

        // 1. 상속 : 상위class의 field와 method를 하위class에서 객체생성 없이 사용. (단, private field/method는 상속 불가능, 생성자도 상속 불가능)
        //           extends 키워드 사용.
        //           상위class는 default 생성자가 있어야 함.

        // class  (상위)
        //   ↑
        // class  (하위)

        // 2. 접근제어자 class ClassName(하위) extends ClassName(상위) { ... }

        // 3. Class 간의 상속은 단일 상속만 가능. (다중 상속 불가능.)
        //    계층적 상속은 가능.

        // 4. 모든 클래스의 최상위 클래스는 Object.

        // 5. method overriding(재정의) : 하위class의 기능에 맞게끔 재정의
        //                                method의 선언은 그대로 하되 구현부에서 변경 가능 (단, 접근제어자는 넓은 의미로 변경 가능. private 제외)

        // 6.1 super : 상위class 참조변수
        // 6.2 super() : 상위class 생성자 호출

        // 7. 다형성 : 하위 클래스를 참조하여 상위class의 객체를 생성
        // 예) A (상위) , B (하위)
        //     A a = new A();
        //     B b = new B();
        //     A a = new B();

        //     전제 조건 : 1) 대분류가 같아야 가능
        //                 2) 바꿀 수 있는 타입이어야 가능

        // 8. Class의 관계
        //     has a : 집합
        //     is a  : 상속

        // 예)  상위 : 자동차 Car (이름/색상/제조사/속도,  가속()/감속()/정지())
        //      하위 : 택시 Taxi 150 (요금 price,  요금계산() calcPrice(int km)),
        //             버스 Bus 110 (승객수 pCount,  타다() getOn(int pCount)/내리다() getOut(int pCount)),
        //             트럭 Truck 100 (중량 weight/ 총중량 maxWeight,  상차() loadUp(int weight)/하차() loadDown(int weight))



        //Taxi t1 = new Taxi();
        //System.out.println(t1.toString() + ", 기본요금 : " + t1.basicPrice);

        //Taxi t2 = new Taxi("K5" /* new String("K5") */, "감홍색", "KIA");
        //System.out.println(t2.toString() + ", 기본요금 : " + t2.basicPrice);
        //System.out.println("");

        /*
        int km = 20;
        System.out.println(t2.toString() + "를 타고 구디에서 강남까지 " + km + "km 이동");
        t2.initPrice();
        int price = t2.calcPrice(km);
        t2.sumPrice();
        System.out.println("요금 : " + price + "원");
        System.out.println("누적요금 : " + t2.showTotalPrice() + "원");
        System.out.println("");

        km = 20;
        System.out.println(t2.toString() + "를 타고 강남에서 구디까지 " + km + "km 이동");
        t2.initPrice();
        price = t2.calcPrice(km);
        t2.sumPrice();
        System.out.println("요금 : " + price + "원");
        System.out.println("누적요금 : " + t2.showTotalPrice() + "원");
        System.out.println("");
        */


        Bus b1 = new Bus("Aero", "White","Hyundai");
        System.out.println(b1.toString() + ", 현재 승객 수 : " + b1.showRemainPassengers());
        System.out.println("");

        int people = 5;
        System.out.println("승차 희망 인원 : " + people);
        b1.getOn(people);
        System.out.println(b1.toString() + ", 현재 승객 수 : " + b1.showRemainPassengers());
        System.out.println("");

        people = 6;
        System.out.println("승차 희망 인원 : " + people);
        b1.getOn(people);
        System.out.println(b1.toString() + ", 현재 승객 수 : " + b1.showRemainPassengers());
        System.out.println("");

        people = 4;
        System.out.println("하차 희망 인원 : " + people);
        b1.getOut(people);
        System.out.println(b1.toString() + ", 현재 승객 수 : " + b1.showRemainPassengers());
        System.out.println("");

        people = 10;
        System.out.println("하차 희망 인원 : " + people);
        b1.getOut(people);
        System.out.println(b1.toString() + ", 현재 승객 수 : " + b1.showRemainPassengers());
        System.out.println("");

        people = 5;
        System.out.println("하차 희망 인원 : " + people);
        b1.getOut(people);
        System.out.println(b1.toString() + ", 현재 승객 수 : " + b1.showRemainPassengers());
        System.out.println("");

        people = 50;
        System.out.println("승차 희망 인원 : " + people);
        b1.getOn(people);
        System.out.println(b1.toString() + ", 현재 승객 수 : " + b1.showRemainPassengers());
        System.out.println("");

        people = 20;
        System.out.println("하차 희망 인원 : " + people);
        b1.getOut(people);
        System.out.println(b1.toString() + ", 현재 승객 수 : " + b1.showRemainPassengers());
        System.out.println("");

        people = 60;
        System.out.println("승차 희망 인원 : " + people);
        b1.getOn(people);
        System.out.println(b1.toString() + ", 현재 승객 수 : " + b1.showRemainPassengers());
        System.out.println("");

        people = 10;
        System.out.println("승차 희망 인원 : " + people);
        b1.getOn(people);
        System.out.println(b1.toString() + ", 현재 승객 수 : " + b1.showRemainPassengers());
        System.out.println("");


        /*
        int upDown = 50;
        System.out.println("t2의 속도를 " + upDown + "만큼 가속");
        int speed = t2.speedUp(upDown);
        System.out.println("t2의 속도 : " + t2.speed + "  " + speed);

        upDown = 200;
        System.out.println("t2의 속도를 " + upDown + "만큼 가속");
        speed = t2.speedUp(upDown);
        System.out.println("t2의 속도 : " + t2.speed + "  " + speed);

        upDown = 250;
        System.out.println("t2의 속도를 " + upDown + "만큼 가속");
        speed = t2.speedUp(upDown);
        System.out.println("t2의 속도 : " + t2.speed + "  " + speed);

        upDown = 250;
        System.out.println("t2의 속도를 " + upDown + "만큼 가속");
        speed = t2.speedUp(upDown);
        System.out.println("t2의 속도 : " + t2.speed + "  " + speed);


        System.out.println(t1 + "   " + t2);    // toString() 메소드가 Car Class에서 재정의 되었음
        System.out.println(t1.toString() + "   " + t2.toString());
        */

        //Taxi t3 = new Taxi("K5" /* new String("K5") */, "감홍색", "KIA");
        //System.out.println(t2 + "   " + t3);
        //System.out.println(t2.hashCode() + "   " + t3.hashCode());

        // 비교연산자는 기본 Data Type의 경우 값을 비교, Reference Type인 경우 주소 값을 비교
        /*
        if (t2 == t3) {
            System.out.println("t2와 t3는 주소값이 같은 차 이다");
        } else {
            System.out.println("t2와 t3는 주소값이 다른 차 이다");
        }

        //
        if (t2.equals(t3)) {
            System.out.println("t2와 t3는 차이름이 같은 차 이다");
        } else {
            System.out.println("t2와 t3는 차이름이 다른 차 이다");
        }
        */


        //Car car = new Car();
        Car car = new Taxi();
        Taxi t;
        t = (Taxi)car;
        t.initPrice();


        // 문법상으로는 맞지만 실제 실행하면 exception
        Car b = new Bus();
        Taxi t5 = (Taxi)b;
    }

}