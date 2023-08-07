//수도 요금 계산
// 메뉴 (1~3), 사용량(liter)
//1. 가정용 (liter 당 50원)
//2. 상업용 (liter 당 45원)
//3. 공엽용 (liter 당 30원)
// 메뉴 선택 후 사용량을 입력
//-출력될 내용-
// 사용요금 = 사용량 * 리터당 가격
// 총수도요금 = 사용요금 + 세금(요금의 5%)

import java.util.Scanner;

public class WaterCal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메뉴");
		System.out.println("1. 가정용 (리터당 50원)");
		System.out.println("2. 상업용 (리터당 45원)");
		System.out.println("3. 공업용 (리터당 30원)");
		System.out.println("=======================");
		System.out.print("메뉴 선택");
		
		int num = scan.nextInt();
		
		
		System.out.print("사용량 입력 : ");
		
		int use = scan.nextInt();
		
		boolean  bool = true;
		int a = use * 50 ;
		int b = use * 45;
		int c = use * 30;
		double tax = use * 0.05;
		double f = use + tax;
		while(true) {
			if(num == 1) {
				System.out.println("사용 요금 : " + a);
			}
			else if (num == 2) {
				System.out.println("사용 요금 : " + b);
			}
			else if (num == 3) {
				System.out.println("사용 요금 : " + c);
			}
		}
		

	}

}
