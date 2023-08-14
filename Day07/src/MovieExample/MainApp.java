package MovieExample;

public class MainApp {
	static Movie movie;
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		//모든 영화 정보 출력하기
		
//		ArrayList<Movie> list = Movie.findAll();
//		
//		for(Movie m : list) {
//			System.out.println(m.toString());
//		}
//		
//		System.out.println("프로그램 종료");
	
		Menu menu = (Menu) MainMenu.getInstance();  //"메인 메뉴" 가져옴
	
		while(menu != null) {
			menu.print();                    //현재 메뉴 출력
			menu = menu.next();              //사용자 입력 후, 다음 메뉴로 갱신
		}
	System.out.println("프로그램 종료");
	}

}

//interface Menu {
//	void print();
//	Menu next();
//}
//	