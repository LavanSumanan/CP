package cp;

import java.io.*;
import java.util.*;

public class COCI_08_Contest6_4 {

	static int counter = 0;
	
	public static boolean possible(int zero, int one, int two) {
		if (
				( (one + two) > (zero) && 
				(zero + one) > (one) &&
				(zero + two) > (two) )
			||
				( (one + two) >= (zero-1) && (one == two) )
			)
			return true;
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> zeros = new ArrayList<Integer>();
		ArrayList<Integer> ones = new ArrayList<Integer>();
		ArrayList<Integer> twos = new ArrayList<Integer>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			list.add(num);
			if (num %3 == 0)
				zeros.add(num);
			else if (num%3 == 1)
				ones.add(num);
			else
				twos.add(num);
		}
		
		System.out.println(zeros.size() + " " + ones.size() + " " + twos.size());
				
		if (!possible(zeros.size(), ones.size(), twos.size())) {
			System.out.println("impossible");
			return;
		}
		
		/*int max = Math.max(zeros.size(), Math.max(ones.size(), twos.size()));
		if (max == zeros.size()) {
			
		} else if (max == ones.size()) {
			
		} else {
			
		}*/
		
		for (int i = 0; i < list.size()-1; i++) {
			
			if (list.get(i)%3 == 0 && list.get(i+1)%3 == 0) {
				int removed = list.get(i);
				list.remove(i);
				for (int j = 0; j < list.size()-1; j++) {
					if (list.get(j)%3!=0 && list.get(j+1)%3!=0) {
						list.add(j+1, removed);
						break;
					} else if (list.get(list.size()-1)%3!=0) {
						list.add(removed);
						break;
					}
				}
			} else if (list.get(i)%3 == 1 && list.get(i+1)%3 == 2) {
				int removed = list.get(i);
				list.remove(i);
				for (int j = 0; j < list.size()-1; j++) {
					if (list.get(j)%3!=2 && list.get(j+1)%3!=2) {
						list.add(j+1, removed);
						break;
					} else if (list.get(list.size()-1)%3!=2) {
						list.add(removed);
						break;
					}
				}
			} else if (list.get(i)%3 == 2 && list.get(i+1)%3 == 1) {
				int removed = list.get(i);
				list.remove(i);
				for (int j = 0; j < list.size()-1; j++) {
					if (list.get(j)%3!=1 && list.get(j+1)%3!=1) {
						list.add(j+1, removed);
						break;
					} else if (list.get(list.size()-1)%3!=1) {
						list.add(removed);
						break;
					}
				}
			}
			
			System.out.println("loop:");
			for (int j : list) {
				System.out.print(j + " ");
			}
			System.out.println();
			
		} // for loop
		
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

}
