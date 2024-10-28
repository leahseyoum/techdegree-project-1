import java.util.Scanner;

public class Prompter {
	
	private final Scanner scanner;
	
	public Prompter() {
		this.scanner = new Scanner(System.in);
	}
	
	public String promptItemName() {
			System.out.println(" What type of item should fill the jar?  ");
			return scanner.nextLine();
	}
	
	public int promptItemNumber (String itemName) {
			System.out.printf("%n What is the maximum amount of %s?  ", itemName);
			String itemNumberString = scanner.nextLine();
			return Integer.parseInt(itemNumberString);
	}
	
	public int promptForGuess(String itemName, int maxItemNumber) {
			System.out.printf("%n How many %s are in the jar? Pick a number between 1 and %d:  ",itemName, maxItemNumber);
			String stringGuess = scanner.nextLine();
			return Integer.parseInt(stringGuess);
	}
	
	public int promptForValidGuess(int guess, int maxItemNumber) {
		
		while (guess > maxItemNumber) {
			System.out.print(" Your guess must be less than maximum fill amount:  ");
			String stringGuess = scanner.nextLine();
			guess = Integer.parseInt(stringGuess);
		}
		
		return guess;
	}
	
	public void promptForClue(int guess, int currentNum) {
		if (guess < currentNum) {
			System.out.println(" Your guess is too low");
		} else if (guess > currentNum) {
			System.out.println(" Your guess is too high");
		}
	}
	
	public void promptForWin(int numberOfGuesses) {
		System.out.printf(" Congrats! You got it in %d attempts%n", numberOfGuesses);
	}
}