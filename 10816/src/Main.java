
/*	
 	10
	6 3 2 10 10 10 -10 -10 7 3
	8
	10 9 -5 2 3 4 5 -10
	
	output>> 3 0 0 1 2 0 0 2 
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		TreeMap<Integer, Integer> nc = new TreeMap<Integer, Integer>();

		while (n-- > 0) {
			int tmp = sc.nextInt();
			if (!(nc.containsKey(tmp))) {
				nc.put(tmp, 1);
			} else {
				nc.put(tmp, nc.get(tmp) + 1);
			}
		}

		int m = sc.nextInt();
		LinkedList<Integer> mc = new LinkedList<Integer>();
		while (m-- > 0)
			mc.add(sc.nextInt());

		Iterator it = mc.iterator();

		while (it.hasNext()) {
			int cur = (int) it.next();
			if (nc.containsKey(cur))
				System.out.print(nc.get(cur) + " ");
			else
				System.out.print("0 ");
		}
	}
}
