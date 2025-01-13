import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long a = in.nextLong();
        long b = in.nextLong();
        long result = ex(a, b);
            
        System.out.println((a*b)/result);
        
    }
    
    public static long ex(long a, long b) {
        long answer = 0;
        long min = 0;
        
        if (a <= b) {
            min = a;
        } else {
            min = b;
        }
        
        for (long i =1; i <=min; i++) {
            if(a%i == 0 && b % i == 0) {
                answer = i;
            }
        }
        return answer;
    }
}