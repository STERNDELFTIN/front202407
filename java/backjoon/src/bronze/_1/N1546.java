package bronze._1;

import java.util.Scanner;

public class N1546 {

	public static void main(String[] args) {
		// 조작한 점수 = 점수 / 점수 중 최댓값 * 100
		// 조작한 점수의 평균 구하기
		
		/* Input */
		// 1. 시험 본 과목 개수 (1000보다 작거나 같음)
		// 2. 현재 성적 (100보다 작거나 같은 음이 아닌 정수, 적어도 하나의 값은 0보다 큼)
		
		/* Output */
		// 조작한 점수의 평균 출력
			// 실제 정답과 출력값의 절대오차 or 상대오차가 10^(-1) 이하
		
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		int subject;
		double[] currentScore, fabricatedScore;
		double maxScore = 0;
		double fabricatedSum = 0, fabricatedAvg;
		String input = "";
		String[] inputSplit;
		int zeroScore = 0;
		
		// 과목 개수
		subject = sc.nextInt(); sc.nextLine();
		if (subject > 1000) System.exit(0);
		
		// 점수 배열의 개수를 과목 개수로 설정
		currentScore = new double[subject];
		fabricatedScore = new double[subject];
		
		// 현재 점수 입력 및 최고 점수 구하기
		input = sc.nextLine();
		inputSplit = input.split(" ");
		
		for (int i = 0; i < subject; i++) {
			currentScore[i] = Integer.parseInt(inputSplit[i]);
			if (currentScore[i] > 100 || currentScore[i] < 0) System.exit(0);
			maxScore = currentScore[i] >= maxScore ? currentScore[i] : maxScore;
		}
		for (int i = 0; i < currentScore.length; i++) {
			if (currentScore[i] == 0) zeroScore++;
		}
		if (zeroScore == subject) System.exit(0);
		
		// 조작된 점수 및 조작된 점수의 합계 구하기
		for(int i = 0; i < subject; i++) {
			fabricatedScore[i] = currentScore[i] / maxScore * 100;
			fabricatedSum += fabricatedScore[i];
		}
		
		// 조작된 점수의 평균 구하기
		fabricatedAvg = fabricatedSum / subject;
		System.out.println(fabricatedAvg);
		
		sc.close();
	}

}
