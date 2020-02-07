package game;

public class Watch {

	public Watch(PointOfInterest interest, Player player) {
	}
	
	public double calcDist(int playerY, int playerX, int interestY, int interestX) {
		double xDist = interestX-playerX;
		double yDist = interestY-playerY;
		double xDistSqr = xDist*xDist;
		double yDistSqr = yDist*yDist;
		double dist = Math.sqrt(xDistSqr+yDistSqr);
		return dist;
	}
	
	public void showHint(double dist, PointOfInterest interest, Player player) {
		if (player.getX() != interest.getX() || player.getY() != interest.getY()) {
			System.out.println("The watch reads " + dist + "m\n");
		}		
	}
}
