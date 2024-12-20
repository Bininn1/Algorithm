import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for(int i = 1; i <= x; i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println("Case #"+i+": "+(A+B));
        }
    }
}