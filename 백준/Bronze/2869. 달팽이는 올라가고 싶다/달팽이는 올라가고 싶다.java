import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int B = in.nextInt();
        int V = in.nextInt();
        int day = (V-B) / (A-B);
        
        if((V-B) % (A-B) != 0) {
            day++;
        }
        
        System.out.print(day);
    }
}
