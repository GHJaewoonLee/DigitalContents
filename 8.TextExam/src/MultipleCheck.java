import java.util.Scanner;

public class MultipleCheck {

    public static void main(String[] args) {

        int count;
        int max;

        int countOfTwo = 0;
        int countOfThree = 0;
        int countOfFive = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("반복 횟수를 입력하세요 : ");

        max = scan.nextInt();

        for (count = 1 ; count <= max ; count++) {
            System.out.print(count + ". ");

            if ((count % 2) == 0) {
                System.out.print("2의배수 ");
                countOfTwo++;
            }

            if ((count % 3) == 0) {
                System.out.print("3의배수 ");
                countOfThree++;
            }

            if ((count % 5) == 0) {
                System.out.print("5의배수 ");
                countOfFive++;
            }

            System.out.println("");
        }

        System.out.println("===== 출력 횟수 =====");

        System.out.println("2의 배수 : " + countOfTwo);
        System.out.println("3의 배수 : " + countOfThree);
        System.out.println("5의 배수 : " + countOfFive);
    }
}
