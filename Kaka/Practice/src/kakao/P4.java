package kakao;

import java.util.LinkedList;
import java.util.Queue;

class Pair {
	int x, y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class P4 {
	public static final int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
	public static final int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

	public static void bfs(int[][] a, int sx, int sy) {

		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(sx, sy));

		while (!q.isEmpty()) {
			Pair p = q.remove();
			int x = p.x;
			int y = p.y;

			int num = 1;

			for (int i = 0; i < 8; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (0 <= nx && nx < a.length && 0 <= ny && ny < a[0].length) {
					if (a[nx][ny] == 1) {
						num ++;
						continue;
					}
				}
			}
		}
	}

	public static void main(String[] args) {

	}
}
