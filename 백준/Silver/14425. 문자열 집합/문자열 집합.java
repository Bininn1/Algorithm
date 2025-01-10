import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args)  {
	    
	    
	    Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    
	    int M = in.nextInt();
	    
	    int count = 0;
	    
	    HashSet<String> set = new HashSet<>();
	    
	    for (int i = 0; i < N; i++) {
	        set.add(in.next());
	    }
	    
	    for (int i = 0; i < M; i++) {
	        if (set.contains(in.next())) {
	            count++;
	        }
	    }
	    
	    System.out.print(count);
	}
 
}