import java.util.Scanner;
import java.util.Arrays;

public class Main {
    

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int [] arr = new int[5];
       int mid = 0;
       
       for (int i = 0; i < 5; i++) {
           arr[i] = in.nextInt();
       }
       
       Arrays.sort(arr);
       
       System.out.println((arr[0] + arr[1] + arr[2] + arr[3] + arr[4])/5);
       System.out.println(arr[2]);
       
     }
}

