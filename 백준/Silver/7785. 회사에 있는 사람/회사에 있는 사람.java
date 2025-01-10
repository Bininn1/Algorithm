import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args)  {
	    
	    
	    Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    in.nextLine();
	    
	    HashSet<String> set = new HashSet<>();
	    
	    for (int i = 0; i < N; i++) {
	        String[] input = in.nextLine().split(" ");
	        String name = input[0];
	        String action = input[1];
	        
	        if (action.equals("enter")) {
	            set.add(name);
	        } else if(action.equals("leave")){
	            set.remove(name);
	        }
	    }
	    
	    List<String> list = new ArrayList<>(set);
	    Collections.sort(list, Collections.reverseOrder());
	    
	    for (String name : list) {
	        System.out.println(name);
	    }
	    
	    
	}
 
}