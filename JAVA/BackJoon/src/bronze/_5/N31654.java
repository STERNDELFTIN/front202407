package bronze._5;

import java.util.Scanner;

public class N31654 {
	public static void CheckNum(int num) {
		if (num < Math.pow(-10,  9) || num > Math.pow(10,  9))
			System.exit(0);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, sum;
		int result;
		
		n1 = sc.nextInt();
		CheckNum(n1);
		n2 = sc.nextInt();
		CheckNum(n2);
		sum = sc.nextInt();
		CheckNum(sum);
		
		result = n1 + n2;
		if (sum == result)
			System.out.println("correct!");
		else
			System.out.println("wrong!");
		
		sc.close();
	}

}
