import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        int [] arr = new int[T];
        for(int i = 0; i < T; i++) {
            arr[i] = in.nextInt();
        }
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;
        
        for (int i = 0; i < T; i++){
            int quarter = arr[i] / q;
            int dime = (arr[i] % q) / d;
            int nickel = ((arr[i] % q) % d) / n;
            int penny = (((arr[i] % q) % d) % n) / p;
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
