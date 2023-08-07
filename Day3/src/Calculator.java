
public class Calculator {

	//속성
	int num1, num2;
	
	
	//생성자
	//기본 생성자
	public Calculator() {
		
	}
	
	
	//인자 생성자(멤버 변수 초기화)
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//1.메소드 (반환타입o, 매개변수o)
	public int puls(int n1, int n2) {
		return n1 + n2;
		
	}
	
	//2.메소드 (반환타입x, 매개변수o)
	public void min(int n1, int n2) {
		System.out.println(n1 - n2);
		
	}
	
	//3.메소드 (반환타입o, 매개변수x)
	public int mul() {
		return (num1 * num2);
	}
	
	//4.메소드 (반환타입x, 매개변수x)
	
	public void methodInfo() {
		System.out.println("반환타입과 매개변수가 없는 메소드");
	}

}
