package chapter06.exercises;

public class ShopService {
	final static ShopService shopService = new ShopService();
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		return shopService;
	}
}
