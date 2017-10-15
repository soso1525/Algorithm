package kakao;

public class P1 {
	public static void main(String[] args) {
		int n = 123;

		int answer = 0;
		String num = n + "";
		for (int i = 0; i < num.length(); i++) {
			String c = num.charAt(i) + "";
			answer += Integer.parseInt(c);
		}

		System.out.println(answer);
	}
}
