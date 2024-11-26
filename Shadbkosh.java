package Assignment2;

import java.util.Scanner;

public class Shadbkosh{
	static String words[];
	static boolean visited[];
	static String result[];
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of words - ");
		int n = s.nextInt();
		words = new String[n];
		visited = new boolean[n];
		result = new String[n];
		
		System.out.println("Enter words - ");
		for(int i=0;i<n;i++)
		{
			words[i] = s.next();
		}
		
		result[0] = words[0];
		visited[0] = true;
		
		if(findChain(1))
		{
			System.out.println("Chain Formed");
		}
		else {
			System.out.println("Impossible");
		}
	}
	
	public static boolean findChain(int index)
	{
		if(words.length == index)
		{
			return true;
		}
		
		for(int i=0;i<words.length;i++)
		{
			if(!visited[i] && chainWords(words[i], result[index - 1]))
			{
				result[index] = words[i];
				visited[i] = true;
				
				if(findChain(index + 1))
				{
					return true;
				}
				visited[i] = false;
			}
		}
		
		return false;
	}
	
	public static boolean chainWords(String a, String b)
	{
		int len = Math.min(a.length(), b.length());
		for(int i=3;i<=len;i++)
		{
			if(b.substring(b.length()-i).equals(a.substring(0, i)))
			{
				return true;
			}
		}
		
		return false;
	}
}