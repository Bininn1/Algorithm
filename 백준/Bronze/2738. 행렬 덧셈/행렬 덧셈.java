import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int M = in.nextInt();
        
        int [][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        
        int [][] arr2 = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr2[i][j] = in.nextInt();
            }
        }
        
        int [][] arr3 = new int[N][M];
        
        for(int i = 0; i < N; i++){
            for (int j=0; j < M; j++) {
                 arr3[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr3[i][j] + " "); 
            }
            System.out.println(); 
        }
        
    }
}