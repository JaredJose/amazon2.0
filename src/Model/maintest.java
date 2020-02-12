package Model;

import Control.LinkedList;

public class maintest {
	
	public static LinkedList<Product> productList = new LinkedList<>();  
	
	public static void main(String[] args) {
		
		Electronic item = new Electronic();
		item.setName("iPohne");
		item.print();
		
		Fresh fruit = new Fresh();
		fruit.setName("Strawberry");
		fruit.print();
		
		Game boardGame = new Game();
		boardGame.setName("Monopoly");
		boardGame.print();
		
		Clothing dress = new Clothing();
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
	}
}
