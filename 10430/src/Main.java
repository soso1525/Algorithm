import java.util.Scanner;

/*
 * (a + b) mod M = ( (a mod M) + (b mod M) ) mod M
 * (a x b) mod M = ( (a mod M) * (b mod M) ) mod M
 * (a - b) mod M = ( (a mod M) - (b mod M) + M) mod M
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// (a + b) % c
		System.out.println((a + b) % c);

		// (a%c + b%c) % c
		System.out.println((a%c + b%c)%c);
		
		// (a * b) % c
		System.out.println((a*b)%c);
		
		// (a%c * b%c) % c
		System.out.println((a%c) * (b%c) % c);
	}
}
