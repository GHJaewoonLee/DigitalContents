public class StarCraft {

    public static void main(String[] args) {
        int index;

        Marine my = new Marine();
        Marine CPU = new Marine();

        // �� ü�� : 100    �� ü�� : 100
        System.out.println("�� ü�� : " + my.getHp() + "    �� ü�� : " + CPU.getHp());
        System.out.println("");

        int count = 2;
        System.out.println("���� ���� " + count + "ȸ ����");
        for(index = 0; index < count ; index++) {
            my.attack(CPU);
        }

        // �� ü�� : 100    �� ü�� : 80
        System.out.println("�� ü�� : " + my.getHp() + "    �� ü�� : " + CPU.getHp());
        System.out.println("");

        count = 4;
        System.out.println("���� ���� " + count + "ȸ ����");
        for(index = 0; index < count ; index++) {
            CPU.attack(my);
        }

        // �� ü�� : 60     �� ü�� : 80
        System.out.println("�� ü�� : " + my.getHp() + "    �� ü�� : " + CPU.getHp());
        System.out.println("");

        System.out.println("��� ����");
        my.changeMode();

        // �� ü�� : 35     �� ü�� : 80
        System.out.println("�� ü�� : " + my.getHp() + "    �� ü�� : " + CPU.getHp());
        System.out.println("");

        count = 3;
        System.out.println("���� ���� " + count + "ȸ ����");
        for(index = 0; index < count ; index++) {
            my.attack(CPU);
        }

        // �� ü�� : 35     �� ü�� : 35
        System.out.println("�� ü�� : " + my.getHp() + "    �� ü�� : " + CPU.getHp());
        System.out.println("");

        System.out.println("��� ����");
        my.changeMode();
        // ��� : ��� ���� �Ұ�

        // �� ü�� : 35     �� ü�� : 35
        System.out.println("�� ü�� : " + my.getHp() + "    �� ü�� : " + CPU.getHp());
        System.out.println("");

        count = 3;
        System.out.println("���� ���� " + count + "ȸ ����");
        for(index = 0; index < count ; index++) {
            my.attack(CPU);
        }

        // �� ü�� : 35     �� ü�� : Die
        System.out.println("�� ü�� : " + my.getHp() + "    �� ü�� : " + CPU.getHp());
    }
}
