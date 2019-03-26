import java.awt.*;
import java.awt.event.*;


public class AbstractTest3 extends Frame {

    Button b1 = new Button("Button Test 1");
    Button b2 = new Button("Button Test 2");
    Button b3 = new Button("Button Test 3");

    Checkbox c = new Checkbox("Choice");

    public AbstractTest3() {
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

        // 4. 자신의 생성자를 이용
        // abstract로 선언된 Class 안에서 abstract로 선언된 메소드가 없는 경우에는(의미상의 추상메소드) 하나 이상의 메소드를 override 하면 됨
        // new WindowListener() 를 사용하기 위해서는 모든 추상메소드를 구현해야 된다는 단점이 있음
        WindowListener wl = new WindowAdapter() {
                                public void windowClosing(WindowEvent e) {
                                    System.exit(0);
                                }

                                public void windowIconified(WindowEvent e) {
                                    System.out.println("아이콘화");
                                }
                            };

        WindowListener wl2 = new WindowAdapter() {
                                 public void windowClosing(WindowEvent e) {
                                     System.out.println("X Pressed");
                                 }
                             };

        addWindowListener(wl);
    }

    public static void main(String[] args) throws Exception {
        AbstractTest3 at3 = new AbstractTest3();
    }
}