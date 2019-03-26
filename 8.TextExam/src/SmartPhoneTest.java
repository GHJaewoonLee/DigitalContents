public class SmartPhoneTest {

    public static void main(String[] args) {

        SmartPhone s1 = new SmartPhone("삼성", "갤럭시노트2", 850000);
        SmartPhone s2 = new SmartPhone("애플", "아이폰5", 740000, 30);
        SmartPhone s3 = new SmartPhone("삼성", "갤럭시S3", 750000, 35);

        System.out.println("=== 제품목록 ===");
        s1.info();
        s2.info();
        s3.info();
        System.out.println("-------------------");
    }
}