public class GuessingGame {
    public static void main(String[] args) {
		
		Prompter prompter = new Prompter();
			

		String itemName = prompter.promptItemName();
		

		int maxItemNumber = prompter.promptItemNumber(itemName);
			
			// New jar instance
			Jar jar = new Jar(itemName, maxItemNumber);
			jar.fill();
			
			// Game loop
			int numberOfGuesses = 0;
			int guess;
			int currentNum = jar.getCurrentNumberOfItems();
			do {
				guess = prompter.promptForGuess(itemName, maxItemNumber);
				
				if (guess > maxItemNumber) {
					guess = prompter.promptForValidGuess(guess, maxItemNumber);
				} 
				if (guess > currentNum || guess < currentNum) {
					prompter.promptForClue(guess, currentNum);
				}
				numberOfGuesses++;
				
			} while(guess != currentNum);
			
		
			// Completion message
			prompter.promptForWin(numberOfGuesses);
				
    }
}
