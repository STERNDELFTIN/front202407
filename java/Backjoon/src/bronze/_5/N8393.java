package bronze._5;

import java.util.Scanner;

public class N8393 {

	public static void main(String[] args) {
		// 1~n까지의 합
		
		/* Input */
		// n 입력 (1 <= n <= 10000)
		Scanner sc = new Scanner(System.in);
		
		int n, sum = 0;
		
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sum += i + 1;
		}
		
		/* Output */
		System.out.println(sum);
		
		sc.close();
	}

}
