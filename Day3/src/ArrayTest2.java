
public class ArrayTest2 {

	public static void main(String[] args) {

// 문자열 3개의 값을 저장하는 배열 생성
//		String names[] = {"홍길동", "박길동", "김길동"};
//		
//		String[] names2 = null;
//		names2 = new String[] {"a","b","c"};
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
				
	}

}
