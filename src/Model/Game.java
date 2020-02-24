package Model;

public class Game extends Product {

	private String genre;
	
	Game() {
		super.type = "Game";
		super.addToList();
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getGenre() {
		return this.genre;
	}
}
