import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		String result = "Nice";
		Stack<Integer> st = new Stack<>();
		Queue <Integer> q = new LinkedList<>();
		for (int i = 0; i < N; i++) {
		    int T = in.nextInt();
		    
		    q.offer(T);
		}
		
		int start = 1;
		
		while(!q.isEmpty()) {
		    if(q.peek() == start) {
		        q.poll();
		        start++;
		    } else if (!st.isEmpty() && st.peek() == start) {
		        st.pop();
		        start++;
		    } else {
		        st.push(q.poll());
		    }
		}
		
		while(!st.isEmpty()) {
		    if(st.peek() == start) {
		        st.pop();
		        start++;
		    } else {
		        result = "Sad";
		        break;
		    }
		}
		
		System.out.println(result);
	}
	
 
}