import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] color = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < 10; i++) {
			map.put(color[i], i);
		}

		String key1 = sc.nextLine();
		String key2 = sc.nextLine();
		String key3 = sc.nextLine();

		long value = map.get(key1) * 10 + map.get(key2);
		value = value * (long) Math.pow(10, map.get(key3));
		System.out.println(value);
	}
}
