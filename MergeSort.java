package Practice;

public class MergeSort {
	
	public static void Merge(int arr[], int left, int mid, int right)
	{
		int leftArraySize = mid - left + 1;
		int rightArraySize = right - mid;
		
		int leftArray[] = new int[leftArraySize];
		int rightArray[] = new int[rightArraySize];
		
		//copying array elements in left array
		for(int i=0;i<leftArraySize;i++)
		{
			leftArray[i] = arr[left+i];
		}
		
		//copying array elements in right array
		for(int j=0;j<rightArraySize;j++)
		{
			rightArray[j] = arr[mid+1+j];
		}
		
		int k=left,i=0,j=0;
		//comparing elements of right and left array, inserting smaller elements
		while(i < leftArraySize && j < rightArraySize)
		{
			if(leftArray[i] > rightArray[j])
			{
				arr[k] = rightArray[j];
				k++;
				j++;
			}
			else {
				arr[k] = leftArray[i];
				k++;
				i++;
			}
		}
		
		while(i < leftArraySize)
		{
			arr[k] = leftArray[i];
			k++;
			i++;
		}
		
		while(j < rightArraySize)
		{
			arr[k] = rightArray[j];
			k++;
			j++;
		}
	}
	
	
	public static void MergeSortt(int arr[], int left, int right)
	{
		if(left < right)
		{
			int mid = (left + right)/2;
			MergeSortt(arr,left,mid);
			MergeSortt(arr,mid+1,right);
			Merge(arr,left,mid,right);
		}
	}
	
	
	public static void main(String args[])
	{
		int[] arr = {5,1,0,9,3,7,2,8,6,4};
		MergeSortt(arr, 0, arr.length-1);
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
}
