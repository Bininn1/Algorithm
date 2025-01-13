import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        in.nextLine();
        
        int countA = N;
        int countB = M;
        int ex = 0;
        
        HashSet<Integer> a = new HashSet<>();
        
        HashSet<Integer> b = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            a.add(in.nextInt());
        }
        
        for (int i = 0; i < M; i++) {
            int number = in.nextInt();
            b.add(number);
            if(a.contains(number)) {
                countA--;
                ex++;
            } 
        }
        
        
        
        System.out.println(countA + countB - ex);
        
        
        
    }
}