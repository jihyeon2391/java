import java.util.ArrayList;

public class SchoolApp {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.set전공("정보통신");
		student1.set학번("2018");
		student1.set수강과목("자바");
		
		System.out.println("student1 학번: " + student1.get학번());
		student1.showInfo();
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add( new Student("2019", "컴퓨터공", "파이썬"));
		
		System.out.println(list.size());
		
		for(Student s : list ) {
			System.out.println("");
			s.showInfo();
		}

	}

}
