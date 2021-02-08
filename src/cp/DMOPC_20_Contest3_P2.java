package cp;

import java.util.*;
import java.io.*;

class Pair {
	
	int first;
	int second;
	
	public Pair (int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	
	
}

public class DMOPC_20_Contest3_P2 {
	
	public static void findPairs() {
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int [][] a = new int[M][N];
		for (int i = 0; i < a.length; i++) {
			StringTokenizer notes = new StringTokenizer(br.readLine());
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Integer.parseInt(notes.nextToken());
			}
		}
		
		int kCount = 0;
		findPairs();
		
		/*
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		*/
		
	}

}
