package ch05.practice;

import java.util.Scanner;

public class N09 {

	public static void StudentInfo()
	{
		String bar = "------------------------------------------------------------------";
		
		System.out.println(bar);
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println(bar);
	}
	public static void main(String[] args) {
		/* 학생들의 점수를 분석하는 프로그램
		 * 키보드로부터 학생 수와 각 학생들의 점수를 입력 받음
		 * 그리고 while 문과 Scanner의 nextLine() 메서드를 이용해서 최고 점수 및 평균 점수를 출력 */
		
		Scanner sc = new Scanner(System.in);
		
		// Variable
		int[][] student = null;
		String selection = ""; // 선택 번호
		int maxScore = 0, sumScore = 0; // 최고점수, 점수 총 합계
		double avgScore = 0.0f; // 평균 점수
		int studentNum = 0; // 학생 수
		int arrLen = 0;
		
		while(true)
		{
			StudentInfo();
			
			System.out.print("선택> ");
			selection = sc.nextLine();
			switch(selection)
			{
				case "1":
					System.out.print("학생 수> ");
					studentNum = Integer.parseInt(sc.nextLine());
					student = new int[1][studentNum];
					break;
				case "2":
					arrLen = 0;
					if (studentNum == 0) {
						System.out.println("학생 수를 입력한 이후에 접근해주세요.");
					}
					else {
						for (int i = 0; i < student.length; i++) {
							arrLen += student[i].length;
							for (int j = 0; j < student[i].length; j++) {
								System.out.print("scores[" + j + "]> ");
								student[i][j] = Integer.parseInt(sc.nextLine());
								
								sumScore += student[i][j];
								maxScore = maxScore < student[i][j] ? student[i][j] : maxScore;
							}
						}
						avgScore = sumScore / arrLen;
					}
					break;
				case "3":
					if (studentNum == 0) {
						System.out.println("학생 수를 입력한 이후에 접근해주세요.");
					} else {
						for (int i = 0; i < student.length; i++) {
							for (int j = 0; j < student[i].length; j++) {
								System.out.println("scores[" + j + "]: " + student[i][j]);
							}
						}
					}
					break;
				case "4":
					if (studentNum == 0) {
						System.out.println("학생 수를 입력한 이후에 접근해주세요.");
					} else {
						System.out.println("최고 점수: " + maxScore);
						System.out.println("평균 점수: " + avgScore);
					}
					break;
				case "5":
					System.out.println("프로그램 종료");
					break;
			}
			
			if (selection.equals("5")) break;
		}
		
		sc.close();
	}

}
