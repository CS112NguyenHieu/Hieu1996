import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		
		int userInput;
		int computerNum;
		int goodGuesses = 0;
		int badGuesses = 0;
		int gamePlay = 0;
		float winRate;
		float loseRate;
		boolean playAgain = true;
		Scanner input = new Scanner ( System.in);
		
		while(playAgain)
		{
			computerNum = 1 + (int) ( Math.random() * 5 );
			System.out.print("Guess the number (1 to 5): ");
			userInput = input.nextInt();
			System.out.printf("You choose %d. Computer chooses %d\n", userInput, computerNum);
		
			if (userInput < 1 || userInput > 5)
				System.out.println("Wrong input!!!");
			else
			{
				if (userInput == computerNum)
				{
					System.out.println("Match!!! You won!");
					System.out.printf("You play %d games \n", gamePlay + 1);
					System.out.printf("You win %d games.\n", goodGuesses + 1);
					System.out.printf("You lose %d games.\n", badGuesses);
					gamePlay++;
					goodGuesses++;
				}
				else if (userInput > computerNum)
				{
					System.out.println("Too high!");
					System.out.printf("You play %d games \n", gamePlay + 1);
					System.out.printf("You win %d games.\n", goodGuesses);
					System.out.printf("You lose %d games.\n", badGuesses + 1);
					gamePlay++;
					badGuesses++;
				}
				else 
				{
					System.out.println("Too low!");
					System.out.printf("You play %d games \n", gamePlay + 1);
					System.out.printf("You win %d games.\n", goodGuesses);
					System.out.printf("You lose %d games.\n", badGuesses + 1);
					gamePlay++;
					badGuesses++;
				}
			}
			
			String replay;
			System.out.print("Do you want to play again (Y or N): ");
			replay = input.next();
			if (replay.toUpperCase().equals("Y"))
				playAgain = true;
			else
				playAgain = false;
			// the user can play as much as they want
		}
		winRate = (goodGuesses*100)/gamePlay;
		loseRate = (badGuesses*100)/gamePlay;
		System.out.printf("You play %d games \n", gamePlay);
		System.out.printf("You win %d games. Your win rate is %f percent.\n", goodGuesses, winRate);
		System.out.printf("You lose %d games. Your lose rate is %f percent.\n", badGuesses, loseRate);
		input.close();

	}

}
