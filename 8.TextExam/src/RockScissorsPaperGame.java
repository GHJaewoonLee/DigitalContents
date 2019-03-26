import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class RockScissorsPaperGame {

    /* Global variables */
    private int com;

    BufferedReader in;


    /* Constructor */
    public RockScissorsPaperGame() throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("==== ��ǻ�Ϳ� ���������� ���� ����!!! =====");
        menu();
    }


    /* Generate CPU random */
    private void comRandom() {
        com = (int)(Math.random() * 3);
    }

    /* Control game (User input, Continued, ...) */
    private void menu() throws IOException {
        int my;

        for( ; ; ) {
            System.out.print("����(0), ����(1), ��(2) �����ϼ���. : ");
            my = Integer.parseInt(in.readLine());

            if ((my < 0) || (my > 2)) {
                System.out.println("0~2�� �ϳ��� �Է� �����մϴ�.");
                continue;
            }

            comRandom();

            game(my);

            System.out.print("���� ���(1), ����(0)�� �Է��ϼ��� : ");

            if (Integer.parseInt(in.readLine()) == 0) {
                exit();
            }
        }
    }

    /* Compare Player and CPU, decision result */
    private void game(int my) {
        String result = "";

        switch ((my - com + 2) % 3) {
			case 0 : result = "�̰��."; break;
			case 1 : result = "����."; break;
			case 2 : result = "����."; break;
			default : result = "�� �� ����.";
		}

        System.out.println("�� : " + convert(my) + "     " + "��ǻ�� : " + convert(com) + "   " + "��� : " + result);
    }

    /* Convert integer to R,C,P */
    private String convert(int num) {
        switch (num) {
            case 0 : return "����";
            case 1 : return "����";
            case 2 : return "��";
            default : return "�߸��� ��";
        }
    }

    /* Exit game */
    private void exit() {
        System.out.println("������ �����մϴ�!!");
        System.exit(0);
    }


    public static void main(String[] args) throws IOException {
        new RockScissorsPaperGame();
    }
}
