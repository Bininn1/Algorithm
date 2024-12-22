import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int [] arr = new int[N];
    
    for (int i = 0; i < N; i++){
        arr[i] = i+1;
    }
    for(int j = 0; j < M; j++) {
        int temp = 0;
        int k = in.nextInt();
        int l = in.nextInt();
        
        temp = arr[k-1];
        arr[k-1] = arr[l-1];
        arr[l-1] = temp;
    }
    for(int u = 0; u < N; u++) {
        
        System.out.print(arr[u] + " ");

    }
}}