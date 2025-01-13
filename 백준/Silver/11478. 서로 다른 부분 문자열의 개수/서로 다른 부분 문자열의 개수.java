import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        
        HashSet<String> st = new HashSet<>();
        
       for (int i = 0; i < S.length(); i++) {
           StringBuilder sb = new StringBuilder();
           for (int j = i; j < S.length(); j++) {
               sb.append(S.charAt(j));
               st.add(sb.toString());
           }
       }
       System.out.print(st.size());
    }
}