package my.pkg.inheritance;

import my.pkg.abstraction.Pet;
import my.pkg.interf.IEatable;
import my.pkg.interf.ISound;
import my.pkg.interf.IWalkable;

public class Dog extends Pet implements IEatable, IWalkable, ISound{
	private String dogType = "개";
	
	public Dog() { super.setType(dogType); }
	
	public Dog(String model, String color)
	{
		super(model, color);
		super.setType(dogType);
	}
	
	public Dog(String model, String color, String name)
	{
		super(model, color, name);
		super.setType(dogType);
	}
	
	public String displayAttribute() {
		return  "[" + super.getType() + "] " + super.displayAttribute();
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void canWalk() {
		System.out.println("개는 사족보행을 합니다.");
	}

	@Override
	public void canEat() {
		System.out.println("개는 고기, 채소, 과일 등을 먹을 수 있습니다");
	}
}
