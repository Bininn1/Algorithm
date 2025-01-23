import java.util.*;


public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Deque<Integer> q = new LinkedList<>();
		
		
		int N = in.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
		    int X = in.nextInt();
		    
		    if (X == 1) {
		        int a = in.nextInt();
		        q.addFirst(a);
		    } else if (X == 2) {
		        int a = in.nextInt();
		        q.addLast(a);
		    } else if (X == 3) {
		        if(q.size() == 0) {
		            sb.append("-1\n");
		        } else {
		            sb.append(q.poll()).append("\n");
		        }
		    } else if (X == 4) {
		        if(q.size() == 0) {
		            sb.append("-1\n");
		        } else {
		            sb.append(q.pollLast()).append("\n");
		        }
		    } else if (X == 5) {
		        sb.append(q.size()).append("\n");
		    } else if (X == 6) {
		        if(q.size() == 0) {
		            sb.append("1\n");
		        } else {
		            sb.append("0\n");
		        }
		    } else if (X == 7) {
		        if(q.size() != 0) {
		            sb.append(q.peek()).append("\n");
		        } else {
		            sb.append("-1\n");
		        }
		    } else if (X == 8) {
		        if(q.size() != 0) {
		            sb.append(q.peekLast()).append("\n");
		        } else {
		            sb.append("-1\n");
		        }
		    }
		    
		}
		System.out.println(sb);
	}
}
