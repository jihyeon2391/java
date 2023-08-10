package my.dya5.exam9;

public abstract class Animal {
	
	//추상 클래스 : 객체를 생성하지 못한다 new(x)
	//적어도 1개의 추상 메소드를 포함해야한다
	
	String name;
	
	abstract void sound();
	
	String getName() {
		return name; 
	}

}
