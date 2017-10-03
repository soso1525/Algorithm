import java.util.Scanner;

/* 
 * 진법 변환 >> 10부터 A로 바꿔서 출력
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();

		StringBuilder sb = new StringBuilder();

		do {
			int r = n % b;
			if (r > 9)
				sb.append((char) (r + 55));
			else
				sb.append(r);

			n /= b;
		} while(n != 0);

		System.out.println(sb.reverse().toString());

	}
}
