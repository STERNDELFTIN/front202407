package silver._5;

import java.util.Scanner;

public class N2941 {
	
	public static void main(String[] args) {
		/* Input */
		// 단어 (최대 100글자, 알파벳 소문자 및 '-', '='으로 구성)
			// 크로아티아 알파벳으로 구성
		
		/* Output */
		// 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
		
		Scanner sc = new Scanner(System.in);
		
		String words = "";
		int frequencyNum = 0;
		int croatianAlphabetNum = 0;
		
		words = sc.nextLine();
		if (words.length() > 100) System.exit(0);
		for (int i = 0; i < words.length(); i++) {
			if (!( (words.charAt(i) >= 'a' && words.charAt(i) <= 'z') || (words.charAt(i) == '-') || (words.charAt(i) == '=') ))
				System.exit(0);
		}
		
		if (words.contains("c=")) {
			frequencyNum = words.length() - words.replace(String.valueOf("c="), "").length();
			words = words.replace("c=", " ");
			croatianAlphabetNum += frequencyNum / 2;
		}
		if (words.contains("c-")) {
			frequencyNum = words.length() - words.replace(String.valueOf("c-"), "").length();
			words = words.replace("c-", " ");
			croatianAlphabetNum += frequencyNum / 2;
		}
		if (words.contains("dz=")) {
			frequencyNum = words.length() - words.replace(String.valueOf("dz="), "").length();
			words = words.replace("dz=", " ");
			croatianAlphabetNum += frequencyNum / 2;
		}
		if (words.contains("d-")) {
			frequencyNum = words.length() - words.replace(String.valueOf("d-"), "").length();
			words = words.replace("d-", " ");
			croatianAlphabetNum += frequencyNum / 2;
		}
		if (words.contains("lj")) {
			frequencyNum = words.length() - words.replace(String.valueOf("lj"), "").length();
			words = words.replace("lj", " ");
			croatianAlphabetNum += frequencyNum / 2;
		}
		if (words.contains("nj")) {
			frequencyNum = words.length() - words.replace(String.valueOf("nj"), "").length();
			words = words.replace("nj", " ");
			croatianAlphabetNum += frequencyNum / 2;
		}
		if (words.contains("s=")) {
			frequencyNum = words.length() - words.replace(String.valueOf("s="), "").length();
			words = words.replace("s=", " ");
			croatianAlphabetNum += frequencyNum / 2;
		}
		if (words.contains("z=")) {
			frequencyNum = words.length() - words.replace(String.valueOf("z="), "").length();
			words = words.replace("z=", " ");
			croatianAlphabetNum += frequencyNum / 2;
		}
		
		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) != ' ')
				croatianAlphabetNum++;
		}
		
		System.out.println(croatianAlphabetNum);
		
		sc.close();
	}

}
