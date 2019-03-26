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

        // 4. �ڽ��� �����ڸ� �̿�
        // abstract�� ����� Class �ȿ��� abstract�� ����� �޼ҵ尡 ���� ��쿡��(�ǹ̻��� �߻�޼ҵ�) �ϳ� �̻��� �޼ҵ带 override �ϸ� ��
        // new WindowListener() �� ����ϱ� ���ؼ��� ��� �߻�޼ҵ带 �����ؾ� �ȴٴ� ������ ����
        WindowListener wl = new WindowAdapter() {
                                public void windowClosing(WindowEvent e) {
                                    System.exit(0);
                                }

                                public void windowIconified(WindowEvent e) {
                                    System.out.println("������ȭ");
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