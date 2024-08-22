package my.pkg.inheritance;

import my.pkg.abstraction.Pet;
import my.pkg.interf.IEatable;
import my.pkg.interf.IFlyable;
import my.pkg.interf.ISound;
import my.pkg.interf.IWalkable;

public class Bird extends Pet implements IEatable, IFlyable, ISound, IWalkable{
	private String birdType = "새";
	
	public Bird() { super.setType(birdType); }
	
	public Bird(String model, String color)
	{
		super(model, color);
		super.setType(birdType);
	}
	
	public Bird(String model, String color, String name)
	{
		super(model, color, name);
		super.setType(birdType);
	}
	
	public String displayAttribute() {
		return  "[" + super.getType() + "] " + super.displayAttribute();
	}
	
	@Override
	public void sound() {
		System.out.println("짹짹");
	}

	@Override
	public void canWalk() {
		System.out.println("새는 대부분 이족보행을 할 수 있습니다.");
	}

	@Override
	public void canFly() {
		System.out.println("새는 대부분 날 수 있습니다.");
	}

	@Override
	public void canEat() {
		System.out.println("새는 견과류, 씨앗, 과일, 곤충 등을 먹습니다.");
	}
}
