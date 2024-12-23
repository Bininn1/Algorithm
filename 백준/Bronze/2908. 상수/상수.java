import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int rev = 0;
        int rev2 = 0;
        while(A!=0) {
            rev = rev*10 + A%10;
            A /= 10;
        }
        while(B!=0) {
            rev2 = rev2*10 + B%10;
            B /= 10;
        }
        if(rev > rev2) {
            System.out.print(rev);
        } else {
            System.out.print(rev2);
        }
        
    }
}