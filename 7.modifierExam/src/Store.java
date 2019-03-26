public class Store {

    public static void main(String[] args) {

        PointCard p1 = new PointCard("홍길동");
        PointCard p2 = new PointCard("고길동");


        System.out.println(p1.name + "님 물건 구매");
        int point = p1.visit();
        System.out.println(p1.name + "님의 포인트는 " + point);

        System.out.println(p2.name + "님 물건 구매");
        point = p2.visit();
        System.out.println(p2.name + "님의 포인트는 " + point);

        System.out.println(p1.name + "님 물건 구매");
        point = p1.visit();
        System.out.println(p1.name + "님의 포인트는 " + point);
        System.out.println("-----------------------------");


        Guest g1 = new Guest("홍길동");
        Guest g2 = new Guest("고길동");

        System.out.println(g1.name + "님 방문");
        int count = Guest.visit();
        System.out.println(g1.name + "님은 " + Guest.cnt + "번째 방문자");

        System.out.println(g2.name + "님 방문");
        count = Guest.visit();
        System.out.println(g2.name + "님은 " + Guest.cnt + "번째 방문자");

        System.out.println(g1.name + "님 방문");
        count = Guest.visit();
        System.out.println(g1.name + "님은 " + Guest.cnt + "번째 방문자");
    }
}
