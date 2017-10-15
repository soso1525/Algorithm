import java.util.ArrayList;
import java.util.Stack;

public class Main4 {
	public static ArrayList<String> a;

	public static void go(Stack st, String t, int max, int cnt) {
		if (t.length() < max)
			max = t.length();

		if (max == 0)
			cnt = 0;

		for (int i = 1; i <= max; i++) {
			st.push(t.substring(0, i));
			String tmp = t.substring(0, i);
			if (a.contains(st.peek())) {
				System.out.print(st.peek() + " / ");
				go(st, t.substring(i), max, cnt);
			} else {
				st.pop();
			}
		}
	}

	public static void main(String[] args) {
		String[] strs = { "app", "ap", "p", "l", "e", "ple", "pp" };
		String t = "apple";

		// String[] strs = { "ba", "na", "n", "a" };
		// String[] strs = { "ba", "an", "nan", "ban", "n" };
		// String t = "banana";
		String tmp = t;

		int max = strs[0].length();

		a = new ArrayList<String>();
		for (int i = 0; i < strs.length; i++) {
			a.add(strs[i]);
			if (max < strs[i].length())
				max = strs[i].length();
		}

		Stack<String> st = new Stack<String>();

		if (t.length() < max)
			max = t.length();

		go(st, t, max, 0);

	}
}
