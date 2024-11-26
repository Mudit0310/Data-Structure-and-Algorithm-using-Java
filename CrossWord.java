package Assignment3;

import java.util.Scanner;

public class CrossWord {
	public static void Crossword(char arr[][], String str1, String str2, int x, int y)
	{
		for(int i = 0;i<str1.length();i++)
		{
			arr[x+i][y] = str1.charAt(i);
		}
		
		char commonChar = '\0';
		int commonRow = 0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.indexOf(str2.charAt(i))!=-1)
			{
				commonChar = str2.charAt(i);
				commonRow = str1.indexOf(commonChar) + x;
				break;
			}
		}
		
		int z = str2.indexOf(commonChar);
		for(int i =0;i<str2.length();i++)
		{
			arr[commonRow][y-z+i] = str2.charAt(i);
		}													
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		char arr[][] = new char[10][10];
		for(char i = 0;i<10;i++)
		{
			for(char j=0;j<10;j++)
			{
				arr[i][j] = '*';
			}
		}
		System.out.println("Enter first String - ");
		String str1 = s.next();
		System.out.println("Enter second String - ");
		String str2 = s.next();
		System.out.println("Enter x coordinate - ");
		int x = s.nextInt();
		System.out.println("Enter y coordinate - ");
		int y = s.nextInt();
		Crossword(arr, str1, str2, x, y);
	}
}
