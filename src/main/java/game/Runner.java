package game;

public class Runner {
	public static void main(String[] args) {
		
		Player player = new Player(0, 0);		
		PointOfInterest interest = new PointOfInterest(1, 0);
		Watch watch = new Watch(interest, player);
		
		String cont = "y";
		
		System.out.println("Grey foggy clouds float oppressively close to you, \r\n" + 
				"reflected in the murky grey water which reaches up your shins.\r\n" + 
				"Some black plants barely poke out of the shallow water.\r\n" + 
				"Try \"north\", \"south\", \"east\", or \"west\"\r\n" + 
				"You notice a small watch-like device in your left hand.  \r\n" + 
				"It has hands like a watch, but the hands don't seem to tell time. \r\n" + 
				"");
		while (cont == "y") {
			System.out.println("Please enter north, south, east or west.\n");
			String input = player.getInput();
			
			if (player.inputValid(input) == true) {
				player.move(input, player.getX(), player.getY());
				watch.showHint(watch.calcDist(
						player.getY(),
						player.getX(),
						interest.getY(),
						interest.getX()),
						interest, player);
			} else {
				System.out.println("I didn't understand that.");
				continue;
			}
			if (player.getX() == interest.getX() && player.getY() == interest.getY()) {
				break;
			}
		}
			
			cont = "n";
			System.out.println(
					"You see a box sitting on the plain. It’s filled with treasure!"
					+ " You win! The end."
					);
		}
		
	}

