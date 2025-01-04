import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int dot = 4;
        
        double a = 2;
        double result = 0;
        
        for(int i = 0; i < N; i++) {
            a += Math.pow(2, i);
            
        }
        result = Math.pow(a, 2);
        System.out.println((int)result);
    }
}
