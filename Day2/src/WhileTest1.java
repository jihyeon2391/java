
public class WhileTest1 {

	public static void main(String[] args) {
		
		/*int i = 1;
		int sum = 0;
		while(i<=10) {
			
			sum +=i;    //sum = sum + i
			i++;
		}
		System.out.println("결과 :" + sum);*/
		
		/*int i = 1;
		while(i<=10) {
			System.out.println(i + "");
			i++;*/
		
		/*int i = 1;
		int dan = 2;
		int result = 0;
		while(i<10) {
			result = dan * i;
			i++;
			System.out.println(dan + " x " + i + " = " + result);*/
		
	
		int dan = 2;
		int result;
		while(dan<10) {
			int i = 1;
			while(i<10) {
				result = dan * i;
				System.out.println(dan + " x " + i + " = " + result);
				i++;
			}
			System.out.println("================");
			dan++;
		}

	}
}
