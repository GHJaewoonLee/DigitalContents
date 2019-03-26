/*
    1. 반지름 : radius
    2. 넓이 : calcArea
    3. 둘레 : calcRound

    *. static으로 선언된 변수, 필드는 객체 생성 없이 접근, 호출이 가능 (객체끼리 공유)
*/
public class Circle {

    int radius;

    public Circle() {
        // this(4);
        radius = 4;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calcArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double calcRound() {
        return radius * 2 * Math.PI;
    }

    public String calcResult() {
        return "반지름이 " + radius + "인 원의 넓이는 " + calcArea() + "이고 둘레는 " + calcRound() + "이다.";
    }
}
