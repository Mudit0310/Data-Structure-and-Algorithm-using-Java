package Assignment1;

import java.util.Scanner;

public class MagicMatrix {
	public static boolean Matrix(int arr[][]) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println("Enter " + i + " & " + j + " element - ");
				arr[i][j] = s.nextInt();
			}
		}

		int diag1 = 0;
		int diag2 = 0;

		for (int i = 0; i < arr.length; i++) {
			diag1 += arr[i][i];
			diag2 += arr[i][arr.length - i - 1];
		}

		if (diag1 != diag2) {
			return false;
		}

		for (int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			int colSum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				rowSum += arr[i][j];
				colSum += arr[j][i];
			}

			if (colSum != rowSum || colSum != diag1) {
				return false;
			}
		}

		return true;
	}

	public static void main(String args[]) {
		int arr[][] = new int[3][3];
		if (Matrix(arr)) {
			System.out.println("Magic Matrix");
		} else {
			System.out.println("Not Magic Matrix");
		}
	}
}
