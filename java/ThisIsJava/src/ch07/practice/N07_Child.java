package ch07.practice;

public class N07_Child extends N07_Parent{
	public String name;
	
	public N07_Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public N07_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
