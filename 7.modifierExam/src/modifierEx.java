public class modifierEx {

    public static void main(String[] args) {

        // ������(modifier)
        //      1) abstract
        //      2) static : ����
        //      3) final
        //          a. class    : ��� �Ұ�
        //          b. method   : Override �Ұ�
        //          c. variable : �� ���� �Ұ� (���)


        //              abstract            static          final
        //
        // class            O                 X               O
        //                            (inner class ����)

        // method           O                 O               O

        // variable         X                 O               O


        // class A {

        //      class B { // static ����

        //      }
        // }
    }
}


// final class FinalMethod {
class FinalMethod {

    // final int x = 10;

    int x = 10;

    //public final void a() {
    public void a() {
        x = 20;
    }
}

class FinalMethodExt extends FinalMethod {

    public void a() {
        x = 30;
    }
}