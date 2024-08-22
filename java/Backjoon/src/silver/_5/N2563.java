package silver._5;

import java.util.Scanner;

public class N2563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 가로 100, 세로 100
			// 이 도화지 위에 가로*세로=10*10의 검정 색종이의 변과 도화지의 변이 평행하도록 붙임
			// 이러한 방식으로 색종이를 한 장 or 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램
		// ex) 흰색 도화지 위에 3장의 검은색 색종이를 주어진 그림과 같은 모양으로 붙였다면 검은색 영역의 넓이는 260
		
		int x, y;
		int blackSquareNum;
		int[][] blackSquare;
		String input = "";
		String[] inputSplit = new String[2];
		
		blackSquareNum = sc.nextInt(); sc.nextLine();
		blackSquare = new int[blackSquareNum][2];
		for (int i = 0; i < blackSquareNum; i++) {
			input = sc.nextLine();
			inputSplit = input.split(" ");
			
			for (int j = 0; j < blackSquare[0].length; j++) {
				blackSquare[i][j] = Integer.parseInt(inputSplit[j]);
			}
		}
		
		// for (int i = 0)
		
		sc.close();
	}

}
