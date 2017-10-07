package gravitiy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt(); // column
			int m = sc.nextInt(); // row
			int[][] arr = new int[m][n];

			for (int i = 0; i < n; i++) {
				int b = sc.nextInt();

				int row = m - 1;
				while (b-- > 0) {
					arr[row][i] = 1;
					row--;
				}
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}

			int answer = 0;
			for (int i = 0; i < m; i++) {
				if(arr[i][0] == 0) continue;
				int cnt = 0;
				for (int j = 0; j < n; j++) {
					if (arr[i][j] != 1)
						cnt++;
				}

				if (answer < cnt)
					answer = cnt;
			}

			System.out.println(answer);
		}
	}
}
