public class SmartPhoneTest {

    public static void main(String[] args) {

        SmartPhone s1 = new SmartPhone("�Ｚ", "�����ó�Ʈ2", 850000);
        SmartPhone s2 = new SmartPhone("����", "������5", 740000, 30);
        SmartPhone s3 = new SmartPhone("�Ｚ", "������S3", 750000, 35);

        System.out.println("=== ��ǰ��� ===");
        s1.info();
        s2.info();
        s3.info();
        System.out.println("-------------------");
    }
}