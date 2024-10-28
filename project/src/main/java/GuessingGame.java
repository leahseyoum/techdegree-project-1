import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
			
			Scanner itemNameObj = new Scanner(System.in);
			System.out.println("What type of item should fill the jar?  ");
			String itemName = itemNameObj.nextLine();
			
			Scanner itemNumberObj = new Scanner(System.in);
			System.out.printf("What is the maximum amount of %s?  ", itemName);
			String itemNumberString = itemNumberObj.nextLine();
			int maxItemNumber = Integer.parseInt(itemNumberString);
			
			// New jar instance
			Jar jar = new Jar(itemName, maxItemNumber);
			jar.fill();
			
			// First guess
			Scanner guessObj = new Scanner(System.in);
			System.out.printf("%n%n%n How many %s are in the jar? Pick a number between 1 and %d:  ",itemName, maxItemNumber);
			String stringGuess = guessObj.nextLine();
			int guess = Integer.parseInt(stringGuess);
			
			// Game loop
			int numberOfGuesses = 1;
			while (guess != jar.getCurrentNumberOfItems()) {
				Scanner newGuessObj = new Scanner(System.in);
				System.out.printf("%nHow many %s are in the jar? Pick a number between 1 and %d:  ",itemName, maxItemNumber);
				String newStringGuess = newGuessObj.nextLine();
				guess = Integer.parseInt(newStringGuess);
				numberOfGuesses++;
				
				if (guess == jar.getCurrentNumberOfItems()) break;
					
			}
			
			// Completion message
			System.out.printf("Congrats! You got it in %d attempts%n", numberOfGuesses);
				
    }
}
