package my.day6.shoppingmall;

public abstract class Product {
	String pname;
	double price;
	
	void printDetail() {
		System.out.println("상품명 : " + pname);
		System.out.println("가격 : " + price);
		printExtra();
	}
	
	public abstract void printExtra();
}
