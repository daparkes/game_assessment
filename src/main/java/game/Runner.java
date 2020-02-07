package game;

public class Runner {
	public static void main(String[] args) {
		Player player = new Player(0, 0);
		
		String cont = "y";
		
		System.out.println("Grey foggy clouds float oppressively close to you, \r\n" + 
				"reflected in the murky grey water which reaches up your shins.\r\n" + 
				"Some black plants barely poke out of the shallow water.\r\n" + 
				"Try \"north\", \"south\", \"east\", or \"west\"\r\n" + 
				"You notice a small watch-like device in your left hand.  \r\n" + 
				"It has hands like a watch, but the hands don't seem to tell time. \r\n" + 
				"");
		while (cont == "y") {
			System.out.println("Please enter north, south, east or west.");
			String input = player.getInput();
			
			if (player.inputValid(input) == true) {
				player.move(input, player.getPlayerX(), player.getPlayerY());
				System.out.println(player.getPlayerX());
				System.out.println(player.getPlayerY());
			} else {
				System.out.println("I didn't understand that.");
				continue;
			}
							
		}
			
			cont = "n";
			System.out.println("Game over.");
		}
		
	}

