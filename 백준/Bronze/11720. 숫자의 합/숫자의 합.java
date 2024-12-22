import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result = 0;
        String S = in.next(); 

        for (int i = 0; i < N; i++) {
            result = result + (S.charAt(i) - '0'); 
        }
        System.out.print(result);
    }
}
