import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int H = in.nextInt();
        int M = in.nextInt();
        
        M = M - 45;
        
        if (H == 0) {
           if (M < 0){
               H = 23;
           } 
        } else {
            if (M < 0){
            H = H - 1;
            }
        }
        
        if (M < 0) {
            M = M + 60;
        }
        
        System.out.println(H + " " + M);
    }
}