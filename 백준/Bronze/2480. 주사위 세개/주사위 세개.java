import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int R = 0;
        
        if(A == B && A == B && B == C) {
            R = 10000 + (A*1000);
        } else if (A == B || A == C) {
            R = 1000 + (A*100);
        } else if (B == C) {
            R = 1000 + (B*100);
        } else {
            R = Math.max(A, Math.max(B, C))*100;
        }
        System.out.println(R);
    }
}