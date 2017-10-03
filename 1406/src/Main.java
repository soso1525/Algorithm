import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Character> word = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++)
			word.add(str.charAt(i));

		int cur = word.size();

		int n = sc.nextInt();

		while (n-- > 0) {
			switch (sc.next().charAt(0)) {
			case 'L': {
				if (cur != 0)
					cur -= 1;

				break;
			}
			case 'D': {
				if (cur != word.size())
					cur += 1;

				break;
			}
			case 'B':
				if (cur != 0) {
					cur -= 1;
					word.remove(cur);
				}

				break;
			case 'P': {
				char c = sc.next().charAt(0);
				word.add(cur, c);
				cur += 1;
				break;
			}
			default:
				break;
			}
		}

		for (char c : word)
			System.out.print(c);
	}
}