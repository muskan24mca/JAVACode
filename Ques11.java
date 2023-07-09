package Mock;

class Animal{
    void makeSound(){
        System.out.println("Sound of animal");
    }
}
class cow extends Animal{
    void makeSound(){
        System.out.println("Cow sound MOOOOes");
    }
}
class dog extends Animal{
    void makeSound(){
        System.out.println("Dog sound Bark bark");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("Cat sound Meowww");
    }
}

public class Ques11 {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.makeSound();

        cow obj1 = new cow();
        obj1.makeSound();
        
        
        dog obj11 = new dog();
        obj11.makeSound();

        
        cat obj12 = new cat();
        obj12.makeSound();
    }
}
