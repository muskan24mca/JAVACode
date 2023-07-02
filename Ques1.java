package Mock;
import java.util.*;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("Number is Zero");
        }else if(n > 0){
            System.out.println("Number is positive");
        }else if(n < 0){
            System.out.println("Number is negative");
        }
    }
}
