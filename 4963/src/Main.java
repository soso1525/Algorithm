/*
 * ���� ���� ���� ����
 * �밢�����ε� ����Ǿ������� �� �� ����
 * dx, dy ���� �ٲ��ָ� �Ǵ� �ǵ�
 * main�Լ� ������ ���� ���� ������ Ʋ�Ⱦ���
 * w==0 && h==0 �� �� ���� 
 * ���� �� ����� while(sc.hasNextLine())
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair {
	int x, y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	public static final int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
	public static final int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };

	public static void bfs(int[][] map, int[][] group, int x, int y, int cnt, int w, int h) {
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(x, y));
		group[x][y] = cnt;

		while (!q.isEmpty()) {
			Pair p = q.remove();
			x = p.x;
			y = p.y;

			for (int k = 0; k < 8; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];

				if (0 <= nx && nx < h && 0 <= ny && ny < w) {
					if (map[nx][ny] == 1 && group[nx][ny] == 0) {
						q.add(new Pair(nx, ny));
						group[nx][ny] = cnt;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();

			if (w == 0 && h == 0)
				break;

			int[][] map = new int[h][w];
			int[][] group = new int[h][w];
			int cnt = 0;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1 && group[i][j] == 0) {
						bfs(map, group, i, j, ++cnt, w, h);
					}
				}
			}

			System.out.println(cnt);
		}
	}
}
