package string_1213;

import java.util.Scanner;

/* 특정문자열 포함 개수 반환 */

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int answer = 0;
			sc.nextInt();
			sc.nextLine();
			String find = sc.nextLine();
			String str = sc.nextLine();

			while (str.length() >= find.length()) {
				if (str.charAt(0) == find.charAt(0)) {
					String tmp = str.substring(0, find.length());

					if (tmp.equals(find)) {
						answer += 1;
						str = str.substring(find.length());
						continue;
					}
				}

				str = str.substring(1);
			}

			System.out.println("#" + tc + " " + answer);
		}
	}
}
