package my.pkg.inheritance;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog dog2 = new Dog("Dachshund", "black", "검둥이");
		Bird bird  = new Bird("Parrot", "purple", "짹짹이");
		Cat cat = new Cat("Ragdoll", "white", "냐옹이");
		Snake snake = new Snake("Python", "brown", "뱜이");
		
		dog.setAttribute("maltese", "white", "흰둥이");
		
		System.out.println(dog.displayAttribute());
		System.out.println(dog2.displayAttribute());
		System.out.println(bird.displayAttribute());
		System.out.println(cat.displayAttribute());
		System.out.println(snake.displayAttribute());
		
		bird.sound();
		bird.canFly();
	}

}
