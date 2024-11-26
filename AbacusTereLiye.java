package Assignment4;

public class AbacusTereLiye {
	public static int Abacus(int arr[][])
	{
		int colSum[] = new int[arr[0].length];
		
		for(int col=0;col<arr[0].length;col++)
		{
			int sum=0;
			boolean foundMinusOne = false;
			for(int row=0;row<arr.length;row++)
			{
				if(arr[row][col] == -1)
				{
					foundMinusOne = true;
					sum+=arr[row-1][col];
				}
				
				else if(foundMinusOne)
				{
					if(arr[row][col]==0)
					{
						break;
					}
					sum+=arr[row][col];
				}
				
			}
			colSum[col] = sum;
		}
		
		int totalSum = 0;
		for(int i=0;i<colSum.length;i++)
		{
			totalSum += colSum[i];
		}
		
		return totalSum;
	}
	
	public static void main(String args[])
	{
		int arr[][] = {{0,0,0,0},
					   {5000, 500,50,5},
					   {-1,-1,-1,-1},
					   {1000,100,0,1},
					   {1000,100,10,1},
					   {0,0,10,1},
					   {1000,100,10,0},
					   {1000,100,10,1}};
		
		int ans = Abacus(arr);
		System.out.println("Matrix Number - " + ans);
	}
}
