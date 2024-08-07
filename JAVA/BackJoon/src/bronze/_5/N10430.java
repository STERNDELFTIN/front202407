package bronze._5;

import java.util.Scanner;

public class N10430 {

	public static boolean CheckNumRange(int num) {
		if (num >= 2 && num <= 10000)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (CheckNumRange(A) == true && CheckNumRange(B) == true && CheckNumRange(C) == true) {
			System.out.println( (A+B)%C );
			System.out.println( ((A%C)+(B%C))%C );
			System.out.println( (A*B)%C );
			System.out.println( ((A%C)*(B%C))%C );
		}
		
		sc.close();
	}

}
