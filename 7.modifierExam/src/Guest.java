//�� �湮�ڼ��� Ȯ���ϴ� ��쿡��
//���� �湮�ڰ� ���� �湮�ڿ��� ������ �ֱ� ������
//static�� ����Ͽ� ����

//non-static/static �޼ҵ忡���� static ������ ������ �� ������
//static �޼ҵ忡���� non-static ������ ������ �� ���� (��� ��ü�� ������ �����ؾ� �ϴ��� �� �� ����)
public class Guest {

    static int cnt; // Class ���� (Class �� �ϳ��� ������)
    String name;    // instance ����


    public Guest(String name) {
        this.name = name;
    }

    public static int visit() {
        cnt++;
        return cnt;
    }
}
