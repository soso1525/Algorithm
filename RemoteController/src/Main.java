import java.util.Scanner;

public class Main {

	public static boolean[] broken;

	public static int possible(int c) {
		if (c == 0) {
			if (broken[c])
				return 0;
			else
				return 1;
		}

		int len = 0;
		while (c > 0) {
			if (broken[c % 10])
				return 0;

			len += 1;
			c /= 10;
		}

		return len;
	}

	public static void main(String[] args) {
		broken = new boolean[10];

		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			broken[sc.nextInt()] = true;
		}

		int ans = target - 100;
		if (ans < 0)
			ans = -ans;

		for (int i = 0; i <= 1000000; i++) {
			int c = i;
			int len = possible(c);
			if (len > 0) {
				int press = c - target;
				if (press < 0)
					press = -press;

				if (ans > press + len)
					ans = press + len;
			}
		}

		System.out.println(ans);
	}
}
