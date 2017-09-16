import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner( System.in );
				
	float number1, number2, add, substract, multiply, divide;
		
		System.out.print("Please enter the first number: ");
		number1 = input.nextFloat();
		
		System.out.print("Please enter the second number: ");
		number2 = input.nextFloat();
		
	
 		add = number1 + number2;        
		substract = number1 - number2; 
		multiply = number1 * number2; 
		divide = number1 / number2;  
		
	System.out.printf("Sum is %f\n", add); 
	System.out.printf("Difference is %f\n", substract); 
	System.out.printf("Product is %f\n", multiply); 
	System.out.printf("Quotient is %f\n", divide);

	}
}