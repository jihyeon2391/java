
public class LogicalOperator {

	public static void main(String[] args) {
	
		int charCode = 'A';
		int charCode2 = 15;
		double charCode3 = 160.5;
		
		/*if( (65 <= charCode) & (charCode <= 90) ) {
			System.out.println("capital");
		}
		
		if( (15 <= charCode2) | (charCode3 <= 160) ) {
			System.out.println("available");
		}

		if(charCode2 % 2 == 0) { 
			System.out.println("even");
		}
		else {
			System.out.println("add");*/
				
		
		//3항 연산자로 해결
		char number =(charCode2 %2 == 0) ? 'a' : ((charCode2 %2 == 1) ? 'b' : 'c');  
		System.out.println(charCode2 + "은" + number + "입니다");
		}
	}


