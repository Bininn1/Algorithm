import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       int N = in.nextInt();
       int count = 0;
       int num = 666;
       
       while(true) {
           if (String.valueOf(num).contains("666")){
               count++;
           }
           if (count == N) {
               System.out.println(num);
           
               break;
           }
           num++;
           
       }
    }
}
