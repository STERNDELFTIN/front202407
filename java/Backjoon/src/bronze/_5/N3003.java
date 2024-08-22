package bronze._5;

import java.util.Scanner;

public class N3003 {

	public static void main(String[] args) {
		// 체스의 총 개수: 16개
			// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
		
		/* Input */
		// 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수 (value >= 0 && value <= 10)
		
		/* Output */
		// 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력
			// 양수라면 그 개수만큼 더하고, 음수라면 제거
		
		Scanner sc = new Scanner(System.in);
		
		int[] chess = { 1, 1, 2, 2, 2, 8 };
		int[] findChess = new int[6];
		int[] needChess = new int[6];
		String input = "";
		String[] inputSplit;
		
		input = sc.nextLine();
		inputSplit = input.split(" ");
		
		for (int i = 0; i < chess.length; i++) {
			findChess[i] = Integer.parseInt(inputSplit[i]);
			
			needChess[i] = chess[i] - findChess[i];
			System.out.print(needChess[i]  + " ");
		}
		
		sc.close();
	}

}
