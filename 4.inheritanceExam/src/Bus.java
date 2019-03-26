/*
���� Bus (�°��� pCount,  Ÿ��() getOn(int pCount)/������() getOut(int pCount)),
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

    // ����
    void getOn(int pCount) {
        if (this.pCount == MAXPCOUNT) {
            System.out.println("�� �̻� ž�� �Ұ�");
            return;
        }

        if ((this.pCount + pCount) > MAXPCOUNT) {
            System.out.println((MAXPCOUNT - this.pCount) + "�� ž�� �Ϸ�");
            this.pCount = MAXPCOUNT;
        } else {
            this.pCount += pCount;
            System.out.println(pCount + "�� ž�� �Ϸ�");
        }
    }

    // ����
    void getOut(int pCount) {
        if (this.pCount == 0) {
            System.out.println("���� �°� ����");
            return;
        }

        if (this.pCount < pCount) {
            System.out.println(this.pCount + "�� ���� �Ϸ�");
            this.pCount = 0;
        } else {
            System.out.println(pCount + "�� ���� �Ϸ�");
            this.pCount -= pCount;
        }
    }

    // ���� ž�� �°�
    int showRemainPassengers() {
        return pCount;
    }

    // ���� ����, �Ǵ� ���� ����
    void reset() {
        pCount = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "����";
    }
}
