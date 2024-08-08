package bronze._3;

import java.util.Scanner;

public class N10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 알파벳 소문자 단어
		// 팰린드롬 ex) level, noon
		
		/* Input */
		// 단어 - 길이: 100 >= words >= 1, 소문자로만 구성
		
		/* Output */
		// 팰린드롬이면 1, 아니면 0
		
		String words = sc.nextLine();
		int same = 0;
		
		for (int i = 0; i < words.length() / 2; i++) {
			if ( words.charAt(i) == (words.charAt(words.length() - i - 1)) ) {
				same++;
			}
		}
		if (same == words.length()/2)
			System.out.println("1");
		else
			System.out.println("0");
		
		sc.close();
	}

}
