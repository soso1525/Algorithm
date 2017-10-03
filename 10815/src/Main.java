/*
	5
	6 3 2 10 -10
	8
	10 9 -5 2 3 4 5 -10 
 */

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedHashSet<Integer> ns = new LinkedHashSet<Integer>();

		while (n-- > 0)
			ns.add(sc.nextInt());

		int m = sc.nextInt();
		LinkedHashSet<Integer> ms = new LinkedHashSet<Integer>();

		while (m-- > 0)
			ms.add(sc.nextInt());

		Iterator it = ms.iterator();

		while (it.hasNext()) {
			if (ns.contains(it.next()))
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}

	}
}
