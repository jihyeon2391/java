package my.dya5.exam10;

import java.util.Scanner;

//1.Student(이름, 학번, 학급)
//2.Teacher(이름, 교번, 과목)
//3.Staff(이름, 사번, 부서)
//4.InstituteApp=main() 애플리케이션
public abstract class Person {
	
	private String name;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract String getId();
	public abstract void setId(String id);
	
	
	//추상 메소드 정의

	
	//기본 생성자
	public Person() {}
	
	
	public Person(String name, String id) {
	
		this.name = name;
		this.id = id;
	}
	
	//사람 정보를 입력받는 모듈
	public void inputInfo() {
		System.out.println("이름을 입력 : ");
		Scanner sc = new Scanner(System.in);
		String nm = sc.next();
		name = nm;
	}
	
	//사람의 정보를 문자열로 반환해주는 메소드
	public String personInfo() {
		String info = "이름 : " + name;
		return info;
	}
	
	//사람의 정보를 콘솔에 출력해주는 메소드
	public void printAll() {
		System.out.println(this.personInfo());
	}
	public String toString(){
		return name; 
	}

}
