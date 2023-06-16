import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer repeat = Integer.parseInt(br.readLine());
		
		StringBuilder answer = new StringBuilder();
		
		for(int i=0; i<repeat; i++){
			
			StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                StringBuilder sb = new StringBuilder(st.nextToken());
                answer.append(sb.reverse() + " ");  //각 단어를 뒤집고 answer에 붙이기
            }
            answer.append("\n");
		}
		System.out.println(answer);
	}

}
