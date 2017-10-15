package kakao;

public class P3 {
	public static void main(String[] args) {
		int[][] v = { { 1, 4 }, { 3, 4 }, { 3, 10 } };
		int[] answer = {};

		int row = 3;
		int x, y;

		x = v[0][0];
		y = v[0][1];

		if (x != v[1][0]) {
			if (x == v[2][0])
				x = v[1][0];
		} else
			x = v[2][0];

		if (y != v[1][1]) {
			if (y == v[2][1])
				y = v[1][1];
		} else
			y = v[2][1];

		int[] tmp = { x, y };
		answer = tmp;

		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
}