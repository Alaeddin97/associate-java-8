package learprogramming;

public class Rabbit extends Animal implements Herbivore{
    //should define a default constructor in Animal

    public Rabbit(){
       // super; does not compile
       // super().greeting(); does not compile
    }

    @Override
    public void hisHerbivore() {
        System.out.println("I am herbivore, I am penny the rabbit");
    }

    @Override
    public void eatsPlants() {
        Herbivore.super.eatsPlants(); // can override default method in interfaces
    }
}
