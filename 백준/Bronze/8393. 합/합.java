import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int r = 0;
        for(int i = 1; i <= n; i++) {
            r = r + i;
        }
        System.out.println(r);
    }
}