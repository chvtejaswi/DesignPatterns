package BehaviouralPatterns;

public class WoodenHouse extends HouseTemplate{
	@Override
	public void constructWalls() {
		System.out.println("Constructing Wooden Walls is recommended in earthquake prone areas");
	}

	@Override
	public void constructPillars() {
		System.out.println("Constructing Pillars with Wood coating is less expensive");
	}

}
