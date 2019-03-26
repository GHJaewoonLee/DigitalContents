public class DoHyungTest {

    public static void main(String[] args) {

        // 가로가 4이고 세로가 3인 사각형의 넓이는 12이고 둘레는 14
        Rect r1 = new Rect();
        System.out.println(r1.calcResult());

        // 가로, 세로 지정 가능
        Rect r2 = new Rect(2, 15);
        System.out.println(r2.calcResult());

        // 반지름이 4
        Circle c1 = new Circle();
        System.out.println(c1.calcResult());

        // 반지름 지정 가능
        Circle c2 = new Circle(5);
        System.out.println(c2.calcResult());
    }
}
