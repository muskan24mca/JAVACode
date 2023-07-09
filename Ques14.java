package Mock;
import java.util.*;

interface Drawable{
    void draw();
}

class Circle implements Drawable{
     @Override
   public void draw(){
    System.out.println("Draw Circle...");
   }
}
class rectangle implements Drawable{
     @Override
   public void draw(){
    System.out.println("Draw rectangle...");
   }
}
public class Ques14 {
    public static void main(String[] args) {
        Drawable d = new rectangle();
        d.draw();
    }
}
