/*
 	input >> baekjoon
 	
 	output >> »çÀü¼ø
	aekjoon
	baekjoon
	ekjoon
	joon
	kjoon
	n
	on
	oon
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();

		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			al.add(s.substring(i));
		}

		Collections.sort(al);
		for(String str : al) 
			System.out.println(str);
	}
}
