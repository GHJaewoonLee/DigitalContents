public class InterfaceEx {

    public static void main(String[] args) {

        // Interface : 껍데기, 명세서, 약속

        // 1. 정의 : 추상메소드만 가진 클래스의 일종
        //           변수, 구현메소드 X  (상수는 가능)

        // 2. 형식 : 접근제어자 interface InterfaceName {

        //               상수

        //               접근제어자 returnType methodName([args]);


        //           }

        // 3. Interface는 클래스에 구현 후 사용
        //    implements 키워드 사용
        //    다중 implements가 가능

        //    접근제어자 class ClassName [extends ClassName] [implements interface1, interface2, ...] {

        //    }

        // 4. 상위  Class       Interface         Class         Interface

        //          extends     implements        불가능        extends

        //    하위  Class         Class          Interface      Interface

        // *. extends : 상위 클래스의 그대로 가져온다는 의미, implements : 추상메소드를 override 해야 한다는 의미

        // 5. Interface는 객체 생성 불가
        //    클래스에 implements한 후 클래스를 참조하여 객체 생성
        //    implements한 클래스는 반드시 interface의 추상 메소드를 모두 override해야 함

        // *. 상수 : 변경 불가능 값
        //           일반적으로 대문자만 사용
        //           public static final DataType CONST_NAME = value;
        // ex) public final static int YEAR = 2019;
        // ex) public final static String CHAR_SET = "UTF-8";
    }
}
