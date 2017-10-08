package array_ladder;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static int[] dx = { 0, 0, 1 };
	public static int[] dy = { -1, 1, 0 };
	public static int n = 100;
	public static int[][] map = new int[n][n];

	public static void mapInit(Scanner sc) {
		sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
	}

	public static int play(int x, int y, boolean[][] check) {

		int nx = x;
		int ny = y;
		int cnt = 1;

		while (0 <= nx && nx < n && 0 <= ny && ny < n) {
			if (nx == n - 1)
				break;
			check[nx][ny] = true;
			for (int i = 0; i < 3; i++) {
				int tmpX = nx + dx[i];
				int tmpY = ny + dy[i];

				if (0 <= tmpX && tmpX < n && 0 <= tmpY && tmpY < n) {
					if (check[tmpX][tmpY] == false && map[tmpX][tmpY] >= 1) {
						nx = tmpX;
						ny = tmpY;
						break;
					}
				}
			}

			cnt++;

		}

		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			mapInit(sc);
			int answer = -1;
			int cnt = 1000;
			for (int i = 0; i < n; i++) {
				boolean[][] check = new boolean[n][n];
				if (map[0][i] == 1) {
					int tmp = play(1, i, check);
					if (cnt >= tmp) {
						cnt = tmp;
						answer = i;
					}
				}
			}

			System.out.println("#" + tc + " " + answer);
		}
	}
}
