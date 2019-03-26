import java.util.Scanner;

public class MultipleCheck {

    public static void main(String[] args) {

        int count;
        int max;

        int countOfTwo = 0;
        int countOfThree = 0;
        int countOfFive = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("�ݺ� Ƚ���� �Է��ϼ��� : ");

        max = scan.nextInt();

        for (count = 1 ; count <= max ; count++) {
            System.out.print(count + ". ");

            if ((count % 2) == 0) {
                System.out.print("2�ǹ�� ");
                countOfTwo++;
            }

            if ((count % 3) == 0) {
                System.out.print("3�ǹ�� ");
                countOfThree++;
            }

            if ((count % 5) == 0) {
                System.out.print("5�ǹ�� ");
                countOfFive++;
            }

            System.out.println("");
        }

        System.out.println("===== ��� Ƚ�� =====");

        System.out.println("2�� ��� : " + countOfTwo);
        System.out.println("3�� ��� : " + countOfThree);
        System.out.println("5�� ��� : " + countOfFive);
    }
}
