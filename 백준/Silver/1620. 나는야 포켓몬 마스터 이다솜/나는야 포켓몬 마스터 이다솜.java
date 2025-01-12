import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        in.nextLine();
        
        HashMap<String, Integer> name = new HashMap<>();
        HashMap<Integer, String> num = new HashMap<>();
        
        for(int i = 1; i <= N; i++) {
            String input = in.nextLine();
            
            name.put(input, i);
            num.put(i, input);
        }
        
        for (int i = 0; i < M; i++) {
            String answer = in.nextLine();
            
            if (answer.matches("\\d+")) {
                int number = Integer.parseInt(answer);
                System.out.println(num.get(number));
            } else {
                System.out.println(name.get(answer));
            }
        }
    }
}