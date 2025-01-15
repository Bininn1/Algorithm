import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < k; i++) {
            int N = in.nextInt();
            if (N == 0) {
                st.pop();
            } else if (N != 0) {
                st.push(N);
            }
        }
        int result = 0;
        int y = st.size();
        for (int i = 0; i < y; i++) {
            result += st.pop();
        }
        
        System.out.print(result);
        
    }
}
