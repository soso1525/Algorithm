/* ROT13 algo */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 'A' && c <= 'Z') {
				c += 13;
				if (c > 90) {
					c -= 26;
				}
			}
			
			if (c >= 'a' && c <= 'z') {
				c += 13;
				if (c > 122) {
					c -= 26;
				}
			} 
			
			System.out.print(c);
		}

		// 97 - 122
		// 65 - 90

	}
}
