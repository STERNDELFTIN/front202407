package ch04.practice;

import java.util.Scanner;

public class N07 {

	public static void function ()
	{
		String bar = "---------------------------------------";
		
		System.out.println(bar);
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println(bar);
	}
	public static void main(String[] args) {
		/* 7. while문과 Scanner의 nextLine() 메서드를 이용
		 * 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성 */
		
		Scanner sc = new Scanner(System.in);
		String selectNum = " ";
		int deposit, withdraw, moneySum = 0;
		
		while(!(selectNum.equals("4")))
		{
			function();
			System.out.print("선택> "); selectNum = sc.nextLine();
			switch(selectNum)
			{
				case "1":
					System.out.print("예금액>");
					deposit = Integer.parseInt(sc.nextLine());
					moneySum += deposit;
					break;
				case "2":
					System.out.print("출금액>");
					withdraw = Integer.parseInt(sc.nextLine());
					if (moneySum - withdraw < 0)
					{
						System.out.println("잔고에 돈이 부족합니다. 확인하시고 다시 입력해주세요.");
						System.out.println("잔여금: " + moneySum);
						break;
					}
					moneySum -= withdraw;
					break;
				case "3":
					System.out.print("잔고>" + moneySum);
					System.out.println();
					break;
				case "4":
					System.out.println("프로그램 종료");
					break;
				default:
					break;
			}
			System.out.println();
		}

		sc.close();
	}

}
