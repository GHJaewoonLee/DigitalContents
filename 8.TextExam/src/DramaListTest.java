import java.util.ArrayList;
import java.util.List;


public class DramaListTest {

	public static void main(String[] args) {
	
		List<Drama> list = new ArrayList<Drama>();
		list.add(new Drama("�� �ܿ�, �ٶ��� �д�.", "SBS", "�����", "���μ�", "������"));
		list.add(new Drama("����� ����", "MBC", "�ּ���", null, null));
		list.add(new Drama("���̸���2", "KBS", "ǥ�μ�", "����", "�̴���"));
		list.add(new Drama("�ְ�� �̼���", "KBS", "������", null, "������"));
		
		int len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println((i + 1) + ". " + list.get(i));
		}
	}
}
