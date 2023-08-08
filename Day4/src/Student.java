
public class Student {

	//1.추상화 (모델링)
	//2.캡슐화 (은닉화)
	private String 학번;
	private String 전공;
	private String 수강과목;
	
	//3.기본 생성자
	public Student() {
		
	}
	
	//4.3개인자 생성자
	public Student(String 학번, String 전공, String 수강과목) {
		this.학번 = 학번;
		this.전공 = 전공;
		this.수강과목 = 수강과목;
	}
	
	//생성자 오버로딩
	public Student(String 학번, String 전공) {
		this(학번, 전공, "자바");
	}
	
	
	//5.setter 메소드
	public void set학번(String 학번) {
		this.학번 = 학번;
	}
	public void set전공(String 전공) {
		this.전공 = 전공;
	}
	public void set수강과목(String 수강과목) {
		this.수강과목 = 수강과목;
	}
	
	//6.getter 메소드
	public String get학번() {
		return 학번;
	}
	public String get전공() {
		return 전공;
	}
	public String get수강과목() {
		return 수강과목;
	}
	
	public void showInfo() {
		System.out.println("학번:" + 학번 + "\t전공:" + 전공 + "\t수강과목:" + 수강과목);
	}
	
	
	
	
	
}
