import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static boolean[] check;
	public static ArrayList<Integer>[] a;

	public static void dfs(int start) {
		if (check[start])
			return;

		check[start] = true;
		System.out.print(start + " ");
		for (int x : a[start])
			dfs(x);
	}

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		check[start] = true;

		while (!q.isEmpty()) {
			int x = q.remove();
			System.out.print(x + " ");
			for (int y : a[x]) {
				if (check[y] == false) {
					check[y] = true;
					q.add(y);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int start = sc.nextInt();

		a = (ArrayList<Integer>[]) new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			a[u].add(v);
			a[v].add(u);
		}

		for (int i = 1; i <= n; i++) {
			Collections.sort(a[i]);
		}

		check = new boolean[n + 1];
		dfs(start);
		System.out.println();
		Arrays.fill(check, false);
		bfs(start);
	}
}
