package my.pkg;

public class Puppy {
	/* 변수 Field */
	String name;
	String type;
	String color;
	
	/* 생성자 Constructor */
	public Puppy() {}
	
	public Puppy(String type, String color) {
		this.type = type;
		this.color = color;
	}
	
	public Puppy(String name, String type, String color) {
		this.name = name;
		this.type = type;
		this.color = color;
	}
}
