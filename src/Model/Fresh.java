package Model;

public class Fresh extends Product {
	
	private int calories;

	Fresh(int calories) {
		super.type = "Fresh";
		super.addToList();
		setCalories(calories);
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public int getCalories() {
		return this.calories;
	}
}
