import java.util.ArrayList;
import java.util.Stack;

public class Main3 {
	public static void main(String[] args) {
		// String[] strs = { "app", "ap", "p", "l", "e", "ple", "pp" };
		// String t = "apple";

		String[] strs = { "ba", "na", "n", "a" };
		// String[] strs = { "ba", "an", "nan", "ban", "n" };
		String t = "banana";
		String tmp = t;

		int max = strs[0].length();

		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < strs.length; i++) {
			a.add(strs[i]);
			if (max < strs[i].length())
				max = strs[i].length();
		}

		Stack<String> st = new Stack<String>();

		if (t.length() < max)
			max = t.length();

		int cnt = 0;

		while (tmp.length() != 0) {
			cnt = 0;
			for (int i = 1; i <= max; i++) {
				st.push(tmp.substring(0, i));
				if (a.contains(st.peek())) {
					tmp = tmp.substring(i);
					cnt++;
					if (tmp.length() < max)
						max = tmp.length();
				} else {
					st.pop();
				}
			}
		}

		System.out.println(cnt);
		for (String s : st)
			System.out.println(s);
	}
}
