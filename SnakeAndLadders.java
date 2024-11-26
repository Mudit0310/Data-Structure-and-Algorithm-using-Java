package Assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SnakeAndLadders {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[10][10];
		System.out.println("Enter the Number of Snakes - ");
		int N = s.nextInt();
		
		Map<Integer, Integer> Snakes = new HashMap<>();
		for(int i=0;i<N;i++)
		{
			System.out.println("Enter Mouth of " +(i+1)+" Snake - ");
			int mouth = s.nextInt();
			System.out.println("Enter Tail of " +(i+1)+ " Snake - ");
			int tail = s.nextInt();
			Snakes.put(mouth, tail);
		}
		
		int position = 1;
		int dice = 0;
		while(position <= 100)
		{
			System.out.println("Roll a dice - ");
			dice = s.nextInt();
			if(dice>6)
			{
				System.out.println("Invalid Dice number. Should be between 1 and 6");
			}
			else {
				position += dice;
				System.out.println("Your new Position - " + position);
			}
			
			if(Snakes.containsKey(position))
			{
				System.out.println("Oops! You have bitten by a Snake");
				position = Snakes.get(position);
				System.out.println("Your new position is " + position);
			}
		}
		System.out.println("You won the Game!");
	}
}
