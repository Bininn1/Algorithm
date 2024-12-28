import java.util.Scanner;

public class Main {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int count = 0;
        int N = in.nextInt();
        in.nextLine();
        for(int i = 0; i < N; i++) {
            if(check() == true){
                count ++;
            }
        }
        System.out.print(count);
    }
    
    public static boolean check() {
        boolean [] arr = new boolean[26];
        int prev = 0;
        String S = in.nextLine();
        for (int i = 0; i < S.length(); i++) {
            int now = S.charAt(i);
            if(prev != now ) {
                if (arr[now-'a'] == false) {
                    arr[now -'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
            
        }
        return true;
    }
}
