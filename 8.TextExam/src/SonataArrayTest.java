
public class SonataArrayTest {

	public static void main(String[] args) {
		
		int length = 4;
		Sonata[] sonata = new Sonata[length];
		
		sonata[0] = new Sonata("���", 5000, "�¿�", "NF");
		sonata[1] = new Sonata("����", 7000, "����", "Brilliant");
		sonata[2] = new Sonata("��ȫ��", 4000, "�ý�", "EF");
		sonata[3] = new Sonata("������", 6000, "�¿�", "Hybrid");
		
		for (int i = 0; i < length; i++) {
			System.out.println(sonata[i].toString());
		}
	}
}
