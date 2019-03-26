import java.io.*;


public class AbstractTest2 {

    public static void main(String[] args) throws IOException {

        // 3. 외부 클래스를 참조
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("calc");

        // <과정>
        // 1) Process 객체를 생성하고 싶으나 Process는 추상클래스 이므로 객체 생성 불가능
        // 2) Runtime 객체를 생성해보자
        // 3) Runtime 클래스는 추상클래스가 아니므로 객체 생성 가능
        // 4) 그런데 생성자가 없음
        // 5) 그러면 메소드를 이용하자
        // 6) getRuntime() 메소드를 이용하면 Runtime 객체를 리턴할 수 있음
        // 7) 생성된 Runtime 객체에서 exec() 메소드를 이용하면 Process 객체를 리턴할 수 있음
    }
}
