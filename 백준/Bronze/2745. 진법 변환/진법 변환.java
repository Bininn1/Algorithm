import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        
        String N = in.next();  // 계산할 숫자
        
        int B = in.nextInt(); // 진법 수
        
        int result = 0; // 결과값
        int idx = 0; // 승
        int num = 0; // 숫자
        
        for (int i = N.length()-1; i >= 0; i--) {
            char c = N.charAt(i);
            
            if(c >= '0' && c <= '9') {
                num = c - '0';
            } else {
                num = c - 55;
            }
            result +=  num * Math.pow(B, idx++);
            
        }
        System.out.print(result);
    }
}