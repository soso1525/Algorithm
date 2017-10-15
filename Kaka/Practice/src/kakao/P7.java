package kakao;

import java.util.ArrayList;

// strs배열안에 가장 긴 글 길이만큼씩 검사 -> 여기서는 app or ple = 3
// 3만큼 자른 후 길이가 3보다 크다면 3부터 다시 검토 그렇지 않으면 검토할 크기를 줄여가면서 check

public class P7 {
	public static void main(String[] args) {
		String[] strs = { "app", "ap", "p", "l", "e", "ple", "pp" };
		String t = "appleapple";

		// String[] strs = { "ba", "na", "n", "a" };
		// String[] strs = { "ba", "an", "nan", "ban", "n" };
		// String t = "banana";

		int max = 0, answer = 10000;
		boolean flag = false;

		ArrayList<String> a = new ArrayList<String>();

		for (int i = 0; i < strs.length; i++) {
			a.add(strs[i]);
			if (strs[i].length() > max)
				max = strs[i].length();
		}

		if (t.length() < max)
			max = t.length();

		for (int i = max; i > 0; i--) {
			int cnt = 1;
			StringBuilder sb = new StringBuilder();

			if (a.contains(t.substring(0, i))) {
				sb.append(t.substring(0, i));
				String tmp = t.substring(i);

				if (tmp.length() < max)
					max = tmp.length();

				while (tmp.length() != 0 && max > 0) {

					if (a.contains(tmp.substring(0, max))) {
						sb.append(tmp.substring(0, max));
						tmp = tmp.substring(max);
						cnt++;
					} else
						max--;

					if (tmp.length() < max)
						max = tmp.length();

					if (max == 0) {
						if (a.contains(tmp)) {
							sb.append(tmp);
							cnt++;
						}
					}
					System.out.println("hey: " + sb);
				}

				if (sb.toString().equals(t)) {
					flag = true;
					System.out.println(sb);
					if (answer > cnt)
						answer = cnt;
				}
			}
		}

		if (!flag)
			answer = -1;

		System.out.println(answer);
	}
}
