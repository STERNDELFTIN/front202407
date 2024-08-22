package ch06.practice;

import java.util.Scanner;

public class BankApplication {
	
	// Variable
	private final static int ACCOUNT_LENGTH = 100;
	public static Account2[] account = new Account2[ACCOUNT_LENGTH];
	static int createdAccountNum = 0;
	
	// Constructor
	public BankApplication() {}

	// Method
	public static void Bar(String n) {
		if (n.equals("s")) {
			System.out.println("---------------");
		}
		else if (n.equals("l")) {
			System.out.println("------------------------------------------------------------");
		}
	}
	
	 public static boolean isInteger(String strValue) {
		 try {
			 Integer.parseInt(strValue);
		      return true;
		      } catch (NumberFormatException ex) {
		      return false;
		      }
	}
	 
	 public static String CheckAccountNum() {
		 Scanner sc = new Scanner(System.in);
		 
		 String inputAcc = "";
			boolean isDuplicated = false;
			
			while(isDuplicated == false) {
				System.out.print("계좌번호: ");
				inputAcc = sc.nextLine();
				
				for (int i = 0; i < createdAccountNum; i++) {
					if (account[i].getAccountNum().equals(inputAcc)) {
						isDuplicated = true;
						break;
					} 
				}
				if (isDuplicated == false) System.out.println("올바른 계좌번호가 아닙니다. 다시 입력해주세요.");
				else break;
			}
			
			return inputAcc;
	 }
	
	public static void AccessAccount() {
		Bar("l");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		Bar("l");
		
		System.out.print("선택> ");
	}
	
	public static void CreateAccount() {
		Scanner sc = new Scanner(System.in);
		
		String accNum = "";
		String name = "";
		String initialDepositMoney = "";
		
		Bar("s");
		System.out.println("계좌생성");
		Bar("s");
		
		while(true) {
			System.out.print("계좌번호: ");
			accNum = sc.nextLine();
			
			boolean isDuplicate = false;
			for (int i = 0; i < createdAccountNum; i++) {
				if (account[i].getAccountNum().equals(accNum)) {
					System.out.println("중복된 계좌번호입니다. 다시 입력해주세요.");
					isDuplicate = true;
					break;
				}
			}
			
			if (!isDuplicate) break;  // 중복이 아닌 경우 루프 탈출
		}
		
		System.out.print("계좌주: ");
		name = sc.nextLine();
		
		
		while(true) {
			System.out.print("초기입금액: ");
			initialDepositMoney = sc.nextLine();
			
			if(isInteger(initialDepositMoney) == false || Integer.parseInt(initialDepositMoney) < 0) {
				System.out.println("올바른 금액을 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 계좌 생성 및 배열에 추가
		account[createdAccountNum] = new Account2(accNum, name, Integer.parseInt(initialDepositMoney));
		
		System.out.println("\n결과: 계좌가 생성되었습니다.");
		System.out.println("계좌번호: " + account[createdAccountNum].getAccountNum());
		System.out.println("이름: " + account[createdAccountNum].getName());
		System.out.println("잔액: " + account[createdAccountNum].getCurrentMoney());
		createdAccountNum++;

	}
	
	public static void CheckAccountList() {
		Bar("s");
		System.out.println("계좌목록");
		Bar("s");
		
		for (int i = 0; i < createdAccountNum; i++) {
			System.out.println(account[i].getAccountNum() + "     " + account[i].getName() + "     " + account[i].getCurrentMoney());
		}
	}
	
	public static void DepositAccount() {
		Scanner sc = new Scanner(System.in);
		
		Bar("s");
		System.out.println("예금");
		Bar("s");
		
		String inputAccount = CheckAccountNum();
		
		String depositMoney = "";
		for (int i = 0; i < createdAccountNum; i++) {
			if (account[i].getAccountNum().equals(inputAccount)) {
				System.out.print("예금액: ");
				while(true) {
					depositMoney = sc.nextLine();
					if (isInteger(depositMoney) == false || Integer.parseInt(depositMoney) < 0) {
						System.out.println("올바른 숫자를 입력하세요.");
					} else {
						break;
					}
				}
				account[i].setCurrentMoney(account[i].getCurrentMoney() + Integer.parseInt(depositMoney));
				
				System.out.println("현재 잔액: " + account[i].getCurrentMoney());
				
				break;
			}
		}
		
	}
	
	public static void WithdrawAccount() {
		Scanner sc = new Scanner(System.in);
		
		Bar("s");
		System.out.println("출금");
		Bar("s");
		
		String inputAccount = CheckAccountNum();
		
		String withdrawMoney = "";
		for (int i = 0; i < createdAccountNum; i++) {
			if (account[i].getAccountNum().equals(inputAccount)) {
				while(true) {
					System.out.print("출금액: ");
					withdrawMoney = sc.nextLine();
					
					if (isInteger(withdrawMoney) == false || Integer.parseInt(withdrawMoney) < 0) {
						System.out.println("올바른 숫자를 입력하세요.");
					} else if (Integer.parseInt(withdrawMoney) > account[i].getCurrentMoney()) {
						System.out.println("잔고에 금액이 부족합니다. (잔액: " + account[i].getCurrentMoney()  +"원)");
					} else {
						break;
					}
				}
				account[i].setCurrentMoney(account[i].getCurrentMoney() - Integer.parseInt(withdrawMoney));
				
				System.out.println("결과: 출금이 성공되었습니다.");
				System.out.println("현재 잔액: " + account[i].getCurrentMoney());
				
				break;
			}
		}
		
		
	}
	
	public static void ExitAccount() {
		System.out.println("프로그램 종료");
	}
	
	// Getter & Setter
//	public Account2[] getAccount2() { return account; }
//	public void setAccount2(Account2[] account) { this.account = account; }
}
