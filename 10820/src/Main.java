
/*
 * 소문자, 대문자, 숫자, 공백 개수 세는 프로그램
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
	
	**** 입력에 대한 조건이 없을 때는 EOF를 만나기 전까지 
	* 자바에서 EOF는 while(sc.hasNextLine())
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
