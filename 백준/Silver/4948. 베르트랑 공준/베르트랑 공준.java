import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        while(true) {
            int N = in.nextInt();
            int count = 0;
            
            if (N == 0) {
                break;
            }
            
            for (int i = N + 1; i <= 2 * N; i++) {
                if (arr(i)) {
                    count++;
                }
            }
            
            
            System.out.println(count);
            
        }
    }
    
    public static boolean arr(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
            
        }
        return true;
    }

}