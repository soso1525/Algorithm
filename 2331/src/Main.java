/*
 * ���� ��� A=57, P=2�� ��, 
 * ���� D�� {57, 74(=5^2+7^2=25+49), 65, 61, 37, 58, 89, 145, 42, 20, 4, 16, 37, ��}�� �ȴ�.
 * �� �ڿ��� �ռ� ���� ����(57���Ͱ� �ƴ϶� 58����)�� �ݺ��ȴ�.
 * ù° �ٿ� �ݺ��Ǵ� �κ��� �������� ��, ������ ���� �Ǵ� ������ ������ ����Ѵ�.
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