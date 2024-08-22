package bronze._2;

import java.util.Scanner;

public class N10811 {

	public static void main(String[] args) {
		// 바구니 순서 역순으로 만들기
		
		Scanner sc = new Scanner(System.in);
		
		int basket, reverseBasket;
		int basketS, basketE; // (1 <= S <= E <= N)
		int[] basketOrder, basketReverseOrder;
		String input = "";
		String[] inputSplit;
		
		input = sc.nextLine();
		inputSplit = input.split(" ");
		basket = Integer.parseInt(inputSplit[0]);
		reverseBasket = Integer.parseInt(inputSplit[1]);
		
		if (!((1 <= basket && basket <= 100) && (1 <= reverseBasket && reverseBasket <= 100))) {
			System.exit(0);
		}
		
		basketOrder = new int[basket];
		basketReverseOrder = new int[basket];
		for (int i = 0; i < basket; i++) {
			basketOrder[i] = i + 1;
			basketReverseOrder[i] = i + 1;
		}
		
		for (int i = 0; i < reverseBasket; i++) {
			input = sc.nextLine();
			inputSplit = input.split(" ");
			basketS = Integer.parseInt(inputSplit[0]);
			basketE = Integer.parseInt(inputSplit[1]);
			
			int end = basketE - 1;
			for (int j = basketS; j <= basketE; j++) {
				basketReverseOrder[j - 1] = basketOrder[end--];
			}
			for (int k = 0; k < basketOrder.length; k++) {
				basketOrder[k] = basketReverseOrder[k];
			}
		}
		
		for (int i = 0; i < basketReverseOrder.length; i++) {
			System.out.print(basketReverseOrder[i] + " ");
		}
		
		sc.close();
	}

}
