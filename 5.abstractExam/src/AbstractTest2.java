import java.io.*;


public class AbstractTest2 {

    public static void main(String[] args) throws IOException {

        // 3. �ܺ� Ŭ������ ����
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("calc");

        // <����>
        // 1) Process ��ü�� �����ϰ� ������ Process�� �߻�Ŭ���� �̹Ƿ� ��ü ���� �Ұ���
        // 2) Runtime ��ü�� �����غ���
        // 3) Runtime Ŭ������ �߻�Ŭ������ �ƴϹǷ� ��ü ���� ����
        // 4) �׷��� �����ڰ� ����
        // 5) �׷��� �޼ҵ带 �̿�����
        // 6) getRuntime() �޼ҵ带 �̿��ϸ� Runtime ��ü�� ������ �� ����
        // 7) ������ Runtime ��ü���� exec() �޼ҵ带 �̿��ϸ� Process ��ü�� ������ �� ����
    }
}
