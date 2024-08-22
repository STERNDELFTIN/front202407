package ch06.practice;

public class N15 {
	
	public static void CheckResult(MemberService memberService, boolean result) {
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		MemberService memberService2 = new MemberService();
		
		boolean result = memberService.login("hong", "1234");
		boolean result2 = memberService.login("kim", "1234");
		
		CheckResult(memberService, result);
		CheckResult(memberService2, result2);
	}

}
