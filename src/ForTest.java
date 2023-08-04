
public class ForTest {

	public static void main(String[] args) {
		//1부터 10까지의 합을 출력 (결과만 출력)
		
		/*int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println("결과: " + sum);*/
		
		//구구단 2단 출력
		
		
		int result;
		
		for(int dan=2; dan<10; dan++) {
			for(int i=1; i<=9; i++) {
				result = dan*i;
				System.out.println(dan + " x " + i + " = " + result);
			}
			System.out.println("=========");
		}
	}
}