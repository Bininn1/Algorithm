import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();

        boolean[] arr= new boolean[N + 1];
        
        Arrays.fill(arr, true);
        
        arr[0] = false;
        arr[1] = false;
        
        for(int i = 2; i * i <= N; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= N; j += i) {
                    arr[j] = false;
                }
            }
        }
        
        for (int i = M; i <= N; i++) {
            if(arr[i] == true) {
                System.out.println(i);
            }
        }
    }
}