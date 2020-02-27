package Model;

public class Clothing extends Product {
	
	private String material;

	Clothing(String material) {
		super.type = "Clothing";
		super.addToList();
		setMaterial(material);
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getMaterial() {
		return this.material;
	}
}
