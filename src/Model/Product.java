package Model;

import Control.*;

public abstract class Product {

	public String name;
	public float price;
	public int ID;
	public String type;
	public String description;
	public String imageURL;
	
	public Product next;
	public Product previous;
	
	public String toString() {
		return (name);
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
	
	protected void setDescription(String description) {
		this.description = description;
	}
	
	protected void setType(String type) {
		this.type = type;
	}
	
	protected void setImageURL(String path) {
		this.imageURL = path;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
	
	protected int getID() {
		return this.ID;
	}
	
	public String getImageURL() {
		return this.imageURL;
	}
	
	//Console
	public void print() {
		System.out.println(this);
	}
}
