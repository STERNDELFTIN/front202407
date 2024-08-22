package my.pkg;

public class Main {

	public static void main(String[] args) {
		// Create Objects
		Puppy2 p1 = new Puppy2("maltese", "white");
		Puppy2 p2 = new Puppy2("dachshund", "black");
		
		// Name Setting Using the 'Setter' Method
		p1.setName("똘이");
		p2.setName("초코");
		
		// Output
		System.out.println("이름: " + p1.getName() + ", 종류: " + p1.model + ", 색상: " + p1.color);
		System.out.println("이름: " + p2.getName() + ", 종류: " + p2.model + ", 색상: " + p2.color);
		
	}

}
