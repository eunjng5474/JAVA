package movie;

public class Movie {
	private int id;
	private String title;
	private String director;
	private String genre;
	private int runningTime;
	
	
	
	// Generate Constructor using Fields - deselect all (select all 이후에) 
	public Movie() {
//		super();
	}
	// Source - Generate Constructor using Fields - select all
	public Movie(int id, String title, String director, String genre, int runningTime) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
	
	// 접근자와 설정자 (Source - Generate Getter and Setter)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	
	// Source - Generate toString()
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", director=" + director + ", genre=" + genre + ", runningTime="
				+ runningTime + "]";
	}
	

}
