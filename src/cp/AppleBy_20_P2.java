package cp;

import java.io.*;
import java.util.*;

public class AppleBy_20_P2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		HashMap<Long, Long> dough = new HashMap<Long, Long>();
		while (st2.hasMoreTokens()) {
			long num = Long.parseLong(st2.nextToken());
			//			***********
			if (dough.containsKey(num))
				dough.put(num, dough.get(num) + 1);
			else
				dough.put(num, (long)1);
		}

		for (int i = 0; i < q; i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			int operation = Integer.parseInt(st3.nextToken());
			long gram = Long.parseLong(st3.nextToken());
			if (operation == 1) {
				//				***********
				if (dough.containsKey(gram)) {
					Long count = dough.get(gram);
					dough.put(gram, (long)0);
					//						***********
					double div = gram*1.0/2;
					long key1 =(long)Math.floor(div);
					long key2 =(long)Math.ceil(div);
					if (dough.containsKey(key1))
						dough.put(key1, dough.get(key1)+count);
					else
						dough.put(key1, count);
					//							***********
					if (dough.containsKey(key2))
						dough.put(key2, dough.get(key2)+count);
					else
						dough.put(key2, count);
				}
				//				System.out.println("ooga");
				//				for (Map.Entry<Long, Integer> entry: dough.entrySet()) {
				//					System.out.println(entry);
				//				}
			} else {
				//				***********
				if (dough.containsKey(gram))
					System.out.println(dough.get(gram));
				else
					System.out.println(0);
			}
		}
		//		for (Map.Entry<Long, Integer> entry: dough.entrySet()) {
		//			System.out.println(entry);
		//		}

	}

}
