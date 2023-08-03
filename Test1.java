import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int midScore, finalScore;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("중간고사 점수:");
		midScore = scan.nextInt();
		
		System.out.println("기말고사 점수:");
		finalScore = scan.nextInt();
		
		System.out.printf("중간고사:%d, 기말고사:%d", midScore, finalScore);
		
	}

}
