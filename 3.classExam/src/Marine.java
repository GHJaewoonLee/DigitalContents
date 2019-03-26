/*
    1. �⺻ ü�� : 100, ��� (0 : �Ϲ�, 1 : ����)
    2. method : attack, changeMode

    *. Call by Value
    *. Call by Reference
*/
public class Marine {

    /* Global variables */
    int hp;
    int mode;
    // int power;

    /* Constructor */
    public Marine() {
        hp = 100;
        mode = 0;
        // power = 10;
    }


    /* Methods */
    // 1ȸ ���ݴ� �� ü�� (�Ϲ� ��� : -10, ���� ��� : -15)
    public void attack(Marine m) {
        // m.hp -= power;

        if (this.mode == 0) {
            m.hp -= 10;
        } else if (this.mode == 1) {
            m.hp -= 15;
        } else {
            System.out.println("�ùٸ��� ���� ���");
        }
    }

    // ��� ���� �� ���� ü�� -25
    // ü�� 40 ������ ��� ��� ���� �Ұ�
    public void changeMode() {
        if (hp > 40) {
            hp -= 25;

            switch (mode) {
                case 0 : mode = 1; /* hp -= 25; power = 15;*/ break;
                case 1 : mode = 0; /*power = 10;*/ break;
                default : System.out.println("�ùٸ��� ���� ���");
            }
        } else {
           System.out.println("��� : ��� ���� �Ұ�");
        }
    }

    String getHp() {
        if (hp > 0) {
            return "" + hp;
        } else {
            return "Die";
        }
    }
}
