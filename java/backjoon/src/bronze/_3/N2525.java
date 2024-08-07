package bronze._3;

import java.util.Scanner;

public class N2525 {

	public static void main(String[] args) {
		// 훈제오리구이를 시작하는 시각, 오븐구이를 하는 데 필요한 시간 -> 분단위로 주어짐
		// 오븐구이가 끝나는 시각을 계산하는 프로그램
		
		/* Input */
		// 1. 현재 시각 (0 <= A <= 23), 분 (0 <= B <= 59) -> 빈칸을 사이에 두고 순서대로 입력
		// 2. 요리하는 데 필요한 시간 (0 <= C <= 1000) -> 분 단위
		Scanner sc = new Scanner(System.in);
		
		String strCurrentTime = "";
		String[] strCurrentTimeSplit = new String[2];
		int currentHour, currentMinute;
		int cookingTime;
		
		strCurrentTime = sc.nextLine();
		strCurrentTimeSplit = strCurrentTime.split(" ");
		currentHour = Integer.parseInt(strCurrentTimeSplit[0]);
		if (currentHour < 0 || currentHour > 23) System.exit(0);
		currentMinute = Integer.parseInt(strCurrentTimeSplit[1]);
		if (currentMinute < 0 || currentMinute > 59) System.exit(0);
		
		cookingTime = sc.nextInt();
		if (cookingTime < 0 || cookingTime > 1000) System.exit(0);
		
		/* Output */
		// 종료되는 시각의 시와 분이 공백을 두고 출력
		// (단, 시: 0~23 정수, 분: 0~59 정수)
		currentMinute += cookingTime;
		if (currentMinute >= 60) {
			currentHour += currentMinute / 60;
			currentMinute %= 60;
		}
		if (currentHour >= 24) {
			currentHour %= 24;
		}	
		System.out.println(currentHour + " " + currentMinute);
		
		sc.close();
	}

}
