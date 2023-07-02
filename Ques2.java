package Mock;
import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number upto Faboniacc series");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
    
        for(int i = 0; i< n ;i++){
            System.out.print(a + " ");
              int c = a + b;
              a = b;
              b = c;
        }
        System.out.println(n);
    }
}
