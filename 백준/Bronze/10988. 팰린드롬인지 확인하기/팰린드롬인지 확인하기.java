import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String S = in.nextLine();
        int len = S.length();
        int a = 1;
        for (int i = 0; i < len; i++) {
            if(S.charAt(i) != S.charAt(len-i-1)) {
                a = 0;
            }
        }
        System.out.print(a);
    }
}