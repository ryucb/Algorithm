package structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlipWord {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer repeat = Integer.parseInt(br.readLine());
		
		StringBuilder answer = new StringBuilder();
		
		for(int i=0; i<repeat; i++){
			
			StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                StringBuilder sb = new StringBuilder(st.nextToken());
                answer.append(sb.reverse() + " ");
            }
            answer.append("\n");
		}
		System.out.println(answer);
		
//		for(int i=0; i<repeat; i++){
//			for(String str: br.readLine().split(" ")) {
//				for(int j=str.length()-1; j>=0; j--) {
//					System.out.print(str.charAt(j));
//				}
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
	}
}
