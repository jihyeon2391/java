import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		int score;
		
		//90점 이상이면 합격
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		
		score = scan.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		}
		else if ( (80 <= score) & (score < 90) ) {
			System.out.println("B");
		}
		else if ( (70 <= score) & (score < 80) ) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}

	}

}
