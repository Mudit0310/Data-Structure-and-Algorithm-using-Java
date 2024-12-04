package Practice;

public class BinarySearch {
	public void BinarySearchExample(int arr[], int left, int right, int target)
	{
		while(left <= right)
		{
			int mid = (right + left)/2;
			
			if(arr[mid] == target)
			{
				System.out.println("Element found at " + mid);
				return;
			}
			
			else if(arr[mid] > target)
			{
				right = mid - 1;
			}
			
			else {
				left = mid + 1;
			}
		}
		
		System.out.println("Element not found in the array");
	}
	public static void main(String args[])
	{
		BinarySearch bs = new BinarySearch();
		int arr[] = {2,4,5,7,8,9,11,15,19};
		int target = 1;
		
		bs.BinarySearchExample(arr, 0, arr.length-1,target);
	}
}
