import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] arr = new int[N];
        int max = 0;
        double result = 0;
        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < N; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        
        for (int i = 0; i < N; i++) {
            result += (double)arr[i]/max*100;
        }
       
        
        System.out.print(result/N);
    }
}