package bronze._1;

import java.util.Arrays;
import java.util.Scanner;

public class N10798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* Input */
		// 총 다섯 줄의 입력 (각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸없이 주어짐)
			// 영어 대문자 A~Z, 소문자 a~z, 숫자 0~9 중
			// 각 줄의 시작과 마지막에 빈칸 X
		
		/* Output */
		// 세로로 읽은 순서대로 글자 출력 - 공백 없이 연속해서 출력
		
		char[][] word = new char[5][15]; // 총 다섯 줄, 각 줄마다 최대 15개 글자
		String input = "";
		
		for (char[] row: word) {
			Arrays.fill(row, ' '); // 배열 공백으로 채우기
		}
		
		for (int i = 0; i < word.length; i++) {
			input = sc.nextLine();
			for (int j = 0; j < word[0].length; j++) {
				if (input.length() == j) break;
				word[i][j] = input.charAt(j);
			}
		}
		
		for (int j = 0; j < word[0].length; j++) {
			for(int i = 0; i < word.length; i++) {
				if (word[i][j] != ' ')
					System.out.print(word[i][j]);
			}
		}
		
		sc.close();
	}

}
