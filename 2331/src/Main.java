/*
 * 예를 들어 A=57, P=2일 때, 
 * 수열 D는 {57, 74(=5^2+7^2=25+49), 65, 61, 37, 58, 89, 145, 42, 20, 4, 16, 37, …}이 된다.
 * 그 뒤에는 앞서 나온 수들(57부터가 아니라 58부터)이 반복된다.
 * 첫째 줄에 반복되는 부분을 제외했을 때, 수열에 남게 되는 수들의 개수를 출력한다.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p = sc.nextInt();

		while (true) {
			int sum = 0;
			int tmp = 0;

			al.add(a);

			while (a != 0) {
				tmp = a % 10;
				sum += (int) Math.pow(tmp, p);

				a /= 10;
			}

			a = sum;

			if (al.contains(sum))
				break;
		}

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) == a)
				System.out.print(i);
		}
	}
}