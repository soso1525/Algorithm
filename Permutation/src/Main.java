import java.util.Scanner;

public class Main {
	public static boolean next(int[] a) {

		int i = a.length - 1;

		while (i > 0 && a[i - 1] >= a[i])
			i--;

		if (i <= 0)
			return false;

		int j = a.length - 1;

		while (a[j] <= a[i - 1])
			j--;

		int tmp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = tmp;

		j = a.length - 1;
		while (i < j) {
			tmp = a[j];
			a[j] = a[i];
			a[i] = tmp;

			i++;
			j--;
		}

		return true;
	}

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}

		do {
			for (int x : a)
				System.out.print(x + " ");

			System.out.println();
		} while (next(a));
	}

}
