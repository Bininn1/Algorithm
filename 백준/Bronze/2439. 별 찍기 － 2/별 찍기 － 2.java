import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for (int i = 0; i < N; i++) {
            
            for (int j = 0; j < N-i-1; j++){
                System.out.print(" ");
            }
            
            for(int k = 0; k <= i; k++) {
                System.out.print("*");
            }
         
            System.out.print("\n");
        }
    }
}