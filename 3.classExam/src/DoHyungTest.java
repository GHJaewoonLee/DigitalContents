public class DoHyungTest {

    public static void main(String[] args) {

        // ���ΰ� 4�̰� ���ΰ� 3�� �簢���� ���̴� 12�̰� �ѷ��� 14
        Rect r1 = new Rect();
        System.out.println(r1.calcResult());

        // ����, ���� ���� ����
        Rect r2 = new Rect(2, 15);
        System.out.println(r2.calcResult());

        // �������� 4
        Circle c1 = new Circle();
        System.out.println(c1.calcResult());

        // ������ ���� ����
        Circle c2 = new Circle(5);
        System.out.println(c2.calcResult());
    }
}
