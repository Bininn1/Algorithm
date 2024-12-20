import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        N = N / 4;
        
        for (int i = 0; i < N; i++) {
            System.out.print("long "); 
        }
        System.out.println("int"); 
    }
}
