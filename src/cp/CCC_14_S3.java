package cp;

import java.util.*;
import java.io.*;

public class CCC_14_S3 {

//	StringTokenizer st = new StringTokenizer(br.readLine());
	
	public static void main(String[] args) throws IOException {
	
		int T = readInt();
		for (int tests = 0; tests < T; tests++) {
			int N = readInt();
			Stack<Integer> start = new Stack<Integer>();
			Stack<Integer> mid = new Stack<Integer>();
			Stack<Integer> end = new Stack<Integer>();
			for (int i = 0; i < N; i++) {
				start.push(readInt());
			}
			
			int counter = 1;
			while (counter < N || start.isEmpty() && mid.peek() != counter) {
				if (!start.isEmpty() && start.peek() == counter) {
					end.push(start.pop());
					counter++;
				} else if (!mid.isEmpty() && mid.peek() == counter) {
					end.push(mid.pop());
					counter++;
				} else {
					if (start.isEmpty()) {
						break;
					}
					mid.push(start.pop());
				}
			}
			
			if (counter == N) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
			
		}
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static int readInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}
	
}
