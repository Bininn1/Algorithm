import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();  // 계산할 숫자
        
        int B = in.nextInt(); // 진법 수
        
        String result = ""; // 결과값
        
        while (N > 0) {
            int num = N % B;
            if (num >= 10) {
                result += (char) (num +55);
            } else {
                result += num;
            }
            N /= B;
        }
        for (int i=result.length()-1; i >=0; i--) {
            System.out.print(result.charAt(i));
        }
    }
}
