import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int totalarea = 0; // 총 넓이
        
        boolean[][] grid = new boolean[100][100];
        
        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            
            for(int j = x; j < x+10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!grid[j][k]) {
                        grid[j][k] = true;
                        totalarea++;
                    }
                }
            }
        }
        System.out.print(totalarea);
        
    }
}