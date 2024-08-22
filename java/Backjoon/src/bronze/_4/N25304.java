package bronze._4;

import java.util.Scanner;

public class N25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* Input */
		// 1. 영수증에 적힌 금액
		// 2. 영수증에 적힌 물건 종류의 수 N
		// 3. N개의 줄에 각 물건의 가격 a와 개수 b 입력 -> 공백 기준
		int receiptSumPrice, receiptNum;
		int buyPrice, buyNum;
		int sumPrice = 0;
		String buyThingsStr = "";
		String[] buyThingsStrSplit = new String[2];
		
		receiptSumPrice = sc.nextInt();
		receiptNum = sc.nextInt();
		sc.nextLine(); // nextInt(), next() 등은 엔터키를 눌렀을 때 입력되는 줄바꿈 문자를 읽지 못 하므로, 줄바꿈 문자를 읽어줄 수 있는 nextLine()을 사용하여 줄바꿈 문자를 소비해줌
		
		for (int i = 0; i < receiptNum; i++) {
			buyThingsStr = sc.nextLine();
			buyThingsStrSplit = buyThingsStr.split(" ");
			
			buyPrice = Integer.parseInt(buyThingsStrSplit[0]);
			buyNum = Integer.parseInt(buyThingsStrSplit[1]);
			
			sumPrice += buyPrice * buyNum;
		}
		
		/* Output */
		// 구매한 물건 가격 = 영수증 적힌 가격 -> Yes
		// 구매한 물건 가격 != 영수증 적힌 가격 -> No
		if (receiptSumPrice == sumPrice)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		sc.close();
	}

}
