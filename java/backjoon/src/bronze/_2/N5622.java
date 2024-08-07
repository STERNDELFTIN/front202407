package bronze._2;

import java.util.Scanner;

public class N5622 {

	public static int DialNum(char c) {
		switch(c) {
		case 'A','B','C':
			return 2;
		case 'D','E','F':
			return 3;
		case 'G','H','I':
			return 4;
		case 'J','K','L':
			return 5;
		case 'M','N','O':
			return 6;
		case 'P','Q','R','S':
			return 7;
		case 'T','U','V':
			return 8;
		case 'W','X','Y','Z':
			return 9;
		default:
			return 1;
		}
	}
	public static void main(String[] args) {
		// 다이얼 한 칸 당 1초 (단, 숫자 1은 총 2초가 필요)
		// 1 : 
		// 2 : ABC 
		// 3 : DEF
		// 4 : GHI
		// 5 : JKL
		// 6 : MNO
		// 7 : PQRS
		// 8 : TUV
		// 9 : WXYZ
		
		/* Input */
		// 알파벳 대문자로 이루어진 단어 (words.length() >= 2 && <= 15)
		
		/* Output */
		// 다이얼을 걸기 위해 필요한 최소 시간
		
		Scanner sc = new Scanner(System.in);
		
		String words = "";
		int wordsLen;
		int time = 0;
		
		words = sc.nextLine();
		wordsLen = words.length();
		if (wordsLen < 2 || wordsLen> 15) System.exit(0);
		
		for (int i = 0; i < wordsLen; i++) {
			time += DialNum(words.charAt(i)) + 1;
		}
		
		System.out.println(time);
		
		sc.close();
	}

}
