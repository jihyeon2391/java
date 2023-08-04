public class WhileTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		/*String str = "";
		Scanner scan = new Scanner(System.in);
		while(true) {
			str = scan.next();
			if( str.equals("x") | str.equals("X") )
				break;
			
		}
		System.out.println("END");*/
		
		//while루프 이용해 임의의 난수 (실수) 발생시키고
		//발생된 각 수를 누진 합산하는 프로그램 작성
		//단, 누진 합계가 20을 넘으면 루프 종료
		
		//boolean bool = false;
		double sum = 0.0;
		while(true) {
			double no = Math.random();
			sum += no;
			Thread.sleep(1000);
			System.out.println("sum : " + sum);
			if(sum > 20)
				break;
		}
		System.out.println("END");

	}

}
