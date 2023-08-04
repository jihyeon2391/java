
public class P138 {

	public static void main(String[] args) {
		/*
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0){
				sum = sum + i; 
			}
			
		}
		System.out.println("결과: " + sum);*/
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
