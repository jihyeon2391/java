package my.dya5.exam10;

import java.util.Scanner;

public class Student extends Person {

	private String sId; //학번
	private String className; //과목
	
	//personInfo() 메소드 오버라이딩
	@Override
	public String personInfo() {
		String info = super.personInfo(); //이름 리턴
		info +="\n학번 : " + sId + "\n수강과목 : " + className;
		return info;
	}
	
	@Override
	public String getId() {
		return sId;
	}
	
	@Override
	public void setId(String id) {
		this.sId = id;
	}
	
	

	public void inputInfo() {
		super.inputInfo();
		
		System.out.println("학번 입력 : ");
		Scanner sc = new Scanner(System.in);
		String sid = sc.next();
		setId(sid);
		
		System.out.println("수강과목 입력 : ");
		String cn = sc.next();
		setclassName(cn);
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setclassName(String className) {
		this.className = className;
	}
}
	

	
	
