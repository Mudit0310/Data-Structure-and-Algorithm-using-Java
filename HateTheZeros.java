package Assignment1;

public class HateTheZeros {
	public static void main(String args[])
	{
		int arr[][] = {{1,5,0,6},
					   {0,0,0,0},
					   {5,0,0,9},
					   {8,0,0,2}};
		
		int row[] = new int[arr.length];
		int col[] = new int[arr[0].length];
		System.out.println(arr.length + " " + arr[0].length);
		
		for(int i=0;i<arr.length;i++)
		{
			int rowSum = 0;
			for(int j=0;j<arr[0].length;j++)
			{
				rowSum += arr[i][j];
			}
			
			if(rowSum == 0)
			{
				row[i] = 1;
			}
		}
		
		for(int i=0;i<arr[0].length;i++)
		{
			int colSum = 0;
			for(int j=0;j<arr.length;j++)
			{
				colSum += arr[j][i];
			}
			
			if(colSum == 0)
			{
				col[i] = 1;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(row[i] == 1)
			{
				continue;
			}
			for(int j=0;j<arr[0].length;j++)
			{
				if(col[j]==1) {
					continue;
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}