package ch05.practice;

public class N08 {

	public static void main(String[] args) {
		/* 8. 주어진 배열 항목의 전체 합과 평균을 구해 출력 (중첩 for문 이용) */
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0, avg = 0;
		int arrLen = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			arrLen += array[i].length;
			// System.out.println(arrLen);
			for (int j = 0; j < array[i].length; j++)
			{
				// System.out.println(sum);
				sum += array[i][j];
			}

		}
		avg = sum / arrLen;
		
		System.out.println("합 = " + sum + ", 평균 = " + avg);
	}

}
