package ch08.practice.N06;

public class SoundableExample {

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());
	}

}
