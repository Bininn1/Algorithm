import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        
        int count = 1;
        
        int range = 2;
        
        while (range <= N) {
            range += 6*count;
            count++;
        }
        
        
        System.out.print(count);
        
        
    }
}
