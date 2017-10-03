import java.util.Scanner;

public class Main {
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		while (tc-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int g = gcd(a, b);
			int answer = g * a / g * b / g;
			
			System.out.println(answer);
		}
	}
}
