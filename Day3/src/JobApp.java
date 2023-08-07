import java.util.ArrayList;
import java.util.Scanner;

public class JobApp {
	//속성
	
	
	public JobApp() {
		
	}
	//메뉴 메소드(반환타입과 매개변수 모두 없는 메소드 타입)
	public void showMenu() {
		System.out.println("======Job======");
		System.out.println("1.구직 등록");
		System.out.println("2.구직자 정보 출력");
		System.out.println("3.종료");
		System.out.println("===============");
		System.out.println("메뉴 번호를 입력");
		System.out.println("===============");
	}
	//사람의 정보를 입력 받는 메소드(반환타입 문자열, 매개변수 없음)
	public void inputPerson() {	
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Name: ");
		String name = scan.next();
		System.out.println("Age: ");
		int age = scan.nextInt();
		System.out.println("Gender: ");
		System.out.println("====Choice====");
		System.out.println("1.M  2.F");
		System.out.println("==============");
//		int gender = scan.nextInt();
		
		char sex;
		int n = scan.nextInt();
		if(n == 1) {
			sex = 'M';
		}
		else {
			sex = 'F';
		}
		
		System.out.println("Phone Number: ");
		String tel = scan.next();
		
		Person person = new Person(name, age, sex, tel);
		
		ArrayList<Person> lsit = new ArrayList<Person>();
		this.add(person);
		
		
		//메소드 내에서 메소드 호출
		
		String result = person.showProfile();
		System.out.println(result);
		
		
	}

	private void add(Person person) {
		
		
	}
	public static void main(String[] args) {
		
		JobApp job = new JobApp();
		job.showMenu();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num == 1) {
			job.inputPerson();
		}
		
		if(num == 3) {
			System.out.println("EXIT");
			System.exit(0);
		}

	}

}
