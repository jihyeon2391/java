import java.util.Scanner;

public class P138_7 {

	public static void main(String[] args) {
		
//		int in=0;
//		int out = 0;
		int rest =0 ;
		Scanner scan = new Scanner(System.in);
		
		
		boolean bool = true;
		
		while(bool) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 |4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			
			String num = scan.nextLine();
			
			if(num.equals("1")) {
				System.out.print("예금액>");
				rest += scan.nextInt();
				
			}
			else if(num.equals("2")) {
				System.out.print("출금액>");
				rest -= scan.nextInt();
				
			}
			else if(num.equals("3")) {
				System.out.print("잔고>" + rest);
				
				
			}
			else if(num.equals("4")) {
				System.out.println("");
					break;
			}
//			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
