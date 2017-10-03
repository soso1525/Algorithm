/* 숫자와 콤마로 이루어진 문장에서 숫자 개수 구하기 */


import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			int cnt = 0;
			StringTokenizer token = new StringTokenizer(str, ",");
			cnt = token.countTokens();
			System.out.println(cnt);
		}
	}
}
