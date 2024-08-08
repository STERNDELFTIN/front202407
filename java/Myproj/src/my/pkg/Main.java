package my.pkg;

public class Main {

	public static void main(String[] args) {

		Puppy p1 = new Puppy("똘이", "maltese", "white");
		Puppy p2 = new Puppy("초코", "dachshund", "black");
		
//		Puppy 똘이 = new Puppy("maltese", "white");
//		Puppy 초코 = new Puppy("dachshund", "black");
		
		
		System.out.println("이름: " + p1.name + ", 종류: " + p1.type + ", 색상: " + p1.color);
		System.out.println("이름: " + p2.name + ", 종류: " + p2.type + ", 색상: " + p2.color);
		
//		System.out.println("종류: " + 똘이.type + ", 색상: " + 똘이.color);
//		System.out.println("종류: " + 초코.type + ", 색상: " + 초코.color);
	}

}
