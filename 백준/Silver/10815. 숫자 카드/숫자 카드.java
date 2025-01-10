import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args)  {
	    
	    
	    Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    
	    HashSet<Integer> set = new HashSet<>();
	    
	    for (int i = 0; i < N; i++) {
	        set.add(in.nextInt());
	    }
	    int M = in.nextInt();
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for (int i = 0; i < M; i++) {
	        if (set.contains(in.nextInt())) {
	            sb.append("1 ");
	        } else {
	            sb.append("0 ");
	        }
	    }
	    System.out.println(sb.toString());
	}
 
}
