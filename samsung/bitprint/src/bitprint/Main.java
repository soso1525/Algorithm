package bitprint;

public class Main {
	public static void printBit(int n) {
		StringBuilder sb = new StringBuilder();

		for (int i = 7; i >= 0; i--) {
			if ((int) Math.pow(2, i) <= n) {
				sb.append("1");
				n -= (int) Math.pow(2, i);
			} else
				sb.append("0");
		}

		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		for(int i=0; i<=15; i++) {
			printBit(i);
		}
	}
}
