public class StarCraft {

    public static void main(String[] args) {
        int index;

        Marine my = new Marine();
        Marine CPU = new Marine();

        // 내 체력 : 100    적 체력 : 100
        System.out.println("내 체력 : " + my.getHp() + "    적 체력 : " + CPU.getHp());
        System.out.println("");

        int count = 2;
        System.out.println("내가 적을 " + count + "회 공격");
        for(index = 0; index < count ; index++) {
            my.attack(CPU);
        }

        // 내 체력 : 100    적 체력 : 80
        System.out.println("내 체력 : " + my.getHp() + "    적 체력 : " + CPU.getHp());
        System.out.println("");

        count = 4;
        System.out.println("적이 나를 " + count + "회 공격");
        for(index = 0; index < count ; index++) {
            CPU.attack(my);
        }

        // 내 체력 : 60     적 체력 : 80
        System.out.println("내 체력 : " + my.getHp() + "    적 체력 : " + CPU.getHp());
        System.out.println("");

        System.out.println("모드 변경");
        my.changeMode();

        // 내 체력 : 35     적 체력 : 80
        System.out.println("내 체력 : " + my.getHp() + "    적 체력 : " + CPU.getHp());
        System.out.println("");

        count = 3;
        System.out.println("내가 적을 " + count + "회 공격");
        for(index = 0; index < count ; index++) {
            my.attack(CPU);
        }

        // 내 체력 : 35     적 체력 : 35
        System.out.println("내 체력 : " + my.getHp() + "    적 체력 : " + CPU.getHp());
        System.out.println("");

        System.out.println("모드 변경");
        my.changeMode();
        // 경고 : 모드 변경 불가

        // 내 체력 : 35     적 체력 : 35
        System.out.println("내 체력 : " + my.getHp() + "    적 체력 : " + CPU.getHp());
        System.out.println("");

        count = 3;
        System.out.println("내가 적을 " + count + "회 공격");
        for(index = 0; index < count ; index++) {
            my.attack(CPU);
        }

        // 내 체력 : 35     적 체력 : Die
        System.out.println("내 체력 : " + my.getHp() + "    적 체력 : " + CPU.getHp());
    }
}
