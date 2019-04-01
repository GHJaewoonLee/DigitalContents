
public class SonataArrayTest {

	public static void main(String[] args) {
		
		int length = 4;
		Sonata[] sonata = new Sonata[length];
		
		sonata[0] = new Sonata("Èò»ö", 5000, "½Â¿ë", "NF");
		sonata[1] = new Sonata("Àº»ö", 7000, "¾÷¹«", "Brilliant");
		sonata[2] = new Sonata("°¨È«»ö", 4000, "ÅÃ½Ã", "EF");
		sonata[3] = new Sonata("°ËÁ¤»ö", 6000, "½Â¿ë", "Hybrid");
		
		for (int i = 0; i < length; i++) {
			System.out.println(sonata[i].toString());
		}
	}
}
