import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			StringTokenizer token = new StringTokenizer(str, ",");
			while (token.hasMoreTokens()) {
				sum += Integer.valueOf(token.nextToken());
			}
		}

		System.out.println(sum);
	}
}
