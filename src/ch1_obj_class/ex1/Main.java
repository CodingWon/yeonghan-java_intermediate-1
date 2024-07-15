package ch1_obj_class.ex1;

public class Main {
    public static void main(String[] args) {
        action(new Dog());
        action(new Car());
    }

    private static void action(Object obj){
        if(obj instanceof Car){
            ((Car) obj).move();
        }else if(obj instanceof Dog){
            ((Dog) obj).sound();
        }

    }
}
