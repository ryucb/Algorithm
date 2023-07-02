package structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket {

public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer repeat = Integer.parseInt(br.readLine());
		
		for(int i=0; i<repeat; i++) {
			
			Stack<String> stack = new Stack<>();
			
			String[] brackets = br.readLine().split("");
			
			for(String bracket : brackets) {
				
                if(bracket.equals("(")) {
                	stack.push("(");
				}else if(stack.empty()){
					stack.push("");
					break;
				}else {
					stack.pop();
				}
            }	
			if (stack.empty()) {
				System.out.println("YES");
			} 
			else {
				System.out.println("NO");
			}
		}
	}
}
