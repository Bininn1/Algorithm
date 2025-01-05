import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];
        
        for (int i = 0; i < n; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        
        int xmax = x[0];
        int xmin = x[0];
        
        int ymax = y[0];
        int ymin = y[0];
        
        for (int i = 0; i < x.length; i++) {
            if(xmax < x[i]) {
                xmax = x[i];
            }
            if(xmin > x[i]) {
                xmin = x[i];
            }
        }
        
        for (int i = 0; i < y.length; i++) {
            if(ymax < y[i]) {
                ymax = y[i];
            }
            if(ymin > y[i]) {
                ymin = y[i];
            }
        }
        int result = (xmax - xmin) * (ymax - ymin);
        System.out.print(result);
        
        
    }
}