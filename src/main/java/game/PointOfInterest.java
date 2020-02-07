package game;

public class PointOfInterest {
	
	private int interestX;
	private int interestY;

	public PointOfInterest(int interestX, int interestY) {
		this.interestX = interestX;
		this.interestY = interestY;
	}

	public int getX() {
		return interestX;
	}

	public int getY() {
		return interestY;
	}
}