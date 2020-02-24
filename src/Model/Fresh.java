package Model;

public class Fresh extends Product {
	
	private int calories;

	Fresh() {
		super.type = "Fresh";
		super.addToList();
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public int getCalories() {
		return this.calories;
	}
}
