package my.dya5.exam5;

public class HumanTest {

	public static void main(String[] args) {
		
		Human sm = new SuperMan();  //자동 형변환(업캐스팅)
		sm.name = "슈퍼맨";
		sm.height = 200;
		(( SuperMan)sm).power = 99; //강제 형변환(다운캐스팅)
		String result = sm.getInfo();
		System.out.println("---슈퍼맨 정보---");
		System.out.println(result);
		
		Human am = new Aquaman();
		am.name = "아쿠아맨";
		am.height = 199;
		((Aquaman)am).speed = 0;
		String result2 = am.getInfo();
		System.out.println("---아쿠아맨 정보---");
		System.out.println(result2);

	}

}
