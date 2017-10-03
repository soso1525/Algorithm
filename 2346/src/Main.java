import java.util.Scanner;

public class Main {
	public static int check(int n, int cur) {
		if (cur < 0)
			return n - (-cur);
		else if (cur >= n)
			return cur - n;
		else
			return cur;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] b = new int[n];

		for (int i = 0; i < n; i++)
			b[i] = sc.nextInt();

		int cur = 0, cnt = 0, before = 0, pos = 0;
		while (cnt != n) {

			if (b[cur] != 0) {
				System.out.print((cur + 1) + " ");
				cnt++;

				pos = cur;
				before = b[cur];
				cur += b[cur];
				cur = check(n, cur);
				b[pos] = 0;

			} else {
				if (before < 0) {
					cur -= 1;
				} else {
					cur += 1;
				}
				
				cur = check(n, cur);
			}

		}
	}
}