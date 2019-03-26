// point는 일반적으로 개인별로 관리되는 개념이므로 static을 사용하지 않는 것이 바람직
// 다음 사용자가 이전 사용자에게 영향을 주지 않음
public class PointCard {

    int cnt;
    String name;


    public PointCard(String name) {
        this.name = name;
    }

    public int visit() {
        cnt++;
        return cnt;
    }
}
