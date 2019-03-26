public class Car {

    // global variables
    String carName;
    String color;
    String maker;

    int speed;


    /* Contructor (method overloading) */
    public Car() {
        this("Sonata", "Black", "Hyundai");
        //carName = "Sonata";
        //color = "Black";
        //maker = "Hyundai";
    }

    // ���������� ���������� �̸��� ���� ��쿡�� �Ϲ������� ���������� ����
    public Car(String color) {
        this("Sonata", color, "Hyundai");
        //carName = "Sonata";
        //this.color = color;
        //maker = "Hyundai";
    }

    public Car(String carName, String color) {
        this(carName, color, "Hyundai");
        //this.carName = carName;
        //this.color = color;
        //maker = "Hyundai";
    }

    public Car(String carName, String color, String maker) {
        this.carName = carName;
        this.color = color;
        this.maker = maker;
    }


    /* Methods */
    public void speedUp() {
        speed += 10;
    }

    public int speedUp(int speed) {
        this.speed += speed;
        return this.speed;
    }

    public void speedDown() {
        if (speed >= 10) {
            speed -= 10;
        } else {
            stop();
        }
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

    public String carInfo() {
         return "���̸� : " + carName + ", ���� : " + color + ", ������ : " + maker;
    }
}
