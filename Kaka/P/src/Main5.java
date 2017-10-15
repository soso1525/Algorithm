import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Main5 {
	public static ArrayList<String> a;

	public static void go(Deque q, String t, int max, int cnt) {
		if (t.length() < max)
			max = t.length();

		if (max == 0) {
			cnt = 0;
		}

		for (int i = 1; i <= max; i++) {
			q.push(t.substring(0, i));
			String tmp = t.substring(0, i);

			if (a.contains(q.peek())) {
				cnt++;
				System.out.print(q.peek() + " / ");
				go(q, t.substring(i), max, cnt);
			} else {
				q.pollLast();
			}
		}
	}

	public static void main(String[] args) {
		// String[] strs = { "app", "ap", "p", "l", "e", "ple", "pp" };
		// String t = "apple";

		String[] strs = { "ba", "na", "n", "a" };
		// String[] strs = { "ba", "an", "nan", "ban", "n" };
		String t = "banana";

		int max = strs[0].length();

		a = new ArrayList<String>();
		for (int i = 0; i < strs.length; i++) {
			a.add(strs[i]);
			if (max < strs[i].length())
				max = strs[i].length();
		}

		Deque<String> q = new LinkedList<String>();

		if (t.length() < max)
			max = t.length();

		go(q, t, max, 0);

	}
}
