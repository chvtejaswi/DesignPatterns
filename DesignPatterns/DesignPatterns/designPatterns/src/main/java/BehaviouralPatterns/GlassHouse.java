package BehaviouralPatterns;

public class GlassHouse extends HouseTemplate{
	@Override
	public void constructWalls() {
		System.out.println("Constructing Glass Walls is expensive");
	}

	@Override
	public void constructPillars() {
		System.out.println("Constructing Pillars with glass coating is expensive");
	}

}
