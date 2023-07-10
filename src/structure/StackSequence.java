package structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer repeat = Integer.parseInt(br.readLine());
		
		StringBuilder answer = new StringBuilder();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int start = 0;
		
		while(repeat-- > 0) {
			
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
				
				for(int i=start+1; i<=value; i++) {
					stack.push(i);
					answer.append("+\n");
				}
				
				start = value;
				
			}else if(stack.peek() != value){
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			answer.append("-\n");
			
		}
		System.out.println(answer);
	}

}
