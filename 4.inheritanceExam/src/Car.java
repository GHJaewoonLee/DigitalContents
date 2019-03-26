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
        // super(); // ������� �ʾƵ� �ڵ������� �߰��Ǿ� �����. (��� ���迡����)
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
        return maker + "���� ���� " + color + " " + carName;
    }

    @Override
    public boolean equals(Object obj) {
        Car car = (Car)obj;

        // ������ Object�� �񱳴� equals�� ���
        //if (/*(*/this.carName == car.carName/*) && (this.color == car.color) && (this.maker == car.maker))   // ���ڿ��� ��쿡�� true, ��ü�� �Ѱܹ޴� ��쿡�� false
        if (carName.equals(car.carName)) {
            return true;
        }

        return false;
    }
}
