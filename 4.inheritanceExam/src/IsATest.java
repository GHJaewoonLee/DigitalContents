import java.awt.*;

// Frame이 Button, CheckBox을(를) 포함하는 관계 (Frame 안에서 Button, CheckBox이(가) 있는 관계 - 역은 성립하지 않음.)
// 따라서 Frame은 Is A 관계, Button은 Has A 관계가 됨
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
