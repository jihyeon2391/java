
public class Person {
	
	String name;
	int age;
	
	public void eat(String sr) {
		System.out.println(sr + "을 먹는다");
	}
	
	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.age = 20;
		person.name = "홍길동";
		person.showInfo();
		Person person2 = new Person();
		person.age = 30;
		person.name = "박길동";
		person.showInfo();

	}

}
