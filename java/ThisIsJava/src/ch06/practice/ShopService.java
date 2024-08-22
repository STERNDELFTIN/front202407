package ch06.practice;

public class ShopService {
	
	// Variable
	private static ShopService singleton = new ShopService();
	
	// Constructor
	private ShopService() {}
	
	// Method
	public static ShopService getInstance() {
		return singleton;
	}
}
