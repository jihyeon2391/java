package my.day6.exam2;

public interface RemoteControl {
	//구성요소
	//상수필드, 추상메소드
	
	//static final double PI = 3.14159;
	
	//상수 필드
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	
	//추상 메소드
	void turnOn();
	void turOff();
	void setVolume(double volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
			
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제");
		}
	}
	
	//static 메소드
	//구현 객체 없이 호출 가능
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
	

}
