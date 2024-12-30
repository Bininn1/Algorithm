import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        
        double result = 0;
        double creditsum = 0;
        char c;
        
        
        for (int i = 0; i < 20; i++) {
            double grade = 0;
            double credit = 0;
            String [] arr = in.nextLine().split(" ");
            credit += Double.parseDouble(arr[1]);
            c = arr[2].charAt(0);
            
            switch(c) {
                case 'A' :
                    if (arr[2].charAt(1) == '+') {
                        grade = 4.5;
                        break;
                    } else {
                        grade = 4.0;
                        break;
                    }
                case 'B' :
                    if(arr[2].charAt(1) == '+'){
                        grade = 3.5;
                        break;
                    } else {
                        grade = 3.0;
                        break;
                    }
                case 'C' :
                    if(arr[2].charAt(1) == '+'){
                        grade = 2.5;
                        break;
                    } else {
                        grade = 2.0;
                        break;
                    }
                case 'D' :
                    if(arr[2].charAt(1) == '+'){
                        grade = 1.5;
                        break;
                    } else {
                        grade = 1.0;
                        break;
                    }
                case 'F' :
                    grade = 0.0;
                    break;
                case 'P' :
                    credit = 0.0;
                    grade = 0.0;
                    break;
                
            }
            result += grade * credit;
            creditsum = creditsum + credit;
            
        }
        System.out.print(result/creditsum);
    }
}