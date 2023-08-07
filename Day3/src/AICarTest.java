
public class AICarTest {

	public static void main(String[] args) {
		
		Person hong = new Person();
		Car sportsCar = new Car();
		Car sedanCar = new Car(1000, "Black");
		
		hong.name = "J";
		hong.age = 20;
		
//		sportsCar.run(50);
//		sedanCar.run(100);
		System.out.println(sportsCar.speed);
		System.out.println(sedanCar.speed);
		System.out.println(sportsCar.color);
		System.out.println(sedanCar.color);
		
//		hong.eat();
//		hong.smile();
				
	}

}
