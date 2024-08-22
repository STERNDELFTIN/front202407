package ch05.practice;

public class N06 {

	public static void main(String[] args) {
		/* 6. 배열의 길이를 출력하는 코드 */
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		}; // 5, 3
		
		System.out.println(array.length); // 3
		System.out.println(array[1].length); // 3
		System.out.println(array[2].length); // 5
	}

}
