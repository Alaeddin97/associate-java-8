package main;

import learprogramming.*;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Husky husky=new Husky();
        Rabbit rabbit=new Rabbit();
        rabbit.eatsPlants();
        Animal animal=new Rabbit();

        // polymorphic parameters
        printDetails(husky);
        printDetails(rabbit);
    }

    // polymorphic parameters: use different types derived from Animal
    public static void printDetails(Animal animal){
        System.out.println(animal);
    }
    // polymorphic parameters: return different types sub of Animal
    public static Animal returnAnySubToAnimal(String name){
        if(name.equals("rabbit"))
        return new Rabbit();
        else if(name.equals("dog"))
            return new Dog();
        else return new Cat();
    }
}
