import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String S = in.nextLine();
        
        int [] arr = new int[26];
        int len = S.length();
        S = S.toUpperCase();

        for (int i = 0; i < len; i++) {
            char word = S.charAt(i);
            arr[word - 'A']++; 
        }
        
        
        int maxCount = -1;
        char els = '?';
        
        for (int i = 0; i < 26; i++) {
            if (arr[i] > maxCount) {
                maxCount = arr[i];
                els = (char) (i + 'A');
            } else if (arr[i] == maxCount) {
                els = '?';
            }
        }
        
        System.out.println(els);
    }
}