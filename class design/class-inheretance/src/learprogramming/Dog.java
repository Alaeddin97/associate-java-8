package learprogramming;

import learprogramming.Animal;

public class Dog extends Animal {
     int name; // default modifier

    public Dog(){
        System.out.println("Dog"+name);
    }

    @Override // optional
    public void greeting() { // we can give it a higher access modifier
        super.greeting();
    }

    public String greeting(String welcomeWord){ // overload different signature
        return welcomeWord;
    }

    /*
    @Override
    void introduce(){
        super.introduce(); // can not override private of final method
    }
    */

}
