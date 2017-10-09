package string_palin;

import java.util.Scanner;

public class Solution {
	public static int n = 100;
	public static char[][] arr = new char[n][n];

	public static void init(Scanner sc) {
		for (int i = 0; i < n; i++) {
			String tmp = sc.nextLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
	}

	public static boolean isPalin(String str) {

		boolean answer = true;

		int s = 0;
		int e = str.length() - 1;

		while (s < e) {
			if (str.charAt(s) == str.charAt(e)) {
				s++;
				e--;
			} else {
				answer = false;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int answer = 0;
			int len = n;
			sc.nextLine();
			init(sc);

			while (len > 0) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j <= n - len; j++) {
						String str1 = "", str2 = "";
						for (int k = j; k < j + len; k++) {
							str1 += arr[i][k];
							str2 += arr[k][i];
						}

						if (isPalin(str1) && str1.length() > answer)
							answer = str1.length();
						if (isPalin(str2) && str2.length() > answer)
							answer = str2.length();

					}
				}
				len--;
			}

			System.out.println("#" + tc + " " + answer);
		}
	}
}
