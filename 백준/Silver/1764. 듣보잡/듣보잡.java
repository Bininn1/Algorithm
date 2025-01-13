import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        in.nextLine();
        int count = 0;
        
        HashSet<String> noheard = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            noheard.add(in.nextLine());
        }
        
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 0; i < M; i++) {
            String name = in.nextLine();
            if(noheard.contains(name)) {
                count++;
                result.add(name);
            }
        }
        Collections.sort(result);
        System.out.println(count);
        
        for (String name : result) {
            System.out.println(name);
        }
    }
}