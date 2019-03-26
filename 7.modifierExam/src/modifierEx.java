public class modifierEx {

    public static void main(String[] args) {

        // 수정자(modifier)
        //      1) abstract
        //      2) static : 공유
        //      3) final
        //          a. class    : 상속 불가
        //          b. method   : Override 불가
        //          c. variable : 값 변경 불가 (상수)


        //              abstract            static          final
        //
        // class            O                 X               O
        //                            (inner class 제외)

        // method           O                 O               O

        // variable         X                 O               O


        // class A {

        //      class B { // static 가능

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