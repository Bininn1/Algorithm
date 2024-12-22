import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt()%42;
        }
        
        for (int i = 0; i < arr.length; i++) {
            boolean is = true;
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    is = false;
                    break;
                }
            }
            if (is) {
                count ++;
            }
            
        }
        System.out.print(count);
    }
}