package Mock;
import java.util.*;

public class Ques4 {
    public static void main(String[] args) {
        int a = 10;
        int  b= 5;
        int c = 30;
        if(a >= b){
            if(a >= c){
             System.out.println("Largest is a " + a);
            }else{
             System.out.println("Largest is c " + c );
            }
        } else{
           if(b >= c){
             System.out.println("Largest is b " + b);
           }else{
            System.out.println("Largest is c " + c);
           }
        }
    }
}
