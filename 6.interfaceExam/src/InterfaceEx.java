public class InterfaceEx {

    public static void main(String[] args) {

        // Interface : ������, ����, ���

        // 1. ���� : �߻�޼ҵ常 ���� Ŭ������ ����
        //           ����, �����޼ҵ� X  (����� ����)

        // 2. ���� : ���������� interface InterfaceName {

        //               ���

        //               ���������� returnType methodName([args]);


        //           }

        // 3. Interface�� Ŭ������ ���� �� ���
        //    implements Ű���� ���
        //    ���� implements�� ����

        //    ���������� class ClassName [extends ClassName] [implements interface1, interface2, ...] {

        //    }

        // 4. ����  Class       Interface         Class         Interface

        //          extends     implements        �Ұ���        extends

        //    ����  Class         Class          Interface      Interface

        // *. extends : ���� Ŭ������ �״�� �����´ٴ� �ǹ�, implements : �߻�޼ҵ带 override �ؾ� �Ѵٴ� �ǹ�

        // 5. Interface�� ��ü ���� �Ұ�
        //    Ŭ������ implements�� �� Ŭ������ �����Ͽ� ��ü ����
        //    implements�� Ŭ������ �ݵ�� interface�� �߻� �޼ҵ带 ��� override�ؾ� ��

        // *. ��� : ���� �Ұ��� ��
        //           �Ϲ������� �빮�ڸ� ���
        //           public static final DataType CONST_NAME = value;
        // ex) public final static int YEAR = 2019;
        // ex) public final static String CHAR_SET = "UTF-8";
    }
}
