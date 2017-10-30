
import java.util.Scanner;
public class DiceGame
{
	public static void main(String[] args)
	{
		String userInput;
		int dice ;
		int win = 0;
		int lose = 0;
		int gamePlay = 0;
		int odd = 0;
		int even = 0;
		float winRate;
		boolean playAgain = true;
		Scanner input = new Scanner (System.in);
		
		while(playAgain)
		{
			dice = 1 + (int) ( Math.random() * 6 );
			System.out.print("The dice number is odd or even(O or E): ");
			userInput = input.next();
			
			if (userInput.toUpperCase().equals("E"))
			{
				if (dice % 2 == 0)
				{
					System.out.printf("The dice number is %d. You win. \n", dice);
					gamePlay++;
					win++;
					even++;
				}
				else
				{
					System.out.printf("The dice number is %d. You lose. \n", dice);
					gamePlay++;
					lose++;
					odd++;
				}
			}
			
			else if(userInput.toUpperCase().equals("O"))
			{
				if (dice % 2 == 0)
				{
					System.out.printf("The dice number is %d. You lose. \n", dice);
					gamePlay++;
					lose++;
					even++;
				}
				else
				{
					System.out.printf("The dice number is %d. You win. \n", dice);
					gamePlay++;
					win++;
					odd++;
				}
			}
			
			else
			{
				System.out.println("Wrong input! No game play count");
			}
			
			String replay;
			System.out.print("Do you want to play again (Y or N): ");
			replay = input.next();
			if (replay.toUpperCase().equals("Y"))
				playAgain = true;
			else
				playAgain = false;
		}
		input.close();
		winRate = (win*100)/gamePlay;
		
		System.out.printf("You play %d games. \n", gamePlay);
		System.out.printf("You won %d games. \n", win);
		System.out.printf("You lost %d games. \n", lose);
		System.out.printf("The system generates %d odd games. \n", odd);
		System.out.printf("The system generates %d even games. \n", even);
		System.out.printf("Your win rate is %f percent. \n", winRate);
	}

}
