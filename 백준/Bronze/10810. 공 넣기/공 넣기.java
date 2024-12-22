import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        
        int [] arr = new int[N];
        
        for (int q = 0; q < M; q++) {
            int i = in.nextInt();
            int j = in.nextInt();
            int k = in.nextInt();
            
            for (int p = i-1; p <= j-1; p++) {
                arr[p] = k;
            }
            
        }
        for(int l = 0; l < N; l++){
            System.out.print(arr[l]+ " ");
        }
    }
}