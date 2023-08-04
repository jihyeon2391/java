import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		System.out.println("======GAME MENU======");
		System.out.println("1.가위\t2.바위\t3.보\nEsc.종료");
		System.out.println("======CHOICE======");
		System.out.print("숫자 입력 : ");
		
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		
		int com = (int)(Math.random()*3) + 1;
		
		System.out.println("User:" + user);
		System.out.println("Com:" + com);
		
		if (user == com) {
			System.out.println("Draw");
		}
		else if( (user == 1 & com == 3) | (user == 2 & com == 1) | (user == 3 & com == 2) ) {
			System.out.println("User's win");
		}
		else if( (user == 1 & com == 2) | (user == 2 & com == 3) | (user == 3 & com == 1) ) {
			System.out.println("Com's win");
		}

	}

}
