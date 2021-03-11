package cp;

import java.util.*;
import java.io.*;

public class CCC_96_S3 {
	
	public static void recurse(int n, int k, String ans) {
//		case 0, all n chars used up
		if (n == 0 && k == 0) {
			System.out.println(ans);
			return;
		}
//		case 1, all 1's used up
		if (k == 0) {
			for (int i = 0; i < n; i++) {
				ans += "0";
			}
			System.out.println(ans);
			return;
		}
//		case 2, n remaining chars, n == k required 1s
		if (n == k) {
			for (int i = 0; i < k; i++) {
				ans += "1";
			}
			System.out.println(ans);
			return;
		}
		recurse(n-1,k-1,ans+"1");
		recurse(n-1,k,ans+"0");
		return;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		for (int i=0;i<t;i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			System.out.println("The bit patterns are");
			recurse(n, k, "");
			System.out.println();
			
		}
		
	}

}
