package bronze._3;

import java.util.Scanner;

public class N30802 {

	public static void main(String[] args) {
		// 티셔츠 S, M, L, XL, XXL, XXXL 6가지 사이즈 존재
		// 같은 사이즈의 T장 묶음으로만 주문 가능
		// 펜은 한 종류. P자루씩 묶음으로 주문하거나 한 자루씩 주문 가능
		// 티셔츠는 남아도 되지만 부족해서는 안 되고 신청한 사이즈대로 나눠주어야 함
		// 펜은 참가자 수만큼 딱 맞게 준비해야 함
		// 티셔츠를 T장씩 최소 몇 묶음 주문해야 하는지, 그리고 펜을 P자루씩 최대 몇 묶음 주문할 수 있고, 그 때 펜을 한 자루씩 몇 개 주문하는지 구하기
		
		/* 입력 */
		// 1. 참가자의 수 N (1 <= N <= 10^9)
		// 2. 티셔츠 사이즈별 신청자의 수 S, M, L, XL, XXL, XXXL이 공백으로 구분되어 주어짐
			// 0 <= (각각의 신청자 수) <= N
		// 3. 정수 티셔츠와 펜의 묶음 수를 의미하는 정수 T와 P가 공백으로 구분되어 주어짐
			// 2 <= T, P <= 10^9
		Scanner sc = new Scanner(System.in);
		
		int N, T, P;
		int[] orderTSize = new int[6];
		String orderTSizeStr, TnP;
		String[] orderTSizeSplit, TnPSplit;
		
		N = sc.nextInt();
		if (!(1 <= N && N <= Math.pow(10, 9))) System.exit(0);
		
		orderTSizeStr = sc.next();
		orderTSizeSplit = orderTSizeStr.split(" ");
		int sum = 0;
		for (int i = 0; i < orderTSizeSplit.length; i++) {
			int num = Integer.parseInt(orderTSizeSplit[i]);
			if (!(0 <= num && num <= N)) System.exit(0);
			sum += Integer.parseInt(orderTSizeSplit[i]);
			
			orderTSize[i] = Integer.parseInt(orderTSizeSplit[i]);
		}
		if (sum != N) System.exit(0);;
		
		TnP = sc.next();
		TnPSplit = TnP.split(" ");
		T = Integer.parseInt(TnPSplit[0]);
		P = Integer.parseInt(TnPSplit[1]);
		for (int i = 0; i < TnPSplit.length; i++) {
			if (!(2 <= T && P <= Math.pow(10, 9))) System.exit(0);
		}
		
		/* 출력 */
		// 1. 티셔츠를 T장씩 최소 몇 묶음 주문?
		// 2. 펜을 P자루씩 최대 몇 묶음 주문할 수 있는지와 그 때 펜을 한 자루씩 몇 개 주문하는지
		
	}

}
