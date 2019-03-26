public class Inheritance {

    public static void main(String[] args) {

        // 1. ��� : ����class�� field�� method�� ����class���� ��ü���� ���� ���. (��, private field/method�� ��� �Ұ���, �����ڵ� ��� �Ұ���)
        //           extends Ű���� ���.
        //           ����class�� default �����ڰ� �־�� ��.

        // class  (����)
        //   ��
        // class  (����)

        // 2. ���������� class ClassName(����) extends ClassName(����) { ... }

        // 3. Class ���� ����� ���� ��Ӹ� ����. (���� ��� �Ұ���.)
        //    ������ ����� ����.

        // 4. ��� Ŭ������ �ֻ��� Ŭ������ Object.

        // 5. method overriding(������) : ����class�� ��ɿ� �°Բ� ������
        //                                method�� ������ �״�� �ϵ� �����ο��� ���� ���� (��, ���������ڴ� ���� �ǹ̷� ���� ����. private ����)

        // 6.1 super : ����class ��������
        // 6.2 super() : ����class ������ ȣ��

        // 7. ������ : ���� Ŭ������ �����Ͽ� ����class�� ��ü�� ����
        // ��) A (����) , B (����)
        //     A a = new A();
        //     B b = new B();
        //     A a = new B();

        //     ���� ���� : 1) ��з��� ���ƾ� ����
        //                 2) �ٲ� �� �ִ� Ÿ���̾�� ����

        // 8. Class�� ����
        //     has a : ����
        //     is a  : ���

        // ��)  ���� : �ڵ��� Car (�̸�/����/������/�ӵ�,  ����()/����()/����())
        //      ���� : �ý� Taxi 150 (��� price,  ��ݰ��() calcPrice(int km)),
        //             ���� Bus 110 (�°��� pCount,  Ÿ��() getOn(int pCount)/������() getOut(int pCount)),
        //             Ʈ�� Truck 100 (�߷� weight/ ���߷� maxWeight,  ����() loadUp(int weight)/����() loadDown(int weight))



        //Taxi t1 = new Taxi();
        //System.out.println(t1.toString() + ", �⺻��� : " + t1.basicPrice);

        //Taxi t2 = new Taxi("K5" /* new String("K5") */, "��ȫ��", "KIA");
        //System.out.println(t2.toString() + ", �⺻��� : " + t2.basicPrice);
        //System.out.println("");

        /*
        int km = 20;
        System.out.println(t2.toString() + "�� Ÿ�� ���𿡼� �������� " + km + "km �̵�");
        t2.initPrice();
        int price = t2.calcPrice(km);
        t2.sumPrice();
        System.out.println("��� : " + price + "��");
        System.out.println("������� : " + t2.showTotalPrice() + "��");
        System.out.println("");

        km = 20;
        System.out.println(t2.toString() + "�� Ÿ�� �������� ������� " + km + "km �̵�");
        t2.initPrice();
        price = t2.calcPrice(km);
        t2.sumPrice();
        System.out.println("��� : " + price + "��");
        System.out.println("������� : " + t2.showTotalPrice() + "��");
        System.out.println("");
        */


        Bus b1 = new Bus("Aero", "White","Hyundai");
        System.out.println(b1.toString() + ", ���� �°� �� : " + b1.showRemainPassengers());
        System.out.println("");

        int people = 5;
        System.out.println("���� ��� �ο� : " + people);
        b1.getOn(people);
        System.out.println(b1.toString() + ", ���� �°� �� : " + b1.showRemainPassengers());
        System.out.println("");

        people = 6;
        System.out.println("���� ��� �ο� : " + people);
        b1.getOn(people);
        System.out.println(b1.toString() + ", ���� �°� �� : " + b1.showRemainPassengers());
        System.out.println("");

        people = 4;
        System.out.println("���� ��� �ο� : " + people);
        b1.getOut(people);
        System.out.println(b1.toString() + ", ���� �°� �� : " + b1.showRemainPassengers());
        System.out.println("");

        people = 10;
        System.out.println("���� ��� �ο� : " + people);
        b1.getOut(people);
        System.out.println(b1.toString() + ", ���� �°� �� : " + b1.showRemainPassengers());
        System.out.println("");

        people = 5;
        System.out.println("���� ��� �ο� : " + people);
        b1.getOut(people);
        System.out.println(b1.toString() + ", ���� �°� �� : " + b1.showRemainPassengers());
        System.out.println("");

        people = 50;
        System.out.println("���� ��� �ο� : " + people);
        b1.getOn(people);
        System.out.println(b1.toString() + ", ���� �°� �� : " + b1.showRemainPassengers());
        System.out.println("");

        people = 20;
        System.out.println("���� ��� �ο� : " + people);
        b1.getOut(people);
        System.out.println(b1.toString() + ", ���� �°� �� : " + b1.showRemainPassengers());
        System.out.println("");

        people = 60;
        System.out.println("���� ��� �ο� : " + people);
        b1.getOn(people);
        System.out.println(b1.toString() + ", ���� �°� �� : " + b1.showRemainPassengers());
        System.out.println("");

        people = 10;
        System.out.println("���� ��� �ο� : " + people);
        b1.getOn(people);
        System.out.println(b1.toString() + ", ���� �°� �� : " + b1.showRemainPassengers());
        System.out.println("");


        /*
        int upDown = 50;
        System.out.println("t2�� �ӵ��� " + upDown + "��ŭ ����");
        int speed = t2.speedUp(upDown);
        System.out.println("t2�� �ӵ� : " + t2.speed + "  " + speed);

        upDown = 200;
        System.out.println("t2�� �ӵ��� " + upDown + "��ŭ ����");
        speed = t2.speedUp(upDown);
        System.out.println("t2�� �ӵ� : " + t2.speed + "  " + speed);

        upDown = 250;
        System.out.println("t2�� �ӵ��� " + upDown + "��ŭ ����");
        speed = t2.speedUp(upDown);
        System.out.println("t2�� �ӵ� : " + t2.speed + "  " + speed);

        upDown = 250;
        System.out.println("t2�� �ӵ��� " + upDown + "��ŭ ����");
        speed = t2.speedUp(upDown);
        System.out.println("t2�� �ӵ� : " + t2.speed + "  " + speed);


        System.out.println(t1 + "   " + t2);    // toString() �޼ҵ尡 Car Class���� ������ �Ǿ���
        System.out.println(t1.toString() + "   " + t2.toString());
        */

        //Taxi t3 = new Taxi("K5" /* new String("K5") */, "��ȫ��", "KIA");
        //System.out.println(t2 + "   " + t3);
        //System.out.println(t2.hashCode() + "   " + t3.hashCode());

        // �񱳿����ڴ� �⺻ Data Type�� ��� ���� ��, Reference Type�� ��� �ּ� ���� ��
        /*
        if (t2 == t3) {
            System.out.println("t2�� t3�� �ּҰ��� ���� �� �̴�");
        } else {
            System.out.println("t2�� t3�� �ּҰ��� �ٸ� �� �̴�");
        }

        //
        if (t2.equals(t3)) {
            System.out.println("t2�� t3�� ���̸��� ���� �� �̴�");
        } else {
            System.out.println("t2�� t3�� ���̸��� �ٸ� �� �̴�");
        }
        */


        //Car car = new Car();
        Car car = new Taxi();
        Taxi t;
        t = (Taxi)car;
        t.initPrice();


        // ���������δ� ������ ���� �����ϸ� exception
        Car b = new Bus();
        Taxi t5 = (Taxi)b;
    }

}