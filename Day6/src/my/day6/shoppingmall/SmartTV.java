package my.day6.shoppingmall;

public class SmartTV extends Product {
	String resolution; // 해상도
	
	public SmartTV(String pname, double price, String resolution) {
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
	}

	@Override
	public void printExtra() {
		System.out.println("해상도 : " + resolution);
		
	}
	
	

}
