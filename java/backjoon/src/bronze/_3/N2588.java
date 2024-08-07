package bronze._3;

import java.util.Scanner;

public class N2588 {

	public static void main(String[] args) {
		// (세자리수)*(세자리수)
		/*	         472 ...(1)
		 *       x 385 ...(2)
		 * -----------------
		 *        2360 ...(3)
		 *      3776 ...(4)
		 *     1416 ...(5)
		 * -----------------
		 *     181720 ...(6)
		 * */ // (3), (4), (5), (6) 위치 들어갈 값
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		int n3, n4, n5, n6;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		n3 = n1 * (n2 % 10);
		n4 = n1 * (n2 % 100 / 10);
		n5 = n1 * (n2 / 100);
		n6 = n1 * n2;
		
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		
		sc.close();
	}

}
