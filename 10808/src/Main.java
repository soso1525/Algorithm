import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String word = new Scanner(System.in).nextLine();
		int[] alpha = new int[26];

		for (int i = 0; i < word.length(); i++) {
			int n = word.charAt(i) - 97;
			alpha[n] += 1;
		}
		
		for (int i : alpha) 
			System.out.print(i + " ");
	}
}
