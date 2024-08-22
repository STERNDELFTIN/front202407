package ch06.practice;

public class MemberService {
	
	// Variable
	private String id;
	private String password;
	
	// Constructor
	public MemberService() {}
	public MemberService(String id, String password) {
		this.id = id;
		this.password = password;
	}

	// Method
	public boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("1234"))
			return true;
		else
			return false;
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
	// Getter & Setter
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	
	public String getPassword() { return password; }
	public void setPasswrod(String password) { this.password = password; }
}
