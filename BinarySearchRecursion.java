package Practice;

public class BinarySearchRecursion {
	public static void BinarySearchRecursionExample(int arr[], int left, int right,int target)
	{
		int mid = (left + right)/2;
		if(left > right)
		{
			System.out.println("Element not found!");
			return;
		}
		if(arr[mid] == target)
		{
			System.out.println("Target element found at " + mid);
		}
		
		else if(arr[mid] > target)
		{
			BinarySearchRecursionExample(arr,left, mid-1,target);
		}
		else {
			BinarySearchRecursionExample(arr, mid+1, right, target);
		}
	}
	
	public static void main(String args[])
	{
		int arr[] = {2,3,5,6,8,9,12,14,16};
		int target = 15;
		
		BinarySearchRecursionExample(arr,0,arr.length-1,target);
	}
}
