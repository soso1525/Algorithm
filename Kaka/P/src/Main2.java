import java.util.ArrayList;

public class Main2 {

	public static String str;

	public static int go(StringBuilder sb, String t, ArrayList<String> a, int max, int pos) {

		int cnt = 1;

		if (t.length() < max)
			max = t.length();

		if (sb.toString().equals(str))
			cnt = 1;

		for (int i = 1; i <= max; i++) {
			if (a.contains(t.substring(0, i))) {
				sb.append(t.substring(0, i));
				cnt++;
				System.out.println(sb);
				go(sb, t.substring(i), a, max, i);
			}
		}

		if (sb.toString().equals(str))
			return cnt;
		else
			return -1;

	}

	public static void main(String[] args) {
		String[] strs = { "app", "ap", "p", "l", "e", "ple", "pp" };
		String t = "apple";

		str = t;

		int max = strs[0].length();

		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < strs.length; i++) {
			a.add(strs[i]);
			if (max < strs[i].length())
				max = strs[i].length();
		}

		if (t.length() < max)
			max = t.length();

		int answer = 1000;

		for (int i = 1; i <= max; i++) {
			StringBuilder sb = new StringBuilder();
			if (a.contains(t.substring(0, i))) {
				sb.append(t.substring(0, i));

				System.out.println(sb);

				if (answer > go(sb, t.substring(i), a, max, i))
					answer = go(sb, t.substring(i), a, max, i);
			} else
				continue;
		}

		System.out.println(answer);
	}
}
