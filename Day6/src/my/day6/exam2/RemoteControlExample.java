package my.day6.exam2;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		//인터페이스 변수 선언
		RemoteControl rc;
		
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(51);
		rc.turOff();
		
		System.out.println("\n");
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(122);
		rc.turOff();
		
		System.out.println("\n");
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("\n");
		
		RemoteControl.changeBattery();
	}
}
