class MemberService{

	
		boolean login(String id, String password) {
			if( (id == "hong") & (password == "12345")) {
				return true;
			}
			else {
				System.out.println("id 또는 password가 올바르지 않음");
			}
			return false;
		}
		void logout(String id) {
			if(id == "hong") {
				System.out.println(id + "님이 로그아웃 되었습니다.");
			
			}
			
		}
}

public class MemberServiceExample {
	
	public static void main(String[] args) {
		
		Member user1 = new Member("홍길동", "hong");
		
		MemberService memberservice = new MemberService();
		boolean result = memberservice.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberservice.logout("hong");
		}
		else {
			System.out.println("id 또는 password가 올바르지 않음");
		}
	}
}



class Member {
	public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	//이름
	//아이디
	//패스워드
	//나이
	String name;
	String id;
	String passwword;
	int age;
	
	//인자 생성자 추가
	public Member() {
	
	}

}












