/*
버스 Bus (승객수 pCount,  타다() getOn(int pCount)/내리다() getOut(int pCount)),
*/
public class Bus extends Car {

    /* Global variables */
    int pCount;
    int MAXPCOUNT = 40;

    /* Constructors */
    public Bus() {
        reset();
    }

    public Bus(String carName, String color, String maker) {
        super(carName, color, maker);
        reset();
    }

    // 승차
    void getOn(int pCount) {
        if (this.pCount == MAXPCOUNT) {
            System.out.println("더 이상 탑승 불가");
            return;
        }

        if ((this.pCount + pCount) > MAXPCOUNT) {
            System.out.println((MAXPCOUNT - this.pCount) + "명만 탑승 완료");
            this.pCount = MAXPCOUNT;
        } else {
            this.pCount += pCount;
            System.out.println(pCount + "명 탑승 완료");
        }
    }

    // 하차
    void getOut(int pCount) {
        if (this.pCount == 0) {
            System.out.println("내릴 승객 없음");
            return;
        }

        if (this.pCount < pCount) {
            System.out.println(this.pCount + "명만 하차 완료");
            this.pCount = 0;
        } else {
            System.out.println(pCount + "명 하차 완료");
            this.pCount -= pCount;
        }
    }

    // 현재 탑승 승객
    int showRemainPassengers() {
        return pCount;
    }

    // 최초 운행, 또는 종점 도착
    void reset() {
        pCount = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "버스";
    }
}
