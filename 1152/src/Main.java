
/* 단어 갯수 세는 문제 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int answer = 0;

		StringTokenizer token = new StringTokenizer(input, " ");
		while (token.hasMoreTokens()) {
			answer += 1;
			token.nextToken();
		}

		System.out.println(answer);
	}
}
