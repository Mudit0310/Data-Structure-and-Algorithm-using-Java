package Assignment3;

import java.util.Scanner;

public class TripToMars {
	public static void Direction(int arr[][],int x, int y,String direc, String movement)
	{
		int count = movement.length();
		if(direc.equals("N") && y-count >= 0) {
			y = y-count;
			System.out.println(x + " " + y + " " + direc);
		}
		else if(direc.equals("S") && y+count <= arr[0].length)
		{
			y = y + count;
			System.out.println(x + " " + y + " " + direc);
		}
		else if(direc.equals("W") && x-count >= 0)
		{
			x = x-count;
			System.out.println(x + " " + y + " " + direc);
		}
		else if(direc.equals("E") && x+count <= arr.length)
		{
			x = x + count;
			System.out.println(x + " " + y + " " + direc);
		}
		else {
			System.out.println("Out of Boundary");
		}
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Row size - ");
		int n = s.nextInt();
		System.out.println("Enter Col size - ");
		int m = s.nextInt();
		
		int arr[][] = new int[n][m];
		System.out.println("Enter x axis - ");
		int x = s.nextInt();
		System.out.println("Enter y axis - ");
		int y = s.nextInt();
		
		System.out.println("Enter direction - ");
		String direc = s.next();
		
		System.out.println("Enter Movement - ");
		String movement = s.next();
		
		Direction(arr,x,y,direc,movement);
	}
}
