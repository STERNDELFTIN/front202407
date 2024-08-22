package ch04.practice;

public class N03 {

	public static void main(String[] args) {
		// 3. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 출력하는 코드
		int start = 1, end = 100;
		int multiple = 3;
		int sum = 0;
		
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0) {
				sum += i; 
			}
		}
		System.out.println("1부터 100까지의 3의 배수의 총합은 " + sum);
	}

}
