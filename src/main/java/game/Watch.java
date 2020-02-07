package game;

public class Watch {
	private int playerX;
	private int playerY;
	private int interestY;
	private int interestX;
	
	public Watch(PointOfInterest interest, Player player) {
		this.interestY = interest.getY();
		this.interestX = interest.getX();
		this.playerX = player.getX();
		this.playerY = player.getY();
	}
	
	public double calcDist(int playerY, int playerX, int interestY, int interestX) {
		double xDist = interestX-playerX;
		double yDist = interestY-playerY;
		double xDistSqr = xDist*xDist;
		double yDistSqr = yDist*yDist;
		double dist = Math.sqrt(xDistSqr+yDistSqr);
		Math.
		return dist;
	}
	
	public void showHint(double dist) {
		System.out.println("The watch reads " + dist + "\n");
	}
}
