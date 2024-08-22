package my.pkg.inheritance;

import my.pkg.abstraction.Pet;
import my.pkg.interf.IEatable;
import my.pkg.interf.ISound;
import my.pkg.interf.IWalkable;

public class Cat extends Pet implements IEatable, ISound, IWalkable{
	private String catType = "고양이";
	
	public Cat() { super.setType(catType); }
	
	public Cat(String model, String color)
	{
		super(model, color);
		super.setType(catType);
	}
	
	public Cat(String model, String color, String name)
	{
		super(model, color, name);
		super.setType(catType);
	}
	
	public String displayAttribute() {
		return  "[" + super.getType() + "] " + super.displayAttribute();
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}

	@Override
	public void canWalk() {
		System.out.println("고양이는 사족보행을 합니다.");
	}

	@Override
	public void canEat() {
		System.out.println("고양이는 고기, 채소, 과일 등을 먹을 수 있습니다.");
	}
}
