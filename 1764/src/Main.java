import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();

		LinkedHashSet<String> no = new LinkedHashSet<String>();
		LinkedList<String> result = new LinkedList<String>();

		while (n-- > 0)
			no.add(sc.nextLine());
		while (m-- > 0) {
			String name = sc.nextLine();
			if (no.contains(name))
				result.add(name);
		}

		Collections.sort(result);
		System.out.println(result.size());
		for (String s : result)
			System.out.println(s);
	}
}
