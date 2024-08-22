package ch04.practice;

public class N06 {

	public static void main(String[] args) {
		// 6. for문을 이용해서 다음과 같은 실행 결과 출력
		// *
		// **
		// ***
		// ****
		// *****
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = i; j >= 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
