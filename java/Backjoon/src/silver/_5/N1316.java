package silver._5;

import java.util.Scanner;

public class N1316 {

	public static void main(String[] args) {
		
		// 그룹 단어란, 단어에 존재하는 모든 문자에 대해, 각 문자가 연속해서 나타나는 경우
			// ex1) ccazzzzbb - c, a, z, b 연속하므로 그룹 단어
			// ex2) kin - k, i, n 연속하므로 그룹 단어
			// ex3) aabbbccb - b 연속하지 않으므로 그룹 단어X
		
		/* Input */
		// 1. 단어의 개수 N (N <= 100; 자연수)
		// 2. N개의 줄에 단어 입력 (알파벳 소문자로만, 중복X, 길이 최대 100)
		
		/* Output */
		// 그룹 단어의 개수 출력
		
		Scanner sc = new Scanner(System.in);
		
		String words = "";
		int wordsNum = 0;
		int groupWords = 0;
		char[] checkGroupAlp = new char[100];
		int checkAlp = 0;
		boolean  GroupAlpTrue = true;
		
		// 단어의 개수 입력
		wordsNum = sc.nextInt(); sc.nextLine();
		// 조건 (100보다 작거나 같은 자연수)
		if (wordsNum > 100 || wordsNum <= 0) System.exit(0);
		
		for (int i = 0; i < wordsNum; i++) {
			// 단어 입력
			words = sc.nextLine();
			// 조건 (단어의 길이 최대 100)
			if (words.length() > 100) System.exit(0);
			
			checkAlp = 0;
			GroupAlpTrue = true;
			checkGroupAlp[checkAlp] = words.charAt(checkAlp);
			for (int j = 1; j < words.length(); j++) {
				if (checkGroupAlp[checkAlp] != words.charAt(j)) {
					if (checkAlp >= 1) {
						for (int k = 0; k <= checkAlp - 1; k++) {
							if (checkGroupAlp[k] == words.charAt(j))
								GroupAlpTrue = false;
						}
						if (GroupAlpTrue == false) {
							break;
						}
						checkGroupAlp[++checkAlp] = words.charAt(j);
					}
					else {
						checkGroupAlp[++checkAlp] = words.charAt(j);
					}
				}
			}
			if (GroupAlpTrue == true) {
				groupWords++;
			}
		}
		
		// 그룹 단어의 개수 출력
		System.out.println(groupWords);
			
		sc.close();
	}

}
