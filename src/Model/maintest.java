package Model;

public class maintest {
	public static void main(String[] args) {
		
		Electronic item = new Electronic("testItem");
		item.print();
		
		Fresh fruit = new Fresh("fruit");
		fruit.print();
		
		Game monopoly = new Game("Monopoly");
		monopoly.print();
		
		Clothing dress = new Clothing("Dress");
		dress.print();
		
		Tool hammer = new Tool("Hammer");
		hammer.print();
	}
}
