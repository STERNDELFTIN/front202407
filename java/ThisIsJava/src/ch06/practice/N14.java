package ch06.practice;

public class N14 {

	public static void main(String[] args) {
		/* 13. 현실 세계의 회원을 Member 클래스로 모델링
		 * 회원의 데이터로는 이름, 아이디, 패스워드, 나이
		 * 이 데이터들을 가지는 Member 클래스 선언 */
		
		Member member1 = new Member("홍길동", "hong");
		
		System.out.println("회원1의 이름: " + member1.getName() + "\n회원1의 아이디: " + member1.getId());
	}

}