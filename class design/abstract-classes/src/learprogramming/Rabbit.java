package learprogramming;

public class Rabbit extends Animal {
    //should define a default constructor in Animal

    public Rabbit(){
       // super; does not compile
       // super().greeting(); does not compile
    }

    @Override
    public void printWeight() {
        System.out.println("no declared weight here within "+Rabbit.class.getName());
    }
}
