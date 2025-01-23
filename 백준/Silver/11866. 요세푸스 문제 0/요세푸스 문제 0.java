import java.util.*;


public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Queue<Integer> q = new LinkedList<>();
		
		
		int N = in.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		
		for (int i = 1; i <= N; i++) {
		    q.offer(i);
		}
		
		int K = in.nextInt();
		
		while(q.size() > 1) {
		    for (int i = 0; i < K - 1; i++) {
		        int a = q.poll();
		        q.offer(a);
		    }
		    
		    sb.append(q.poll()).append(", ");
		    
		}
		sb.append(q.poll()).append('>');
		System.out.println(sb);
		
		
	}
}
