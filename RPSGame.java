
import java.util.Random;
import java.util.Scanner;
public class RPSGame
{

	public static void main(String[] args)
	{
		Random bot = new Random(); // Random number
		Scanner input = new Scanner(System.in);
		
		int usersChoice;
		int computersChoice;
		
		// Get input from the user and computer
		System.out.print("Choose 0 for Rock, 1 for Paper, 2 for Scissor: ");
		usersChoice = input.nextInt();
		computersChoice = bot.nextInt(3); // take 0, 1, and 2
		
		// Condition
		if (usersChoice == 0)
		{
			if (computersChoice == 1) 
				System.out.print("You choose rock. Computer chooses paper. \nYou lose!");
			else if (computersChoice == 2) 
				System.out.print("You choose rock. Computer chooses scissor. \nYou win!");
			else
				System.out.print("You both choose rock. \n Tie!");	
		}
		else if (usersChoice == 1)
		{
			if (computersChoice == 0) 
				System.out.print("You choose paper. Computer chooses rock. \nYou win!");
			else if (computersChoice == 2) 
				System.out.print("You choose paper. Computer chooses scissor. \nYou lose!");
			else
				System.out.print("You both choose paper. \n Tie!");	
		}
		else if (usersChoice == 2)
		{
			if (computersChoice == 0) 
				System.out.print("You choose scissor. Computer chooses rock. \nYou lose!");
			else if (computersChoice == 1) 
				System.out.print("You choose scissor. Computer chooses paper. \nYou win!");
			else
				System.out.print("You both choose scissor. \nTie!");
		}
		else
			System.out.print("Wrong Input!!! Debug again to restart.");
		
		input.close();
	}
}
