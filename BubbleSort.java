package Practice;

public class BubbleSort {
	public static void BubbleSortAlgo(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[j-1] > arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +"\t");
		}
	}
	public static void main(String args[])
	{
		int[] arr = {5,1,0,9,3,7,2,8};
		BubbleSortAlgo(arr);
	}
}
