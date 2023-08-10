package my.day6.exam2;

public class Television implements RemoteControl{
	
	//필드
	private double volume;
	
	
	@Override
	public void setVolume(double volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
		
	}
	@Override
	public void turnOn() {
		System.out.println("TV를 킨다");
		
	}
	@Override
	public void turOff() {
		System.out.println("TV를 끈다");
		
	}
	

}
