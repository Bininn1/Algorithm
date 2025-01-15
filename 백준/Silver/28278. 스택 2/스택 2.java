import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            int M = in.nextInt();
            
            if (M == 1) {
                int k = in.nextInt();
                st.push(k);
            } else if (M == 2) {
                if (st.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(st.pop()).append("\n");
                }
            } else if (M == 3) {
                sb.append(st.size()).append("\n");
            } else if (M == 4) {
                if (st.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if (M == 5) {
                if (st.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(st.peek()).append("\n");
                }
            }
        }
        System.out.print(sb.toString());
        
    }
}
