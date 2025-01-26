import java.util.*;

public class Main {
    static int count = 0; 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();

        for (int i = 0; i < N; i++) {
            String S = in.nextLine();
            count = 0;
            System.out.println(isPalindrome(S) + " " + count);
        }
    }

    public static int isPalindrome(String S) {
        
        return recursion(S, 0, S.length() - 1);
    }

    public static int recursion(String S, int l, int r) {
        count++; 
        if (l >= r) {
            return 1;
        } else if (S.charAt(l) != S.charAt(r)) {
            return 0;
        } else {
            return recursion(S, l + 1, r - 1);
        }
    }
}
