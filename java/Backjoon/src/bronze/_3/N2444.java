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
		
		int N = sc.nextInt(); sc.nextLine();
		int NCopy = N - 1;
		
		for (int i = 1; 2 * i - 1 <= 2 * N - 1; i++) {
			for (int j = NCopy; j > 0; j--) {
				System.out.print(" ");
			}
			NCopy--;
			for (int j = 2 * i - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		NCopy = 0;
		for (int i = 2 * (N-1) - 1; i > 0; i -= 2) {
			for (int k = 0; k <= NCopy; k++) {
				System.out.print(" ");
			}
			NCopy++;
			for (int j = i; j > 0; j--) {
				System.out.print("*");			
			}
			System.out.println();
		}

		sc.close();
	}

}
