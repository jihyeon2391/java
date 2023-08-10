package my.dya5.exam7;

public class CarExample {

	public static void main(String[] args) {
		
		//Car 객체 생성
		Car myCar = new Car();
		
		//Tire 객체 생성
		myCar.tire = new Tire();
		myCar.run();
		
		//한국 타이어 객체 생성
		myCar.tire = new HankookTire();
		myCar.run();
		
		//금호 타이어 객체 생성
		myCar.tire = new KumhoTire();
		myCar.run();

	}

}


