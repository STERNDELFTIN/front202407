package ch06.practice;

public class Member {
	// Variable
	private String name; // 이름
	private String id; // 아이디
	private String password; // 패스워드
	private int age; // 나이
	
	// Constructor
	public Member() {}
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}

