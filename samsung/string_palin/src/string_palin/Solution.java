package string_palin;

import java.util.Scanner;

public class Solution {
	public static int n = 8;
	public static char[][] arr = new char[n][n];

	public static void init(Scanner sc) {
		for (int i = 0; i < n; i++) {
			String tmp = sc.nextLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
	}

	public static boolean isPalin(String str, int len) {

		boolean answer = true;

		int s = 0;
		int e = len - 1;

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
			int len = sc.nextInt(); 
			sc.nextLine();
			init(sc);

			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= (n - len); j++) {
					String tmp1 = "", tmp2 = "";
					for (int k = j; k < j + len; k++) {
						tmp1 += arr[i][k];
						tmp2 += arr[k][i];
					}

					if (isPalin(tmp1, len))
						answer += 1;

					if (isPalin(tmp2, len))
						answer += 1;
				}
			}

			System.out.println("#" + tc + " " + answer);
		}
	}
}
