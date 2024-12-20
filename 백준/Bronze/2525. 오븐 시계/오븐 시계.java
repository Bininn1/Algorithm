import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int R;
        
        R = B + C;
        if (R > 59){
            B = R % 60;
            A = (R / 60) + A;
        } else {
            B = R;
        }
        
        if (A >= 24) {
            A = A - 24;
        }
        System.out.println(A + " " + B);
    }
}