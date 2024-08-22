package ch04.practice;

public class N04 {

	public static void main(String[] args) {
		/* 4. while문과 Math.random() 메서드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
		 * 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈춤
		 * ex) (1, 4), (4, 1), (2, 3), (3, 2) */
		int diceNum1, diceNum2;
		int sum = 0;
		
		while(sum != 5)
		{
			diceNum1 = (int) (Math.random() * 6) + 1;
			diceNum2 = (int) (Math.random() * 6) + 1;
			sum = diceNum1 + diceNum2;
			
			System.out.println("첫 번째 주사위 번호 = " + diceNum1 + "\n두 번째 주사위 번호 = " + diceNum2 + "\n두 눈의 합계 = " + sum + "\n");
		}
	}

}
