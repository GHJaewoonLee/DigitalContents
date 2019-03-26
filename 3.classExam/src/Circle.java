/*
    1. ������ : radius
    2. ���� : calcArea
    3. �ѷ� : calcRound

    *. static���� ����� ����, �ʵ�� ��ü ���� ���� ����, ȣ���� ���� (��ü���� ����)
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
        return "�������� " + radius + "�� ���� ���̴� " + calcArea() + "�̰� �ѷ��� " + calcRound() + "�̴�.";
    }
}
