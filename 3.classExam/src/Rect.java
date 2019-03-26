/*
    1. 속성 : 가로 width, 세로 height
    2. 넓이 : calcArea
    3. 둘레 : calcRound
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
        return "가로가 " + width + "이고 세로가 " + height + "인 사각형의 넓이는 " + calcArea() + "이고 둘레는 " + calcRound() + "이다.";
    }
}
