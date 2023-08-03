
public class P107 {

	public static void main(String[] args) {
		
		/*int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		System.out.println(x);
		System.out.println(y);
		
		int score = 85;
		String result = (!(score>90))? "true" : "false";
		System.out.println(result);*/
		
		/*int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (int) pencils / students ;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);*/
		
		/*int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height /2.0;
		System.out.println(area);*/
		
		
		/*int x = 10;
		int y = 5;
		System.out.println( (x > 7) & (y <= 5) );
		System.out.println( (x%3 == 2) | (y%2 != 1) );*/
		
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		
		if(Double.isNaN(z))
			System.out.println("0.0으로 나눌 수 없음");
		else {
			double result = z + 10;
			System.out.println("결과 : " + result);
		}
		
		

	}

}
