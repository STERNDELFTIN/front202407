package bronze._2;

import java.util.Scanner;

public class N2745 {

	public static void main(String[] args) {
		// B진법 수 N을 10진법으로 바꿔 출력
			// 10진법을 넘어가는 경우 알파벳 대문자 사용 (A:10, B:11, ..., Z:35)
		
		/* Input */
		// N과 B 입력 (2 <= B <= 36)
			// B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같음
		
		/* Output */
		// B진법 수 N을 10진법으로 출력
		
		Scanner sc = new Scanner(System.in);
		
		int base, num;
		String input = "";
		String[] inputSplit = new String[2];
		
		input = sc.nextLine();
		inputSplit = input.split(" ");
		
		base = Integer.parseInt(inputSplit[0]);
		num = Integer.parseInt(inputSplit[1]);
		
		/* 36진수 -> 10진수
		 * 
		 * */
		
		sc.close();
	}

}
