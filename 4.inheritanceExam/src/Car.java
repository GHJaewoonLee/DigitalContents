public class Car {

    // global variables
    String carName;
    String color;
    String maker;

    int speed;


    /* Contructor (method overloading) */
    public Car() {
        this("Sonata", "Black", "Hyundai");
    }

    public Car(String color) {
        this("Sonata", color, "Hyundai");
    }

    public Car(String carName, String color) {
        this(carName, color, "Hyundai");
    }

    public Car(String carName, String color, String maker) {
        // super(); // 명시하지 않아도 자동적으로 추가되어 실행됨. (상속 관계에서만)
        this.carName = carName;
        this.color = color;
        this.maker = maker;
    }


    /* Methods */
    public int speedUp(int speed) {
        this.speed += speed;
        return this.speed;
    }

    public int speedDown(int speed) {
        if (this.speed >= speed) {
            this.speed -= speed;
        } else {
            stop();
        }

        return this.speed;
    }

    public void stop() {
        speed = 0;
    }

    @Override
    public String toString() {
        return maker + "에서 만든 " + color + " " + carName;
    }

    @Override
    public boolean equals(Object obj) {
        Car car = (Car)obj;

        // 가급적 Object의 비교는 equals를 사용
        //if (/*(*/this.carName == car.carName/*) && (this.color == car.color) && (this.maker == car.maker))   // 문자열일 경우에는 true, 객체를 넘겨받는 경우에는 false
        if (carName.equals(car.carName)) {
            return true;
        }

        return false;
    }
}
