package ch06.practice;

import java.util.Scanner;

public class N20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			BankApplication.AccessAccount();
			int selection = Integer.parseInt(sc.nextLine());
			
			switch(selection) {
				case 1:
					BankApplication.CreateAccount();
					break;
				case 2:
					BankApplication.CheckAccountList();
					break;
				case 3:
					BankApplication.DepositAccount();
					break;
				case 4:
					BankApplication.WithdrawAccount();
					break;
				case 5:
					BankApplication.ExitAccount();
					break;
			}
			if (selection == 5) break; // 종료에 해당하는 번호 선택 시에 while문 빠져나감
			
		}
	}

}
