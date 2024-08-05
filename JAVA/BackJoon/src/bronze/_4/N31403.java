package bronze._4;

import java.util.Scanner;

public class N31403 {

	public static void checkRange(int num) {
		if (!(num >= 1 && num <= 1000))
			System.exit(0); // 정상적인 (강제)종료
	}
	public static String convertToStr(int num) {
		return Integer.toString(num);
	}
	public static void main(String[] args) {
		// A + B - C 출력
		
		/* 입력 */
		// 정수 A (1<=A<=1000)
		// 정수 B (1<=B<=1000)
		// 정수 C (1<=C<=1000)
		// (단, 주어지는 모든 수는 0으로 시작하지 않는 양의 정수)
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); checkRange(A);
		int B = sc.nextInt(); checkRange(B);
		int C = sc.nextInt(); checkRange(C);
		
		/* 출력 */
		// 수 : A + B - C
		// 문자열 : A + B - C
		System.out.println(A + B - C);
		System.out.println(Integer.parseInt(convertToStr(A) + convertToStr(B)) - C);
	}

}
