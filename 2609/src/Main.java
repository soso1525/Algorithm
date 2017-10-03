import java.util.Scanner;

/*
 * Euclidean algorithm >> GCD(a,b) = GCD(b, a%b)
 *  >>> int lcm = GCD(a,b) * (a / GCD(a,b)) * (b / GCD(a,b))
 */



public class Main {
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int g = gcd(a, b);
		int l = g * (a / g) * (b / g);

		System.out.println(g + "\n" + l);

	}
}