public class Store {

    public static void main(String[] args) {

        PointCard p1 = new PointCard("ȫ�浿");
        PointCard p2 = new PointCard("��浿");


        System.out.println(p1.name + "�� ���� ����");
        int point = p1.visit();
        System.out.println(p1.name + "���� ����Ʈ�� " + point);

        System.out.println(p2.name + "�� ���� ����");
        point = p2.visit();
        System.out.println(p2.name + "���� ����Ʈ�� " + point);

        System.out.println(p1.name + "�� ���� ����");
        point = p1.visit();
        System.out.println(p1.name + "���� ����Ʈ�� " + point);
        System.out.println("-----------------------------");


        Guest g1 = new Guest("ȫ�浿");
        Guest g2 = new Guest("��浿");

        System.out.println(g1.name + "�� �湮");
        int count = Guest.visit();
        System.out.println(g1.name + "���� " + Guest.cnt + "��° �湮��");

        System.out.println(g2.name + "�� �湮");
        count = Guest.visit();
        System.out.println(g2.name + "���� " + Guest.cnt + "��° �湮��");

        System.out.println(g1.name + "�� �湮");
        count = Guest.visit();
        System.out.println(g1.name + "���� " + Guest.cnt + "��° �湮��");
    }
}
