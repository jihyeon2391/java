

public class ExceptionExample {
	
	static void printLength(String data) throws Exception {
		
	

		int result = data.length();
		System.out.println("문자 수 : " + result);
		
		Class.forName("java.lang.String2");
		System.out.println("java.lang.String 클래스가 존재");
		
			System.out.println("마무리 실행");
		}



	public static void main(String[] args) throws Exception {
		printLength("This is java");
		printLength(null);
		System.out.println("프로그램 종료");
	}

}
