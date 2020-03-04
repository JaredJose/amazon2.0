package Model;

public class maintest {
	
	public static LinkedList<Product> productList = new LinkedList<>();  
	
	public static void main(String[] args) {
		/*
		Electronic item = new Electronic(true);
		item.setName("iPohne");
		item.print();
		
		Fresh fruit = new Fresh(100);
		fruit.setName("Strawberry");
		fruit.print();
		
		Game boardGame = new Game("board");
		boardGame.setName("Monopoly");
		boardGame.print();
		
		Clothing dress = new Clothing("silk");
		dress.setName("Louis Vuitton");
		dress.print();
		
		Tool smashObject = new Tool();
		smashObject.setName("Hammer");
		smashObject.print();
		
		System.out.println(productList);
		/*
		/* 
		 * Im shit 
		 * leos fat ass
		 */
		
		LinkedList<Product> temp = DatabaseDriver.BuildLL(1, "Fresh");
		Node tNode = temp.firstNode;
		while(tNode != null) {
			System.out.println(tNode);
			tNode = tNode.getNext();
		}
		
		
	}
}
