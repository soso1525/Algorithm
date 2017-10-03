import java.util.Scanner;

/* 
 * �־��� ���ڵ� �� 2���� ��� ������ gcd ���� ���� ���ϴ� ����
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
		int tc = sc.nextInt();

		while (tc-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			int sum = 0;
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					sum += gcd(arr[i], arr[j]);
				}
			}
			
			System.out.println(sum);
		}
	}
}
