public class SmartPhone {

    private String maker;
    private String name;
    private int price;
    private int discountRate;


    public SmartPhone(String maker, String name, int price) {
        this.maker = maker;
        this.name = name;
        this.price = price;
        discountRate = 0;
    }

    public SmartPhone(String maker, String name, int price, int discountRate) {
        this(maker, name, price);
        this.discountRate = discountRate;
    }

    public int calculateDiscount() {
        return (int)(Math.round(price * (1 - ((double)discountRate / 100))));
    }


    public void info() {
        System.out.println("-------------------");
        System.out.println(name + " [" + maker + "]");
        System.out.println("가격 : " + price);

        if (discountRate != 0) {
            System.out.println("할인가격 : " + calculateDiscount());
        }
    }
}
