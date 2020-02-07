package game;

import java.util.Scanner;

public class Player {
	
	private int playerX;
	private int playerY;
	
	public Player(int playerX, int playerY) {
		this.playerX = playerX;
		this.playerY = playerY;
	}
	
	public String getInput() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		return input;
	}
	
	public boolean inputValid(String input) {
		if (input == "n"
		 || input == "north"
		 || input == "e"
		 || input == "east"
		 || input == "s"
		 || input == "south"
		 || input == "w"
		 || input == "west") {
			return true;
		} else {
			return false;
		}		
	}
	
	public void moveNorth(int playerY) {
		playerY += 1;
		this.playerY = playerY;
		}
	
	public void moveSouth(int playerY) {
		playerY -= 1;
		this.playerY = playerY;
	}
	
	public void moveEast(int playerX) {
		playerX -= 1;
		this.playerX = playerX;
	}
	
	public void moveWest(int playerX) {
		playerX += 1;
		this.playerX = playerX;
	}
	
	public void move(String input, int playerX, int playerY) {		
		if (input.equalsIgnoreCase("north") || input.equalsIgnoreCase("n")) {
			moveNorth(playerY);				
		} else if (input.equalsIgnoreCase("south") || input.equalsIgnoreCase("s")) {
			moveSouth(playerY);				
		} else if (input.equalsIgnoreCase("east") || input.equalsIgnoreCase("e")) {
			moveEast(playerX);				
		} else if (input.equalsIgnoreCase("west") || input.equalsIgnoreCase("w")) {
			moveWest(playerX);				
		} else {
			System.out.println("I didn't understand that.");
			
		}
	}
		
	
	
	public int getPlayerX() {
		return playerX;
	}
	public void setPlayerX(int playerX) {
		this.playerX = playerX;
	}
	public int getPlayerY() {
		return playerY;
	}
	public void setPlayerY(int playerY) {
		this.playerY = playerY;
	}
	
	
}
