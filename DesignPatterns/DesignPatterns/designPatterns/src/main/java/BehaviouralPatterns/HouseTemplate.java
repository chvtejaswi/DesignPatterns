package BehaviouralPatterns;

public abstract class HouseTemplate {
	public final void constructHouse(){
		constructFoundation();
	        constructPillars();
		constructWalls();
		constructWindows();
		System.out.println("House is constructed very quickly");
	}

	private void constructWindows() {
		System.out.println("Constructing Glass Windows is not an easy task");
	}
	public abstract void constructWalls();
	public abstract void constructPillars();

	private void constructFoundation() {
		System.out.println("Constructing foundation with cement,iron rods and sand is easy");
	}

}
