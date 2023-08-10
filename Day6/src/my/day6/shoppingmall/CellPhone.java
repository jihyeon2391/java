package my.day6.shoppingmall;

public class CellPhone extends Product {
	
	String carrier;  //통신사
	
	public CellPhone(String pname, double price, String carrier) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
	}

	@Override
	public void printExtra() {
		System.out.println("통신사 : " + carrier);
		
	}

}
