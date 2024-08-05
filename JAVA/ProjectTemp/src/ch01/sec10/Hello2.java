package ch01.sec10;

public class Hello2 {

	public static int sum(int x, int y) {
		return x + y;
	}
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		
		int num = 0;
		System.out.println(num);

		// 변수 선언과 값 할당 따로
		int x1;
		x1 = 1;
		// 변수 선언과 값 할당 동시에
		int x2 = 3;
		
		int result = x1 + x2;
		System.out.println(result);
		// 함수 선언
		int result2 = sum(x1, x2);
		System.out.println(result2);
	}

}
