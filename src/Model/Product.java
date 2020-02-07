package Model;

public abstract class Product {

	public String name;
	public float price;
	public int ID;
	public String type;
	
	public String toString() {
		return (name + ", " + type);
	}
	
	public String productType() {
		return type;
	}

	public void print() {
		System.out.println(this);
	}
}
