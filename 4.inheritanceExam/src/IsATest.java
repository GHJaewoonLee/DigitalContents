import java.awt.*;

// Frame�� Button, CheckBox��(��) �����ϴ� ���� (Frame �ȿ��� Button, CheckBox��(��) �ִ� ���� - ���� �������� ����.)
// ���� Frame�� Is A ����, Button�� Has A ���谡 ��
public class IsATest extends Frame {

    Button b1 = new Button("Button Test 1");
    Button b2 = new Button("Button Test 2");
    Button b3 = new Button("Button Test 3");

    Checkbox c = new Checkbox("Choice");

    public IsATest() {
        super("Is A Test");

        setLayout(new FlowLayout());
        b1.setBackground(new Color(155, 155, 155));
        add(b1);
        add(b2);
        add(b3);
        c.setBackground(new Color(55, 55, 55));
        add(c);
        setSize(400, 300);
        setLocation(300, 500);
        setBackground(new Color(255, 255, 255));
        setVisible(true);
    }

    public static void main(String[] args) {
        //IsATest isA = new IsATest();

        Test a = new Test();
    }
}



class Test extends Button {

    Frame f = new Frame();

    public Test() {
        super("Test");

        f.setLayout(new FlowLayout());
        f.add(this);
        f.setSize(400, 300);
        f.setLocation(300, 500);
        f.setBackground(new Color(255, 255, 255));
        f.setVisible(true);
    }

}
