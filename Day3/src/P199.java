import java.util.Scanner;
public class P199 {

	public static void main(String[] args) {
// 문제 6
//		int[][] array = {
//			{95, 86},
//			{83, 92, 96},
//			{78, 83, 93, 87, 88}
//		};
//		
//		int[][] array1 = new int[3][];
//		array1[0] = new int[2];
//		array1[1] = new int[3];
//		array1[2] = new int[5];
//		
//		array1[0][0] = 95;
//		array1[0][1] = 86;
//		array1[1][0] = 83;
//		array1[1][1] = 92;
//		array1[1][1] = 96;
//		array1[2][0] = 78;
//		array1[2][1] = 83;
//		array1[2][2] = 93;
//		array1[2][3] = 87;
//		array1[2][4] = 88;
//		
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println("");
//		}
		
// 문제 7
//		int[] array = {1, 5, 3, 8, 2};
//		int max = -1;
//		for(int i=0; i<array.length; i++) {
//			if(max < array[i]) {
//				max = array[i];
//			}
//			System.out.println("max: " + array[i]);
//		}
		
//문제 8		
//		int[][] array = {
//				{95, 86},
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//		};
//		
//		int[][] array1 = new int[3][];
//		array1[0] = new int[2];
//		array1[1] = new int[3];
//		array1[2] = new int[5];
//		
//		array1[0][0] = 95;
//		array1[0][1] = 86;
//		array1[1][0] = 83;
//		array1[1][1] = 92;
//		array1[1][1] = 96;
//		array1[2][0] = 78;
//		array1[2][1] = 83;
//		array1[2][2] = 93;
//		array1[2][3] = 87;
//		array1[2][4] = 88;
//		
//		int sum = 0;
//		double avg = 0;
//		int count = 0;
//		
//		avg =(double) sum / count;
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++) {
//				sum += array[i][j];
//				count++;
//			}
//		}
//		avg =(double) sum / count;
//		System.out.println("Total: " + sum);
//		System.out.println("Mean: " + avg);
		
		int[] scores = null;
		int studentnum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		boolean bool = true;
		
		while(bool) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 |4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			
			int num = scan.nextInt();
			
			if(num == 1) {
				System.out.print("학생수> ");
				studentnum = scan.nextInt();
				scores = new int[studentnum];
			}
			else if(num == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> " );
					scores[i] = scan.nextInt();
				}
			}
			else if(num == 3) {
				
			}
		
		}

	}
}
