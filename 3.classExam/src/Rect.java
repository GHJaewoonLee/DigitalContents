/*
    1. �Ӽ� : ���� width, ���� height
    2. ���� : calcArea
    3. �ѷ� : calcRound
*/
public class Rect {

    int width;
    int height;

    public Rect() {
        // this(4, 3);
        width = 4;
        height = 3;
    }

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calcArea() {
        return width * height;
    }

    public int calcRound() {
        return ((width + height) * 2);
    }

    public String calcResult() {
        return "���ΰ� " + width + "�̰� ���ΰ� " + height + "�� �簢���� ���̴� " + calcArea() + "�̰� �ѷ��� " + calcRound() + "�̴�.";
    }
}
