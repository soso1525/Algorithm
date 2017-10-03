import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		String s4 = sc.next();
		
		int n1 = Integer.valueOf(s1 + s2);
		int n2 = Integer.valueOf(s3 + s4);
		System.out.println(n1 + n2);
	}
}
