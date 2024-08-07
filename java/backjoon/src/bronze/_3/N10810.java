package bronze._3;

import java.util.Arrays;
import java.util.Scanner;

public class N10810 {

	public static void main(String[] args) {
			
		/* Input */
		// 1. N (1<=N<=100), M (1<=M<=100)
			// 바구니: N개(번), 공: M번
		// 2. M개의 줄에 걸쳐서 공을 넣는 방법이 주어짐
			// 세 정수 i, j, k로 이루어져 있으며,
			// i ~ j번 바구니까지에 k번 공을 넣음
			// ex) 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 의미 (1 <= i <= j <= N, 1 <= k <= N)
			// 입력으로 주어진 순서대로 공을 넣음
			// 이미 바구니에 공이 이미 있는 경우에는 기존 공을 빼고 새로 공을 넣음
		
		/* Output */
		// 1~N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력
			// 공이 들어가지 않은 바구니는 0을 출력
		
		Scanner sc = new Scanner(System.in);
		
		int basket, ball;
		int basketS, basketE, ballNum;
		String input;
		String[] inputSplit;
		int[] ballNumInBasket;
		
		input = sc.nextLine();
		inputSplit = input.split(" ");
		basket = Integer.parseInt(inputSplit[0]);
		ball = Integer.parseInt(inputSplit[1]);
		ballNumInBasket = new int[basket];
		Arrays.fill(ballNumInBasket, 0); // 배열 모든 요소 0으로 초기화
		
		for (int i = 0; i < ball; i++) {
			input = sc.nextLine();
			inputSplit = input.split(" ");
			basketS = Integer.parseInt(inputSplit[0]);
			basketE = Integer.parseInt(inputSplit[1]);
			ballNum = Integer.parseInt(inputSplit[2]);		
			
			for (int j = basketS; j <= basketE; j++) {
				ballNumInBasket[j - 1] = ballNum;
			}
		}
		
		for (int i = 0; i < ballNumInBasket.length; i++) {
			System.out.print(ballNumInBasket[i] + " ");
		}
		
		sc.close();
	}

}
