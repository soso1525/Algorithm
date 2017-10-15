package kakao;

import java.util.ArrayList;
import java.util.Collections;

public class P2 {
	public static void main(String[] args) {
		int[] arr = {4, 1, 3, 2	};
		
		boolean answer = true;
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			a.add(arr[i]);
		}
		
		Collections.sort(a);
		for(int i=1; i<a.size(); i++) {
			if(a.contains(0)) answer = false;
			if(a.get(i) - a.get(i-1) != 1) answer = false;
		}
		
		System.out.println(answer);
	}
}
