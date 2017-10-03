
/*
 * �ҹ���, �빮��, ����, ���� ���� ���� ���α׷�
 * 
 // input
	This is String
	SPACE    1    SPACE
	 S a M p L e I n P u T     
	0L1A2S3T4L5I6N7E81
	
 // output
	0 2 0 2
	0 10 1 8
	5 6 0 16
	0 8 9 0
	
	**** �Է¿� ���� ������ ���� ���� EOF�� ������ ������ 
	* �ڹٿ��� EOF�� while(sc.hasNextLine())
*/

import java.util.Scanner;

public class Main {
	public static void count(String str) {
		int small = 0, big = 0, num = 0, space = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				small++;

			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				big++;

			// if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				num++;

			if (str.charAt(i) == ' ')
				space++;
		}

		System.out.println(small + " " + big + " " + num + " " + space);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			count(str);
		}
	}
}
