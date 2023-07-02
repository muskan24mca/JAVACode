package Mock;
import java.util.*;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter series");
        int n;
        int sum = 0;
        int count = 0;
        do{
              n = sc.nextInt();
             if(n != 0){
            sum += n;
            count++;
             }
        }while(n != 0);

        if(count > 0){
            double average = (double)sum / (count );
            System.out.println("Average = " + average);
        }else{
            System.out.println("No numbers found");
        }
    }
}
