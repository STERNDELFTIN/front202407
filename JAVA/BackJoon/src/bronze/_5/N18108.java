package bronze._5;

import java.util.Scanner;

public class N18108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt(); // 불기 연도
		if (year >= 1000 & year <= 3000) {
			System.out.println(year - (2541-1998));
		}
		
		sc.close();
	}

}
