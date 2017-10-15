import java.util.ArrayList;

public class Main {
	public static String go(String t, ArrayList<String> a, int max, int[] cnt, StringBuilder[] sb, int i) {
		String tmp = t;
		if (tmp.length() < i)
			i = tmp.length();

		for (int j = 1; j <= max; j++) {
			if (a.contains(tmp.substring(0, i))) {
				cnt[i]++;
				sb[i].append(tmp.substring(0, i));
				go(tmp.substring(i), a, max, cnt, sb, i);
			}
		}
		return tmp;
	}

	public static void main(String[] args) {
		String[] strs = { "app", "ap", "p", "l", "e", "ple", "pp" };
		String t = "appleapple";

		// String[] strs = { "ba", "na", "n", "a" };
		// String[] strs = { "ba", "an", "nan", "ban", "n" };
		// String t = "banana";

		ArrayList<String> a = new ArrayList<String>();

		int max = strs[0].length();

		for (int i = 0; i < strs.length; i++) {
			a.add(strs[i]);
			if (max < strs[i].length())
				max = strs[i].length();
		}

		int[] cnt = new int[max + 1];
		StringBuilder[] sb = new StringBuilder[max + 1];
		for (int i = 1; i <= max; i++) {
			sb[i] = new StringBuilder();
		}

		for (int i = 1; i <= max; i++) {
			if (a.contains(t.substring(0, i)))
				System.out.println(go(t, a, max, cnt, sb, i));
		}

		for (StringBuilder s : sb)
			System.out.println(s);

		for (int n : cnt)
			System.out.println(n);
	}
}
