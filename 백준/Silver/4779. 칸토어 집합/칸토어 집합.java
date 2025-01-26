import java.util.*;

public class Main {
    static int count = 0; 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int N = in.nextInt();
            
            int length = (int) Math.pow(3, N);
            char[] c = new char[length];
            
            Arrays.fill(c, '-');
            
            result(c, 0, length);
            
            System.out.println(new String(c));
        }
        
    }

    public static void result(char[] arr, int start, int length) {
        
        if (length == 1) {
            return;
        }
        
        int segment = length / 3;
        
        for (int i = start + segment; i < start + 2 * segment; i++) {
            arr[i] = ' ';
        }
        
        result(arr, start, segment);
        result(arr, start + 2 * segment, segment);
      
    }
}
