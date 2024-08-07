package bronze._3;

import java.util.Scanner;

public class N2444 {

	public static void main(String[] args) {
		/* input: 5
		 	 *
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    *
		*/
		/* Input */
		// N (1 <= N <= 100)
		
		/* Output */
		// 첫째줄부터 2N - 1번째 줄까지 차례대로 별 출력
		
		Scanner sc = new Scanner(System.in);
		
		int N = 5;
		
		for (int i = 1; 2 * i - 1 <= N; i++) {
			for (int j = 2 * i - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 2 * (N-1) - 1; i > 0; i--) {
			System.out.print("*");
		}
		
		for (int i = 1; (i + 1) / 2 <= N; i++) {
			for (int j = (i + 1) / 2; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
