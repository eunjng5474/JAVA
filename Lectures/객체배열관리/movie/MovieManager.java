package movie;

public class MovieManager {
	
	private final int MAX_SIZE = 100;
	// final: 더이상 고칠 수 없는 상수 
	private Movie[] movieList = new Movie[MAX_SIZE];
	
	// 싱글턴
	// 1. private으로 자기자신의 인스턴스를 만들기
	// 2. 생성자를 Private으로 막기
	// 3. 유일한 인스턴스에 접근 가능한 getter 만들기 
	
	private static MovieManager instance = new MovieManager();
	
	private MovieManager() {
		
	}
	
	public MovieManager getInstance() {
		return instance;
	}

}
