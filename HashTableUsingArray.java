package Practice;

public class HashTableUsingArray {
	int arr[];
	int size;
	
	public HashTableUsingArray(int size)
	{
		this.size = size;
		arr = new int[this.size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	public void AddElement(int value)
	{
		arr[value % size] = value;
	}
	
	public boolean SearchElement(int value)
	{
		return arr[value % size] == value;
	}
	
	public static void main(String args[])
	{
		HashTableUsingArray htua = new HashTableUsingArray(5);
		htua.AddElement(15);
		htua.AddElement(17);
		htua.AddElement(25);
		if(htua.SearchElement(25))
		{
			System.out.println("Element found");
		}else {System.out.println("Element not found");
	}
}}
