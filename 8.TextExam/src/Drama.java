
public class Drama extends TVProgram {

	private String director;
	private String actor;
	private String actress;
	
		
	public Drama(String title, String broadcast, String director) {
		super(title, broadcast);
		this.director = director;
	}

	public Drama(String title, String broadcast, String director, String actor, String actress) {
		this(title, broadcast, director);
		this.actor = actor;
		this.actress = actress;
	}

	@Override
	public String toString() {
		String str = "";
		
		if (actor != null) {
			str += ("\n\t- 남자배우 : " + actor);
		}
		
		if (actress != null) {
			str += ("\n\t- 여자배우 : " + actress);
		}
		
		return super.toString() + "\t- 감독 : " + director + str + "\n"; 
	}
}
