package bronze._3;

import java.util.Scanner;

public class N2444_2 {

	public static void main(String[] args) {
		// 출처 : https://youjourney.tistory.com/39
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < N - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j < N - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
