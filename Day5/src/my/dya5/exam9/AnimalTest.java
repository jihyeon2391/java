package my.dya5.exam9;

public class AnimalTest {
	
	//
	static void animalsound(Animal animal) {
		animal.sound();
	}
	
	public static void main(String[] args) {
	
		Animal animal = new Dog();
		animal.name ="강아지";
		animal.sound();
		
		Cat cat = new Cat();
		animal.name = "고양이";
		animal.sound();
		
		animalsound(animal);
		animalsound(cat);
	}
}
