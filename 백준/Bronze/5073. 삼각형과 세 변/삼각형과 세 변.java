import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        
        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            
            if(a==0 && b==0 && c==0) {
                break;
            }
            
            if ((a>= b+c) || b >= a+c || c >= a + b){
                System.out.println("Invalid");
            } else if(a==b && b==c && c==a) {
                System.out.println("Equilateral");
            } else if (a==b || b==c || c==a) {
                System.out.println("Isosceles");
            } else if (a != b && b!=c && c!= a) {
                System.out.println("Scalene");
            } 
        
        
        }
    }
}