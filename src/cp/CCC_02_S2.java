package cp;

import java.util.*;
import java.io.*;

public class CCC_02_S2 {

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int denom = Integer.parseInt(br.readLine());
		String output = "";
		if (num > denom) {
			output+=num/denom + " ";
			num%=denom;
		} else if (num == 0) {
			System.out.println("0");
			return;
		}
		
		if (num != 0)
			while (gcd(num, denom) != 1) {
				int factor = gcd(num, denom);
				num/=factor;
				denom/=factor;
//				System.out.println("test: " + num + "/" + denom);
			}
		
		if (num > 0 && denom > 1)
			output+=num+"/"+denom;
		
		System.out.println(output);
		
	}

}
