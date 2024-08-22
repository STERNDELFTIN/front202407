package ch07.practice;

public class N07_Parent {
	public String nation;
	
	public N07_Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public N07_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
