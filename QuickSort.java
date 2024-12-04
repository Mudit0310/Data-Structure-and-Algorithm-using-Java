package Practice;

public class QuickSort {
	public static void swap(int arr[],int l, int r)
	{
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}
	public static int partition(int arr[], int left, int right)
	{
		int pivot = arr[left];
		int count = 0;
		for(int i=left+1;i<=right;i++)
		{
			if(arr[i] <= pivot)
			{
				count++;
			}
		}
		int pivotIndex = count + left;
		swap(arr, left,pivotIndex);
		
		int s = left, e = right;
		while(s < pivotIndex && e > pivotIndex)
		{
			while(arr[s] <= pivot)
			{
				s++;
			}
			
			while(arr[e] > pivot)
			{
				e--;
			}
			
			if(s < e)
			{
				swap(arr,s, e);
			}
			
		}
		
		return pivotIndex;
	}
	
	public static void QuickSortt(int arr[], int left, int right)
	{
		if(left < right)
		{
			int pivot = partition(arr, left, right);
			
			QuickSortt(arr, left, pivot-1);
			QuickSortt(arr, pivot+1, right);
		}
	}
	
	public static void main(String args[])
	{
		int[] arr = {5,1,0,9,3,7,2,8,6,4};
		QuickSortt(arr, 0, arr.length-1);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
}
