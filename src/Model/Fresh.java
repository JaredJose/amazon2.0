package Model;

public class Fresh extends Product {
	
	private int calories;

	Fresh(int calories) {
		super.type = "Fresh";
		super.addToList();
		setCalories(calories);
	}
	
	Fresh(Product p){
		super.type = "Fresh";
		super.setDescription(p.getDescription());
		super.setID(p.getID());
		super.setName(p.getName());
		super.setPrice(p.getPrice());
		super.setType(p.productType());
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public int getCalories() {
		return this.calories;
	}
}
