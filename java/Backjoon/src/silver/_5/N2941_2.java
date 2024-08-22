	package silver._5;
	
	import java.util.Scanner;
	
	public class N2941_2 {
		
		public static int AlphabetFrequency(String words, String alphabet) {
			// 중복 알파벳 개수
			return (words.length() - words.replace(String.valueOf(alphabet), "").length()) / 2;
		}
		
		public static void main(String[] args) {
			/* Input */
			// 단어 (최대 100글자, 알파벳 소문자 및 '-', '='으로 구성)
				// 크로아티아 알파벳으로 구성
			
			/* Output */
			// 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
			
			Scanner sc = new Scanner(System.in);
			
			String words = "";
			String[] croatianAlphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
			int croatianAlphabetNum = 0;
			
			words = sc.nextLine();
			// 조건 검사 (최대 100글자, 알파벳 소문자 및 '-', '='으로 구성)
			if (words.length() > 100) System.exit(0);
			for (int i = 0; i < words.length(); i++) {
				if (!( (words.charAt(i) >= 'a' && words.charAt(i) <= 'z') || (words.charAt(i) == '-') || (words.charAt(i) == '=') ))
					System.exit(0);
			}
			
			// 주어진 단어에서 크로아티아 알파벳이 있는지 확인 및 주어진 단어에서 해당 알파벳 제거
			for (int i = 0; i < croatianAlphabet.length; i++) {
				if (words.contains(croatianAlphabet[i])) {
					croatianAlphabetNum += AlphabetFrequency(words, croatianAlphabet[i]); // 크로아티아 알파벳 중복 개수
					words = words.replace(croatianAlphabet[i], " ");
				}
			}
			
			// 목록에 없는 알파벳의 개수는 한 글자로 세므로 따로 계산
			for (int i = 0; i < words.length(); i++) {
				if (words.charAt(i) != ' ')
					croatianAlphabetNum++;
			}
			
			// 크로아티아 알파벳 구성 개수 출력
			System.out.println(croatianAlphabetNum);
			
			sc.close();
		}
	
	}
