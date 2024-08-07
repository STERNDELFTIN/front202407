package bronze._2;

import java.util.Scanner;

public class N10813 {

	public static void main(String[] args) {
		// 바구니 2개를 선택하고 두 바구니에 있는 공 교환
		
		/* Input */
		// 1. 바구니 N개, 바꿀 M번 공 (1 <= N, M <= 100)
			// 공은 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 있음
		// 2. M개의 줄에 걸쳐서 공을 교환할 방법이 주어짐
			// 각 방법은 두 정수 i, j로 구성. i번 바구니와 j번 바구니에 들어있는 공 교환
			// 1 <= i <= j <= N
			// 입력으로 주어진 순서대로 공 교환

		Scanner sc = new Scanner(System.in);
		
		int basket, ball;
		int basketA, basketB;
		String input;
		String[] inputSplit;
		int[] ballInBasket;
		
		input = sc.nextLine();
		inputSplit = input.split(" ");
		basket = Integer.parseInt(inputSplit[0]);
		ball = Integer.parseInt(inputSplit[1]);
		
		if (1 > basket || ball > 100) {
			System.exit(0);;
		}
		
		ballInBasket = new int[basket];
		for (int i = 0; i < ballInBasket.length; i++) {
			ballInBasket[i] = i + 1;
		}
		
		for (int i = 0; i < ball; i++) {
			input = sc.nextLine();
			inputSplit = input.split(" ");
			basketA = Integer.parseInt(inputSplit[0]);
			basketB = Integer.parseInt(inputSplit[1]);
			
			if (!(1 <= basketA && basketA <= basketB && basketB <= basket)) {
				System.exit(0);
			}
			
			int temp = ballInBasket[basketA - 1];
			ballInBasket[basketA - 1] = ballInBasket[basketB - 1];
			ballInBasket[basketB - 1] = temp;
		}
		
		for (int i = 0; i < ballInBasket.length; i++) {
			System.out.print(ballInBasket[i] + " ");
		}
		
		sc.close();
	}

}
