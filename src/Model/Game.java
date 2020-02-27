package Model;

public class Game extends Product {

	private String genre;
	
	Game(String genre) {
		super.type = "Game";
		super.addToList();
		setGenre(genre);
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getGenre() {
		return this.genre;
	}
}
