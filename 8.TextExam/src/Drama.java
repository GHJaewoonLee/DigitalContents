import java.util.Objects;

public class Drama extends TVProgram {

	private String director;
	private String actor;
	private String actress;
	
		
	public Drama(String director, String actor, String actress) {
		super(null, null);
		this.director = director;
		this.actor = actor;
		this.actress = actress;
	}

	public Drama(String title, String broadcast, String director, String actor, String actress) {
		super(title, broadcast);
		
		this.director = director;
		this.actor = actor;
		this.actress = actress;
	}

	@Override
	public String toString() {
		String str = "";
		
		if (!Objects.isNull(director)) {
			str += "\t- 감독 : " + director;
		}
		
		if (!Objects.isNull(actor)) {
			str += ("\n\t- 남자배우 : " + actor);
		}
		
		if (!Objects.isNull(actress)) {
			str += ("\n\t- 여자배우 : " + actress);
		}
		
		return super.toString() + str + "\n"; 
	}
}
