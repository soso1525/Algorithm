/* stack ±¸Çö */
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String order = sc.next();
			switch (order) {
			case "push": {
				int x = sc.nextInt();
				s.push(new Integer(x));
				continue;
			}
			case "pop": {
				if (s.isEmpty())
					System.out.println(-1);
				else
					System.out.println(s.pop());
				continue;
			}
			case "size": {
				System.out.println(s.size());
				continue;

			}
			case "empty": {
				if (s.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				continue;

			}
			case "top": {
				if (s.isEmpty())
					System.out.println(-1);
				else
					System.out.println(s.peek());
				continue;
			}
			default:
				break;
			}
		}
	}
}