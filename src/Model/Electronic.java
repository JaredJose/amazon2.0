package Model;

public class Electronic extends Product {
	
	private boolean inProduction;

	Electronic() {
		super.type = "Electronic";
		super.addToList();
	}
	
	public void setProduction(boolean inProduction) {
		this.inProduction = inProduction;
	}
	
	public boolean getProduction() {
		return this.inProduction;
	}
}
