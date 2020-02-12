package Model;

import Control.*;

public abstract class Product {

	public String name;
	public float price;
	public int ID;
	public String type;
	public String description;
	
	public Product next;
	public Product previous;
	
	public String toString() {
		return (name + ": " + type);
	}
	
	public String productType() {
		return type;
	}
	
	public void addToList() {
		maintest.productList.add(this);
	}

	protected void setPrice(float price) {
		this.price = price;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	protected void setID(int ID) {
		this.ID = ID;
	}
	
	protected void setDescription(String desc) {
		this.description = desc;
	}
	
	//Console
	public void print() {
		System.out.println(this);
	}
}
