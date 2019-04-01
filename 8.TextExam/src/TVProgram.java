import java.util.Objects;


public class TVProgram {

	private String title;
	private String broadcast;
	
	
	public TVProgram(String title, String broadcast) {
		this.title = title;
		this.broadcast = broadcast;
	}

	@Override
	public String toString() {
		String str = "";
		
		if (!Objects.isNull(title)) {
			str += title;
		}
		
		if (!Objects.isNull(broadcast)) {
			str += " (" + broadcast + ")";
		}
		
		return str + "\n";
	}
}
