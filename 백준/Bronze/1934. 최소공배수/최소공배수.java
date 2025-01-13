import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        for (int i = 0; i < T; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int result = ex(a, b);
            
            System.out.println((a*b)/result);
        }
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