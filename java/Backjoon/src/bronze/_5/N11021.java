package bronze._5;

import java.util.Scanner;

public class N11021 {

	public static void CheckScope(int n1, int n2) {
		if (!(n1 > 0 && n2 < 10)) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* Input */
		// 1. 테스트케이스 개수 T
		// 2. 두 정수 A와 B (0<A, B<10)
		
		/* Output */
		// 각 테스트케이스마다 "Case #x: " 출력 (번호시작 1)
		// A+B
		
		int A, B, T;
		String strAB = "";
		String[] strABSplit;
		
		T = sc.nextInt(); sc.nextLine();
		for (int i = 0; i < T; i++) {
			strAB = sc.nextLine();
			strABSplit = strAB.split(" ");
			A = Integer.parseInt(strABSplit[0]);
			B = Integer.parseInt(strABSplit[1]);
			CheckScope(A, B);
			
			System.out.println("Case #" + (i + 1) + ": " + (A + B));
		}
		
		sc.close();
	}

}
