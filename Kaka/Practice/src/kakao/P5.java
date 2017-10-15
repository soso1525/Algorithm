package kakao;

import java.util.Arrays;

public class P5 {
	public static int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
	public static int[][] dp = new int[land.length][4];

	public static int solve(int x, int y) {
		if (x == land.length)
			return 0;

		if (dp[x][y] != 0)
			return dp[x][y];

		for (int i = 0; i < 4; i++) {
			if (y == i)
				continue;
			dp[x][y] = Math.max(dp[x][y], solve(x + 1, i) + land[x][i]);
		}

		int ret = dp[x][y];

		return dp[x][y];
	}

	public static void main(String[] args) {
		int ans = 0;

		for (int i = 0; i < 4; i++) {
			ans = Math.max(ans, solve(0, i));
		}

		System.out.println(ans);
	}
}
