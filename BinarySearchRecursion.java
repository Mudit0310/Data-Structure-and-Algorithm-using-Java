package Assignment1;;

public class BinarySearchRecursion {
	public static int Binary(int arr[], int left, int right, int target)
	{
		int mid = (left + right)/2;
		if(left > right)
		{
			System.out.println("Element not found");
			return -1;
		}
		if(arr[mid] == target)
		{
			return mid;
		}
		else if(arr[mid] < target)
		{
			return Binary(arr,mid+1,right,target);
		}

		else
		{
			return Binary(arr,left, mid-1, target);
		}
	}
	public static void main(String args[])
	{
		int arr[] = {2,6,7,9,12,15,18,23};
		int target = 23;
		int res = Binary(arr, 0, arr.length-1, target);
		System.out.println("Index at " + res);
	}
}
