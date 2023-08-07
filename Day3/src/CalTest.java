
public class CalTest {

	public static void main(String[] args) {
		
		
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator(100, 200);
		
		//메소드 호출
		
		//더하기 메소드 호출
		int cresult = cal1.puls(10, 20);
		System.out.println("PLUS: " + cresult);
		
		//빼기 메소드 호출
		cal1.min(10, 20);
		
		//곱하기 메소드 호출
		System.out.println(cal2.mul());
		
		//메소드 정보 출력하는 메소드 호출
		cal1.methodInfo();
		
		
	}

}
