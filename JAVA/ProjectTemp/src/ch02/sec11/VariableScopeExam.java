package ch02.sec11;

public class VariableScopeExam {

	public static void main(String[] args) {
//		int v1 = 15;
//		
//		if (v1 > 10) {
//			int v2 = v1 - 10;
//			System.out.println("v2: " + v2);
//		}
//		
//		int v3 = v1 + v2 + 5;
//		System.out.println("v3: " + v3);
		
		int v1 = 15;
		int v2;
		int v3;
		
		if (v1 > 10) {
			v2 = v1 - 10;
			System.out.println("v2: " + v2);
			v3 = v1 + v2 + 5;
			System.out.println("v3: " + v3);
		}
	}

}
