package exam1;
public class BoxTest {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.content = "안녕";
		
		String ct = box.content;
		System.out.println(ct);
		
		Box<Integer> box1 = new Box<Integer>();
		box1.content = 200;
		int ct2 = box1.content;
		System.out.println(ct2);
	}
}
