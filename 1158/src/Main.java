/* 조세퍼스 문제 
 * 예를 들어 (7, 3)-조세퍼스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> ans = new LinkedList<Integer>();

		for (int i = 1; i <= n; i++)
			q.add(i);

		while (!q.isEmpty()) {
			for (int i = 0; i < m - 1; i++) {
				q.add(q.poll());
			}

			ans.add(q.poll());
		}

		StringBuilder asb = new StringBuilder(ans.toString());
		asb.replace(0, 1, "<");
		asb.replace(asb.length() - 1, asb.length(), ">");

		System.out.println(asb);

	}
}