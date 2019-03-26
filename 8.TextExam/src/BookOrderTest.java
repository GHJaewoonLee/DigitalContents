public class BookOrderTest {

    public static void main(String[] args) {

        int totalPrice;
        double discountRate = 0.15;

        Book b1 = new Book("JAVA", 24000);
        Book b2 = new Book("JQuery", 21000);
        Book b3 = new Book("����Ŭ", 19000);
        Book b4 = new Book("������", 35000);

        System.out.println("===== ���� ���� ��� =====");
        b1.info();
        b2.info();
        b3.info();
        b4.info();
        System.out.println("--------------------------");

        totalPrice = b1.getPrice() + b2.getPrice() + b3.getPrice() + b4.getPrice();

        System.out.println("�ֹ� �� �ݾ� : " + totalPrice + "��");
        System.out.println("������ ���� �ݾ� : " + (int)(totalPrice * (1 - discountRate)) + "��");
    }
}


class Book {

    String name;
    int price;

    Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void info() {
        System.out.println(name + " : " + price);
    }

    int getPrice() {
        return price;
    }
}