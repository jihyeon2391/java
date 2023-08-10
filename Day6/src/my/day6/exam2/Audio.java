package my.day6.exam2;

public class Audio implements RemoteControl {
	
	
	double volume;

	@Override
	public void turnOn() {
		System.out.println("오디오 킨다");
		
	}

	@Override
	public void turOff() {
		System.out.println("오디오 끈다");
		
	}

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
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	
	

}
