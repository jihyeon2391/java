package my.dya5.exam10;

import java.util.Scanner;

public class Teacher extends Person {

	private String tId; //교번
	private String subject; //과목
	

	@Override
	public String getId() {
		return tId;
	}
	
	@Override
	public void setId(String id) {
		this.tId = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	public String personInfo() {
		String info = super.personInfo(); //이름 리턴
		info +="\n교번 : " + tId + "\n과목 : " + subject;
		return info;
	}
	@Override
    public void inputInfo() {
        super.inputInfo();
        //이름, 주소
        Scanner sc=new Scanner(System.in);
        System.out.println("교번을 입력하세요=>");
        String i=sc.nextLine();
        setId(i);
        System.out.println("담당과목을 입력하세요=>");
        String d=sc.nextLine();
        setSubject(d);
    }
    @Override
    public void printAll() {
        System.out.println(this.personInfo());
    }
}