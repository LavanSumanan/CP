package cp;

import java.util.*;
import java.io.*;

public class CCC_14_S2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		HashMap<String, String> names = new HashMap<String, String>();
		String [] keys = new String [N];
		String [] values = new String [N];
		StringTokenizer lineOne = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			keys[i] = lineOne.nextToken();
		}
		StringTokenizer lineTwo = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			values[i] = lineTwo.nextToken();
		}
		for (int i = 0; i < N; i++) {
			names.put(keys[i], values[i]);
		}

		int counter = 0;
		for (int i = 0; i < N; i++) {
//			System.out.println("value at key's value: " + names.get(names.get(keys[i])));
//			System.out.println("key: " + keys[i]);
			if (!keys[i].equals(names.get(keys[i])))
				if ((names.get(names.get(keys[i])).equals(keys[i]))) {
					counter++;
//					System.out.println("counter: " + counter);
				}
		}
		if (counter == N) {
			System.out.println("good");
		} else
			System.out.println("bad");


	}

}
