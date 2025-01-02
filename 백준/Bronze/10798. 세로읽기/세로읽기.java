import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        
        String [] arr = new String[5];
        int max = 0;
        for (int i = 0; i < 5; i++){
            arr [i] = in.nextLine();
            max = Math.max(max, arr[i].length());
        }
        
        for (int i = 0; i < max; i++){
            for(int j = 0; j <5; j++) {
                if (i < arr[j].length()){
                System.out.print(arr[j].charAt(i));
            
                }
                }
            
        }
    }
}