package cp;

import java.io.*;
import java.util.*;

public class AppleBy_20_P1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= t; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			long one = Long.parseLong(st.nextToken());
			long two = Long.parseLong(st.nextToken());
			long three = Long.parseLong(st.nextToken());
			
			long a = 0, b = 0, c = 0;
			
			if (one > two && one > three) {
				a = two;
				b = three;
				c = one;
			} else if (two > one && two > three) {
				a = one;
				b = three;
				c = two;
			} else if (three > one && three > two) {
				a = one;
				b = two;
				c = three;
			} else {
				a = one;
				b = two;
				c = three;
			}
//			System.out.println(a + " " + b + " " + c);
			if (a*a + b*b == c*c) {
				System.out.println("R");
			} else {
				if (c*c > a*a + b*b) {
					System.out.println("O");
				} else {
					System.out.println("A");
				}
			}
			
		} //loop

	}

}
