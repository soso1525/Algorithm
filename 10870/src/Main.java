import java.util.Scanner;

public class Main {
	public static int fibo(int n) {
		if(n<=1) return n;
		else {
			return fibo(n-1) + fibo(n-2);
		}
	}
	
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		System.out.println(fibo(n));
	}
}
