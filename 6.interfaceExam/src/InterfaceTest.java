import java.awt.*;
import java.awt.event.*;

// Frame이 Button, CheckBox을(를) 포함하는 관계 (Frame 안에서 Button, CheckBox이(가) 있는 관계 - 역은 성립하지 않음.)
// 따라서 Frame은 Is A 관계, Button은 Has A 관계가 됨
public class InterfaceTest extends Frame implements WindowListener, ActionListener {

    Button b1 = new Button("Button Test 1");
    Button b2 = new Button("Button Test 2");
    Button b3 = new Button("Button Test 3");

    Checkbox c = new Checkbox("Choice");

    public InterfaceTest() {
        super("Interface Test");

        setLayout(new FlowLayout());
        b1.setBackground(new Color(155, 155, 155));
        //add(b1);
        add(b2);
        add(b3);
        c.setBackground(new Color(55, 55, 55));
        //add(c);
        setSize(400, 300);
        setLocation(300, 500);
        setBackground(new Color(255, 255, 255));
        setVisible(true);

        addWindowListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowClosing(WindowEvent e) { System.exit(0); }
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}

    public void actionPerformed(ActionEvent e) {
        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);

        setBackground(new Color(r, g, b));
    }

    public static void main(String[] args) {
        InterfaceTest it = new InterfaceTest();
    }
}