package my.day6.exam4;

public class Button {
	
	//중첩 인터페이스
	static interface ClickListener{
		
		//추상 메소드
		void onClick();
	}
	
	//필드
	private ClickListener clickListener;
	
	//필드 초기화
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	void click() {
		this.clickListener.onClick();
	}

}
