import java.util.Scanner;

public class IfEvenOdd {

	public static void main(String[] args) {
		//0부터 9사이의 정수 입력 받아
		//짝수, 홀수 판단하는 코드 작성
		//단, if문 사용
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		
		num = scan.nextInt();
		
		if(num %2 == 0) {
			System.out.println("even");
		}
		else if(num %2 == 1) {
			System.out.println("odd");
		}
	}

}


