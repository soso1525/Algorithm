package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = 10;
		for (int i = 1; i <= tc; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int a = 0; a < n; a++) {
				arr[a] = sc.nextInt();
			}

			int[] tmp = new int[5];
			int ans = 0;

			for (int a = 2; a < n - 2; a++) {
				if (arr[a - 2] < arr[a] && arr[a - 1] < arr[a] && arr[a + 1] < arr[a] && arr[a + 2] < arr[a]) {
					ans += (arr[a] - Math.max(arr[a-2], Math.max(arr[a-1], Math.max(arr[a+1], arr[a+2]))));
				}
			}

			System.out.println("#" + i + " " + ans);
		}
	}
}
