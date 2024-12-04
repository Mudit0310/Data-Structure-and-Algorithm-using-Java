package Practice;

public class InsertionSort {
	public static void InsertionSortt(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void main(String args[])
	{
		int[] arr = {5,1,0,9,3,7,2,8,6,4};
		InsertionSortt(arr);
		System.out.println("Insertion Sort - ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
}
