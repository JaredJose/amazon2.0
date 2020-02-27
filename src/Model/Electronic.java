package Model;

public class Electronic extends Product {
	
	private boolean inProduction;

	Electronic(boolean inProduction) {
		super.type = "Electronic";
		super.addToList();
		setProduction(inProduction);
	}
	
	public void setProduction(boolean inProduction) {
		this.inProduction = inProduction;
	}
	
	public boolean getProduction() {
		return this.inProduction;
	}
}
