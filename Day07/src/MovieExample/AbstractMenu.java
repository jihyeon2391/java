package MovieExample;

import java.util.Scanner;


public abstract class AbstractMenu implements Menu {
	protected String menuTest;  //기본 문구
	protected Menu prevMenu;  //이전 메뉴 
	
	protected static final Scanner scanner = new Scanner(System.in);
	
	public AbstractMenu(String menuTest, Menu preMenu) {  //생성자
		this.menuTest = menuTest;
		this.prevMenu = prevMenu;
	}
	
	public void print() {
		System.out.println("\n" + menuTest);  //메뉴 출력
	}
	
	public void setPrevMenu(Menu prevMenu) {  //세터 메소드
		this.prevMenu = prevMenu;
	}
	
	
}
