//package Assignment2;
//
//import java.util.Scanner;
//
//public class HappyNumbers {
//	
//	public static int sumOfSquares(int i)
//	{
//		int sum = 0;
//		while(i>0)
//		{
//			int digit = i%10;
//			sum += (digit*digit);
//			i = i/10;
//		}
//		
//		return sum;
//	}
//	public static int IsHappy(int i)
//	{
//		int count = 0;
//		while(i != 1 && count < 10)
//		{
//			i = sumOfSquares(i);
//			count++;
//		}
//		
//		return (i==1)?count : -1;
//	}
//	public static void main(String args[])
//	{
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter First Number - ");
//		int n1 = s.nextInt();
//		System.out.println("Enter Second Number - ");
//		int n2 = s.nextInt();
//		
//		for(int i=n1;i<=n2;i++)
//		{
//			int iteration = IsHappy(i);
//			if(iteration != -1)
//			{
//				System.out.println(i + " " +iteration);
//			}
//		}
//	}
//}

package Assignment2;

import java.util.Scanner;

public class HappyNumbers{
	public static int sumOfSquares(int i)
	{
		int sum = 0;
		while(i>0)
		{
			i = i%10;
			sum += (i*i);
			i = i/10;
		}
		return sum;
	}
	
	public static int HappyNumber(int n)
	{
		int count = 0;
		while(n!=1 && count < 10)
		{
			n = sumOfSquares(n);
			count++;
		}
		
		return count;
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers - ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		for(int i=n1;i<=n2;i++)
		{
			int j = HappyNumber(i);
			System.out.println(j);
		}
	}
}