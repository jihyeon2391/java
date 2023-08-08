
public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cf = new CoffeeMachine(2,2,2);
		cf.makecoffee(2,2);
		System.out.println(cf.getSugar());
		cf.setSugar(1);
		System.out.println(cf.getSugar());
	}

}


class CoffeeMachine	{  //은닉화
	private int coffee;
	private int sugar;
	private int cream;
	
	
	public CoffeeMachine() {  //생성자
		
	}
	
	
	public CoffeeMachine(int coffee, int sugar, int cream) {
		this.coffee = coffee;
		this.sugar = sugar;
		this.cream = cream;
	}
	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}
	public void setCream(int cream) {
		this.cream = cream;
	}
	public void sugar(int sugar) {
		this.sugar = sugar;
	}
	
	
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public int getCoffee() {
		return coffee;
	}
	public int getCream() {
		return cream;
	}
	
	public void makecoffee(int coffee, int sugar) {
		System.out.println("커피:" + coffee + ", " + "설탕:" + cream + " 커피 만듦");
	}
	public void makecoffee(int coffee) {
		System.out.println("커피:" + coffee + " 커피 만듦");
	}
	public void makecoffee(int coffee, int sugar, int cream) {
		System.out.println("커피:" + coffee + " 크림:" + cream + " 설탕:" + sugar + " 커피 만듦");
	}
	
	
//	public void creamcoffee(int cream, int coffee) {
//		System.out.println("커피:" + coffee + ", " + "크림:" + cream + "커피 만듦");
//	}
//	
//	public void americano(int coffee) {
//		System.out.println("커피:" + coffee + "커피 만듦);
//	}
}
