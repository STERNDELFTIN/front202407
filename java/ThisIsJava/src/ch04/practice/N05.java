package ch04.practice;

public class N05 {

	public static void main(String[] args) {
		/* 5. 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력
		 * (단, x와 y는 10 이하의 자연수) */
		
		int n1 = 4, n2 = 5, n3 = 60;
		
		for (int x = 1; x <= 10; x++)
		{
			for (int y = 1; y <= 10; y++)
			{
				if (n1 * x + n2 * y == 60)
					System.out.println("(" + x + ", " + y + ")");
			}
		}
	}

}
