package cp;

import java.util.*;
import java.io.*;

public class CCC_15_S3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int G = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		TreeSet<Integer> availGates = new TreeSet<Integer>();
		for (int i = 1; i < 100001; i++) {
			availGates.add(i);
		}
		int total = 0;
		for (int i = 0; i < P; i++) {
			int gi = Integer.parseInt(br.readLine());
			if (availGates.lower(gi+1) != null) {
				total++;
				availGates.remove(availGates.lower(gi+1));
			} else {
				break;
			}
		}
		System.out.println(total);

	}

}