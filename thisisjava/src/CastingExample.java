
public class CastingExample {

	public static void main(String[] args) {
		
		int var1 =  10;
		byte var2 = (byte) var1;
		System.out.println(var2);
		
		double var3 = 3.14;
		int var4 = (int) var3;
		System.out.println(var4);
		
		if(var3==var4)
			System.out.println("same");
		else
			System.out.println("not same");
		
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6);
		
		long var7 = 303;
		int var8 = (int) var7;
		System.out.println(var8);
		
		
		
		
		char v6 = 'A';
		char v7 = 1;
		int result = v6 + v7;
		System.out.println("result: " + result);
		System.out.println("result: " + (char)result);
		System.out.println("result: " + (char)result);
		System.out.println((int)v6);
		
		
		int v8 = 10;
		double result2 = (double)v8 / 4;
		System.out.println(result2);
		
		
		

	}

}
