public class BookOrderTest {

    public static void main(String[] args) {

        int totalPrice;
        double discountRate = 0.15;

        Book b1 = new Book("JAVA", 24000);
        Book b2 = new Book("JQuery", 21000);
        Book b3 = new Book("오라클", 19000);
        Book b4 = new Book("스프링", 35000);

        System.out.println("===== 도서 구입 목록 =====");
        b1.info();
        b2.info();
        b3.info();
        b4.info();
        System.out.println("--------------------------");

        totalPrice = b1.getPrice() + b2.getPrice() + b3.getPrice() + b4.getPrice();

        System.out.println("주문 총 금액 : " + totalPrice + "원");
        System.out.println("할인후 결제 금액 : " + (int)(totalPrice * (1 - discountRate)) + "원");
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