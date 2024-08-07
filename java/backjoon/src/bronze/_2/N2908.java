package bronze._2;

import java.util.Scanner;

public class N2908 {

	public static void main(String[] args) {
		/* Input */
		// 두 수 2개 (같지 않은 세 자리 수, 0 포함되지 않음)
		
		/* Output */
		// 두 수를 뒤집었을 때 큰 수 출력
			// ex) 734, 893 -> 437 > 398
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		String reverseStr;
		String input = "";
		String[] inputSplit = new String[2];
		
		input = sc.nextLine();
		StringBuffer sb = new StringBuffer(input);
		reverseStr = sb.reverse().toString();
		
		inputSplit = reverseStr.split(" ");
		n1 = Integer.parseInt(inputSplit[0]);
		n2 = Integer.parseInt(inputSplit[1]);

		if (n1 > n2)
			System.out.println(n1);
		else
			System.out.println(n2);
		
		sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		
//		int n1, n2;
//		String reverseStr= "";
//		String input = "";
//		String[] inputSplit = new String[2];
//		
//		input = sc.nextLine();
//		inputSplit = input.split(" ");
//
//		for (int i =  inputSplit[0].length() - 1; i >= 0; i--) {
//			reverseStr += inputSplit[0].charAt(i);
//		}
//		n1 = Integer.parseInt(reverseStr);
//		
//		reverseStr = "";
//		for (int i =  inputSplit[1].length() - 1; i >= 0; i--) {
//			reverseStr += inputSplit[1].charAt(i);
//		}
//		n2 = Integer.parseInt(reverseStr);
//	
//		if (n1 > n2)
//			System.out.println(n1);
//		else
//			System.out.println(n2);
//		
//		sc.close();
	}

}
