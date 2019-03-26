import java.awt.*;

public class HasATest {

    Frame f = new Frame("Has A Test");      // 프레임(창) 생성과 동시에 제목 설정
    Button b = new Button("Button Test");   // 버튼 생성

    public HasATest() {
        f.setLayout(new FlowLayout());      // Layout 설정
        f.add(b);                           // 프레임(창)에 버튼 추가
        f.setSize(400, 300);                // 400 * 300 크기로 설정
        f.setLocation(300, 500);            // 프레임(창) 위치 설정
        f.setVisible(true);                 // 프레임(창)이 보이게 함
    }

    public static void main(String[] args) {
        HasATest has = new HasATest();
    }
}
