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
		 * Im shit 
		 * leos fat ass
		 */
		
		
		//LinkedList<Product> temp = DatabaseDriver.BuildLL(1, "Clothing");
		
		
		//while(temp.getNext() != null) {
		//	System.out.println(temp.getFirst());
		//}
		
		
		CircleQueue<Product> temp = DatabaseDriver.BuildSplashLL();
		
		System.out.println(temp);
		
		//System.out.println(temp.size());
	}
}
