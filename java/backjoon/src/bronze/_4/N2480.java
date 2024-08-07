package bronze._4;

import java.util.Scanner;

public class N2480 {

	public static void main(String[] args) {
		// 주사위 3개 1~6
		// 같은 눈 3개 = 10000 * 같은 눈 * 1000원
		// 같은 눈 2개만 = 1000 + 같은 눈 * 100원
		// 모두 다른 눈 = 가장 큰 눈 * 100원
		
		/* Input */
		// 3개의 눈 -> 빈칸을 두고 각각 주어짐
		Scanner sc = new Scanner(System.in);
		
		int dice1, dice2, dice3;
		String diceStr;
		String[] diceStrSplit;
		int price = 0;
		
		diceStr = sc.nextLine();
		diceStrSplit = diceStr.split(" ");
		dice1 = Integer.parseInt(diceStrSplit[0]);
		dice2 = Integer.parseInt(diceStrSplit[1]);
		dice3 = Integer.parseInt(diceStrSplit[2]);
		
		/* Output */
		// 상금 출력
		if (dice1 == dice2 && dice1 == dice3) {
			price = 10000 + dice1 * 1000;
		}
		if (dice1 != dice2 && dice1 == dice3) {
			price = 1000 + dice1 * 100;
		}
		if (dice1 == dice2 && dice1 != dice3 ) {
			price = 1000 + dice1 * 100;
		}
		if (dice1 != dice2 && dice2 == dice3 ) {
			price = 1000 + dice2 * 100;
		}
		if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
			price = (dice1 >= dice2 ? dice1 >= dice3 ? dice1: dice3 : dice2 >= dice3 ? dice2 : dice3) * 100;
		}
			
		System.out.println(price);
		
		sc.close();
	}

}
