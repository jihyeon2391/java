
public class MassTest {

	public static void main(String[] args) {
		int max = Math.max(-5, -8);
		System.out.println("-8과 -5의 최대값 : " + max);
		
		int min = Math.min(-5, -8);
		System.out.println("-8과 -5의 최소값 : " + min);
		
		double max2 = Math.max(1.23, 3.45);
		System.out.println("1,23과 3.45의 최대값 : " + max2);
		System.out.println("5.67의 천정값(올림값) : " + Math.ceil(5.67));
		System.out.println("5.67의 마루값(내림값) : " + Math.floor(5.67));
		
		//3의 7승 값
		double pw = Math.pow(3, 7);
		System.out.println("3의 7승 : " + pw);
		
		//64.0의 제곱근
		double sq = Math.sqrt(64.0);
		System.out.println("64.0의 제곱근 : " +sq);
		
		//반지름 5인 원의 면적과 둘레 계산
		// ==힌트== Math클래스의 PI 필드 이용
	}

}
