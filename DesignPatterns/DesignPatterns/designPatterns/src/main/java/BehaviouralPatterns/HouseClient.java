package BehaviouralPatterns;

public class HouseClient {
public static void main(String[] args) {
		
		HouseTemplate houseType = new WoodenHouse();
		
		//using template method
		houseType.constructHouse();
		System.out.println("***********");
		
		houseType = new GlassHouse();
		
		houseType.constructHouse();
	}

}
