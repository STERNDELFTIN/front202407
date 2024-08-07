package bronze._5;

import java.util.Scanner;

public class N25314 {

	public static void main(String[] args) {
		// long int - 4byte, long long int - 8byte
		// int 앞에 long을 붙일 때마다 4byte가 늘어난다고 생각했을 때
		
		/* Input */
		// N (4<=N<=1000; N은 4의 배수)
		Scanner sc = new Scanner(System.in);
		
		int byteSize = sc.nextInt();
		String word = "long ";
		String output = "";
		
		if (byteSize >= 4 && byteSize <= 1000 && byteSize%4==0) {
			/* Output */
			// N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름
			for (int i = 0; i < byteSize/4; i++) {
				output += word;
			}
			output += "int";
			
			System.out.println(output);
		}
		
		sc.close();
	}

}
