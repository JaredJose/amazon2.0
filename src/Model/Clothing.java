package Model;

public class Clothing extends Product {
	
	private String material;

	Clothing() {
		super.type = "Clothing";
		super.addToList();
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getMaterial() {
		return this.material;
	}
}
