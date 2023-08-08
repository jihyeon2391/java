
public class MethodTest {
	
	static final double PI = 3.14592;

	// 1. 7단 출력 메소드
	void gugu1() {
		int dan = 7;
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
		}
	}

	// 2. 구구단 원하는 단을 출력해주는 메서드를 만들어주세요.(매개변수)
	public void gugu1(int dan) {
		for(int i = 1; i < 10; i++) {
		    System.out.println(dan + " X " + i + " = " + dan * i);
		}  
	}

	// 3. 구구단 원하는 단을 출력해주는 메서드를 만들어주세요.(매개변수)
	public void gugu3(int limit) {  //1단부터 limit 단까지 출력
		for (int dan = 1; dan <= limit; dan++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " x " + i + " = " + dan * i);
			}
		}
	}

	// 4. 원하는 이름을 출력해주는 메서드를 만들어주세요(매개변수)
	public static void printName(String name) {
		System.out.println(name);
	}

	// 5. 자신의 이름을 리턴하는 메서드를 만들고 변수 my_name에 저장해주세요. 
	// 그리고 my_name을 출력해주세요.(리턴값 O)
	String getName() {
		return "김지현";
	}

	// 6. 
	static int square(int num) {
		return num * num;
	}
	
	
	static double area(double radius) {
		return radius * radius * PI;
	}

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		mt.gugu1();
		System.out.println("===========");
		mt.gugu1(3);
		System.out.println("===========");
		mt.gugu3(5);
		System.out.println("===========");
		int num1 = square(10);
		System.out.println(num1);
		System.out.println("===========");
		printName("홍길동");
		System.out.println("===========");
		String my_name = mt.getName();
		System.out.println(my_name);
		System.out.println(MethodTest.area(6.0));

	}

}