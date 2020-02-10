package Model;

public class Electronic extends Product {

	Electronic() {
		super.type = "Electronic";
	}

	@Override
	protected void setPrice() {
		
	}

	@Override
	protected void setName(String name) {
		super.name = name;
	}

	@Override
	protected void setID() {
		// TODO Auto-generated method stub
		
	}
}
