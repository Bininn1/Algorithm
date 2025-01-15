import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            String S = in.next();
            
            Stack<Character> st = new Stack<>();
            
            boolean is = true;
            
            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                
                if(c == '(') {
                    st.push(c);
                } else if (c == ')') {
                    if (st.isEmpty()) {
                        is = false;
                        break;
                    } else {
                        st.pop();
                    }
                }
                
            }
            if(is && st.isEmpty()) {
                    sb.append("YES").append("\n");
                } else {
                    sb.append("NO").append("\n");
                }
        }
        
        System.out.print(sb.toString());
        
        
        
    }
}
