import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int [] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }
        for(int k = 0; k < M; k++) {
            int i = in.nextInt()-1;
            int j = in.nextInt()-1;
            
            while(i < j) {
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
            
        }
        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
            
        }
    }
}