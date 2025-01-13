import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int A1 = in.nextInt();
        int B1 = in.nextInt();
        
        int A2 = in.nextInt();
        int B2 = in.nextInt();
        
        int resultA = ((A1 * B2)+(A2 * B1));
        int resultB = B1*B2;
        
        
        int last = ex(resultA, resultB);
        
        System.out.println(resultA/last + " " + resultB/last);
    }
    
    public static int ex(int a, int b) {
        int answer = 0;
        int min = 0;
        
        if (a <= b) {
            min = a;
        } else {
            min = b;
        }
        
        for (int i =1; i <=min; i++) {
            if(a%i == 0 && b % i == 0) {
                answer = i;
            }
        }
        return answer;
    }
    
}