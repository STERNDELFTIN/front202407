package my.pkg.inheritance;

import my.pkg.abstraction.Pet;
import my.pkg.interf.IEatable;
import my.pkg.interf.ISound;

public class Snake extends Pet implements IEatable, ISound{
	private String snakeType = "뱀";
	
	public Snake() { super.setType(snakeType); }
	
	public Snake(String model, String color)
	{
		super(model, color);
		super.setType(snakeType);
	}
	
	public Snake(String model, String color, String name)
	{
		super(model, color, name);
		super.setType(snakeType);
	}
	
	public String displayAttribute() {
		return  "[" + super.getType() + "] " + super.displayAttribute();
	}
	
	@Override
	public void sound() {
		System.out.println("스스스");
	}

	@Override
	public void canEat() {
		System.out.println("뱀은 곤충, 지렁이, 고기 등을 먹을 수 있습니다.");
	}
}
