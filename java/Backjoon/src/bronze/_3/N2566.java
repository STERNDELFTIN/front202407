package bronze._3;

import java.util.Scanner;

public class N2566 {

	public static void main(String[] args) {
		// 9*9 격자판에 쓰여진 81개의 자연수 or 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램
		
		/* Input */
		// 한 줄에 9개씩 수 9줄 입력 (100보다 작은 자연수 or 0)
		
		/* Output */
		// 1. 최댓값 출력
		// 2. 최댓값이 위치한 행 번호 및 열 번호 출력 (빈칸을 두고 출력)
			// 최댓값이 2개 이상인 경우 그 중 한 곳의 위치를 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		int max = 0, row = 0, column = 0;
		String input = "";
		String[] inputSplit = new String[9];

		// 9*9 번호 입력
		for (int i = 0; i < 9; i++) {
			input = sc.nextLine();
			inputSplit = input.split(" ");
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(inputSplit[j]);
				// 조건 (100보다 작은 자연수 or 0)
				if (arr[i][j] > 100 || arr[i][j] < 0) System.exit(0);;
			}
		}
		
		// 최댓값 및 최댓값의 행,열 구하기
		for (int i  = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (max <= arr[i][j]) {
					max = arr[i][j]; // 최댓값
					row = i + 1; // 행
					column = j + 1; // 열
				}
			}
		}
		
		// 최댓값 및 최댓값의 행,열 출력
		System.out.println(max);
		System.out.println(row + " " + column);
		
		sc.close();
	}

}
