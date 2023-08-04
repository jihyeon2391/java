//3,6,9일 때 박수

public class ContinueExam {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%3 == 0) {
				System.out.print("짝");
				continue;
			}
			System.out.print("" + i);
		}
	}
}
				
