package my.pkg.abstraction;

public abstract class Pet {
	// Variable
	private String type;
	private String model;
	private String color;
	private String name;
	
	// Constructor
	public Pet() {}
	
	public Pet(String model, String color)
	{
		this.model = model;
		this.color = color;
	}
	
	public Pet(String model, String color, String name)
	{
		this.model = model;
		this.color = color;
		this.name = name;
	}
	
	// Abstract Method
	public String displayAttribute() {
		return "종류 : " + getModel() + ", 색상: " + getColor() + ", 이름 : " + getName();
	}

	// Getter & Setter
	public String getType() { return type; }
	public void setType(String type) { this.type = type; }
	
	public String getModel() { return model; }
	public void setModel(String model) { this.model = model; }
	
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public void setAttribute(String model, String color, String name)
	{
		this.model = model;
		this.color = color;
		this.name = name;
	}
}
