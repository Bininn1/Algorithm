import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [] arr = new int[9];
        
        for(int i = 0; i < 9; i++) {
            arr[i] = in.nextInt();
        }
        int count = 0;
        int max = arr[0];
        
        for (int i = 0; i < 9; i++) {
            if(max < arr[i]){
                max = arr[i];
                count = i;
            }
        }
        System.out.println(max);
        System.out.println(count+1);
    }
}