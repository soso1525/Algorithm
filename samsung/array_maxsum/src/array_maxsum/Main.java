package array_maxsum;

public class Main {
	public static void main(String[] args) {
		int n = 5;
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			arr[4 - i][4 - i] = 1;
			// arr[i][i] = 1;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
}
