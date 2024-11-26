package Assignment3;

import java.util.Scanner;

public class SourceAndLocate {
	public static void BubbleSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[j-1] > arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void BinarySearch(int arr[], int left, int right, int target,int count)
	{
		count++;
		int mid = (left + right)/2;
		if(left > right)
		{
			System.out.println("Element not found!");
			return;
		}
		if(arr[mid] == target)
		{
			System.out.println(mid);
			System.out.println(count);
		}
		
		else if(target < arr[mid])
		{	
			BinarySearch(arr,left, mid-1,target,count);
		}
		
		else {
			BinarySearch(arr,mid+1,right,target,count);
		}
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int[] arr = {5,1,7,4,9,3};
		BubbleSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println("Enter a Number - ");
		int n = s.nextInt();
		BinarySearch(arr,0,arr.length-1,n,0);
		
	}
}
