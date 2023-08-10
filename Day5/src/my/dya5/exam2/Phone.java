package my.dya5.exam2;

public class Phone {

	//필드 선언
	String model;
	String color;
	
	//인자 생성자
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//메소드 선언
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대 : " + message);
	}
	
	void hangUp() {
		System.out.println("전화 끊습니다.");
	}
}
