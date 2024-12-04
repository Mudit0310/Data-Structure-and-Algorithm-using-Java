package Practice;

public class HeapSort {
	public static void heapify(int arr[], int n, int i)
	{
		int largest = i;
		int left = 2*i;
		int right = 2*i + 1;
		
		if(left < n && arr[largest] < arr[left])
		{
			largest = left;
		}
		
		if(right < n && arr[largest] < arr[right])
		{
			largest = right;
		}
		
		//check if largest is updated or not
		if(largest != i)
		{
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr,n,largest);
		}
	}
	
	public static void heapSort(int arr[], int n)
	{
		//build max heap
		for(int i = (n/2);i>=0;i--)
		{
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr,i,0);
		}
	}
	
	public static void main(String args[])
	{
		int arr[] = {9,0,1,6,5,2,8,7,4,3};
		int n = arr.length;
		heapSort(arr,n);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
}
