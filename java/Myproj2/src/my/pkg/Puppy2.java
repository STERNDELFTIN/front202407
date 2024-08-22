package my.pkg;

public class Puppy2 {
	private String name;
	String model;
	String color;
	
	public Puppy2() {}
	
	public Puppy2(String model) {
		this.model = model;
	}
	
	public Puppy2(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// Getter
	public String getName()
	{
		return name;
	}
	// Setter
	public void setName(String name)
	{
		this.name = name;
	}
}
