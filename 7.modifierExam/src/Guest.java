//총 방문자수를 확인하는 경우에는
//이전 방문자가 다음 방문자에게 영향을 주기 때문에
//static을 사용하여 관리

//non-static/static 메소드에서는 static 변수를 참조할 수 있으나
//static 메소드에서는 non-static 변수를 참조할 수 없음 (어느 객체의 변수를 참조해야 하는지 알 수 없음)
public class Guest {

    static int cnt; // Class 변수 (Class 당 하나만 생성됨)
    String name;    // instance 변수


    public Guest(String name) {
        this.name = name;
    }

    public static int visit() {
        cnt++;
        return cnt;
    }
}
