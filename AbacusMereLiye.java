package Assignment4;

import java.util.Scanner;

public class AbacusMereLiye {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number - ");
		int n = s.nextInt();
		
		int thousand = n / 1000;
		int hundred = (n % 1000) / 100;
		int tens = (n % 100)/10;
		int ones = (n % 10);
		
		int count1000 = 4;
		int count100 = 4;
		int count10 = 4;
		int count1 = 4;
		
		int arr[][] = new int[8][4];
		
		arr[0][0] = 0;
		arr[0][1] = 0;
		arr[0][2] = 0;
		arr[0][3] = 0;
		
		if(thousand >= 5)
		{
			arr[1][0] = 5000;
			arr[2][0] = -1;
			int count = thousand - 5;
			int i = 3;
			while(count>0)
			{
				arr[i][0] = 1000;
				count1000--;
				count--;
				i++;
			}
			i++;
			while(count1000 > 0)
			{
				arr[i][0] = 1000;
				i++;
				count1000--;
			}
		}
		else {
			if(thousand >= 1)
			{
				arr[1][0] = 1000;
				arr[2][0] = -1;
				int count = thousand-1;
				int c = count1000 - count-1;
				int i = 3;
				while(count > 0)
				{
					arr[i][0] = 1000;
					count--;
					i++;
				}
				i++;
				while(c > 0)
				{
					arr[i][0] = 1000;
					i++;
					c--;
				}
			}
			else {
				arr[1][0] = 0;
				arr[2][0] = -1;
				arr[3][0] = 0;
				int i = 4;
				while(count1000 > 0)
				{
					arr[i][0] = 1000;
					count1000--;
					i++;
				}
			}
		}
		
		if(hundred >= 5)
		{
			arr[1][1] = 500;
			arr[2][1] = -1;
			int count = hundred - 5;
			int i = 3;
			while(count>0)
			{
				arr[i][1] = 100;
				count100--;
				count--;
				i++;
			}
			i++;
			System.out.println(count100);
			while(count100 > 0)
			{
				arr[i][1] = 1000;
				i++;
				count100--;
			}
		}
		else {
			if(hundred >= 1)
			{
				arr[1][1] = 100;
				arr[2][1] = -1;
				int count = hundred-1;
				int c = count100 - count-1;
				int i = 3;
				while(count > 0)
				{
					arr[i][1] = 100;
					count--;
					i++;
				}
				i++;
				while(c > 0)
				{
					arr[i][1] = 100;
					i++;
					c--;
				}
			}
			else {
				arr[1][1] = 0;
				arr[2][1] = -1;
				arr[3][1] = 0;
				int i = 4;
				while(count100 > 0)
				{
					arr[i][1] = 100;
					count100--;
					i++;
				}
			}
		}
		
		if(tens >= 5)
		{
			arr[1][2] = 50;
			arr[2][2] = -1;
			int count = tens - 5;
			int i = 3;
			while(count>0)
			{
				arr[i][2] = 10;
				count10--;
				count--;
				i++;
			}
			i++;
			while(count10 > 0)
			{
				arr[i][2] = 1000;
				i++;
				count10--;
			}	
		}
		else {
			if(tens >= 1)
			{
				arr[1][2] = 10;
				arr[2][2] = -1;
				int count = tens-1;
				int c = count10 - count-1;
				int i = 3;
				while(count > 0)
				{
					arr[i][2] = 10;
					count--;
					i++;
				}
				i++;
				while(c > 0)
				{
					arr[i][2] = 10;
					i++;
					c--;
				}
			}
			else {
				arr[1][2] = 0;
				arr[2][2] = -1;
				arr[3][2] = 0;
				int i = 4;
				while(count10 > 0)
				{
					arr[i][2] = 10;
					count10--;
					i++;
				}
			}
		}
		
		if(ones >= 5)
		{
			arr[1][3] = 5;
			arr[2][3] = -1;
			int count = ones - 5;
			int i = 3;
			while(count>0)
			{
				arr[i][3] = 1;
				count1--;
				count--;
				i++;
			}
			i++;
			while(count1 > 0)
			{
				arr[i][3] = 1;
				i++;
				count1--;
			}
		}
		else {
			if(ones >= 1)
			{
				arr[1][3] = 1;
				arr[2][3] = -1;
				int count = ones-1;
				int c = count1 - count-1;
				int i = 3;
				while(count > 0)
				{
					arr[i][3] = 1;
					count--;
					i++;
				}
				i++;
				while(c > 0)
				{
					arr[i][3] = 1;
					i++;
					c--;
				}
			}
			else {
				arr[1][3] = 0;
				arr[2][3] = -1;
				arr[3][3] = 0;
				int i = 4;
				while(count1 > 0)
				{
					arr[i][3] = 1;
					count1--;
					i++;
				}
			}
		}
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j] + "\t" + "\t");
			}
			System.out.println();
		}
		
	}
}