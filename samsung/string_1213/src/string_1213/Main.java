package string_1213;

public class Main {
	public static void main(String[] args) {
		String str = "hihellohilovehiapplehibanana";
		String find = "hi";

		int answer = 0;

		while (str.length() > find.length()) {
			if (str.charAt(0) == find.charAt(0)) {
				String tmp = str.substring(0, find.length());
				if (tmp.equals(find)) {
					answer += 1;
					str = str.substring(find.length());
				}
			}
			str = str.substring(1);
		}

		System.out.println(answer);

	}
}