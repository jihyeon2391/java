package my.day6.shoppingmall;

public class User {
	
	String name;
	PayType payType;
	
	public User(String name, PayType payType) {
		this.name = name;
		this.payType = payType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PayType getPayType() {
		return payType;
	}
	public void setPayType(PayType payType) {
		this.payType = payType;
	}
	
	
	
	

}
