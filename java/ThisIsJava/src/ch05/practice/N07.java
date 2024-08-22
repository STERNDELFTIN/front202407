package ch05.practice;

public class N07 {

	public static void main(String[] args) {
		/* 7. 주어진 배열 항목에서 최댓값을 출력하는 코드 (for문 이용) */
		int[] array = {1, 5, 3, 8, 2};
		int max = 0;
		
		for (int  i = 0; i < array.length; i++)
		{
			max = max < array[i] ? array[i] : max;
		}
		System.out.println(max);
	}

}
