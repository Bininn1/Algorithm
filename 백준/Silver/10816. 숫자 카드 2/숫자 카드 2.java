import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            int num = in.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int M = in.nextInt();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int answer = in.nextInt();
            sb.append(map.getOrDefault(answer,0)).append(" ");
        }
        
        System.out.println(sb.toString());
    }
}