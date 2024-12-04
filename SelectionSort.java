package Practice;

public class SelectionSort {
	public static void SelectionSortt(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			//consider ith element as the smallest
			int minindex = i;
			for(int j=i+1;j<arr.length;j++)
			{
				//compare ith element with rest of array
				if(arr[j] < arr[minindex])
				{
					minindex = j;
				}
			}
			
			//swap ith index if jth element is smaller
			if(minindex != i)
			{
				int temp = arr[i];
				arr[i] = arr[minindex];
				arr[minindex] = temp;
			}
		}
	}
	
	public static void main(String args[])
	{
		int[] arr = {5,1,0,9,3,7,2,8,6,4};
		SelectionSortt(arr);
		System.out.println("Selection Sort - ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
}
