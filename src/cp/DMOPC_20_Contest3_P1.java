package cp;

import java.util.*;
import java.io.*;

public class DMOPC_20_Contest3_P1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		TreeSet<Integer> friends = new TreeSet<Integer>();
		for (int i = 0; i < N; i++) {
			friends.add(Integer.parseInt(st.nextToken()));
		}
		for (int i = 1; i <= N; i++) {
			if (!friends.contains(i)) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}

}
