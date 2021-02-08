package cp;

import java.io.*;
import java.util.*;

public class FavoriteNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		TreeMap<Integer, Integer> nums = new TreeMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int key = Integer.parseInt(st.nextToken());
			if (nums.get(key) != null)
				nums.put(key, nums.get(key)+1);
			else
				nums.put(key, 1);
		}
		
		int Q = Integer.parseInt(br.readLine());
		for (int i = 0; i < Q; i++) {
			int numKey = Integer.parseInt(br.readLine());
			System.out.println(nums.higherKey(numKey-1) + " " + nums.get(nums.higherKey(numKey-1)));
		}
		
		
	}

}
