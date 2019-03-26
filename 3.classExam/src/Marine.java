/*
    1. 기본 체력 : 100, 모드 (0 : 일반, 1 : 각성)
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
    // 1회 공격당 적 체력 (일반 모드 : -10, 각성 모드 : -15)
    public void attack(Marine m) {
        // m.hp -= power;

        if (this.mode == 0) {
            m.hp -= 10;
        } else if (this.mode == 1) {
            m.hp -= 15;
        } else {
            System.out.println("올바르지 않은 모드");
        }
    }

    // 모드 변경 당 나의 체력 -25
    // 체력 40 이하인 경우 모드 변경 불가
    public void changeMode() {
        if (hp > 40) {
            hp -= 25;

            switch (mode) {
                case 0 : mode = 1; /* hp -= 25; power = 15;*/ break;
                case 1 : mode = 0; /*power = 10;*/ break;
                default : System.out.println("올바르지 않은 모드");
            }
        } else {
           System.out.println("경고 : 모드 변경 불가");
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
