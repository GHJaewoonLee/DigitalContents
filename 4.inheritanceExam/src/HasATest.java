import java.awt.*;

public class HasATest {

    Frame f = new Frame("Has A Test");      // ������(â) ������ ���ÿ� ���� ����
    Button b = new Button("Button Test");   // ��ư ����

    public HasATest() {
        f.setLayout(new FlowLayout());      // Layout ����
        f.add(b);                           // ������(â)�� ��ư �߰�
        f.setSize(400, 300);                // 400 * 300 ũ��� ����
        f.setLocation(300, 500);            // ������(â) ��ġ ����
        f.setVisible(true);                 // ������(â)�� ���̰� ��
    }

    public static void main(String[] args) {
        HasATest has = new HasATest();
    }
}
