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

        System.out.println("==== 컴퓨터와 가위바위보 게임 한판!!! =====");
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
            System.out.print("가위(0), 바위(1), 보(2) 선택하세요. : ");
            my = Integer.parseInt(in.readLine());

            if ((my < 0) || (my > 2)) {
                System.out.println("0~2중 하나만 입력 가능합니다.");
                continue;
            }

            comRandom();

            game(my);

            System.out.print("게임 계속(1), 종료(0)을 입력하세요 : ");

            if (Integer.parseInt(in.readLine()) == 0) {
                exit();
            }
        }
    }

    /* Compare Player and CPU, decision result */
    private void game(int my) {
        String result = "";

        switch ((my - com + 2) % 3) {
			case 0 : result = "이겼다."; break;
			case 1 : result = "졌다."; break;
			case 2 : result = "비겼다."; break;
			default : result = "알 수 없다.";
		}

        System.out.println("나 : " + convert(my) + "     " + "컴퓨터 : " + convert(com) + "   " + "결과 : " + result);
    }

    /* Convert integer to R,C,P */
    private String convert(int num) {
        switch (num) {
            case 0 : return "가위";
            case 1 : return "바위";
            case 2 : return "보";
            default : return "잘못된 패";
        }
    }

    /* Exit game */
    private void exit() {
        System.out.println("게임을 종료합니다!!");
        System.exit(0);
    }


    public static void main(String[] args) throws IOException {
        new RockScissorsPaperGame();
    }
}
