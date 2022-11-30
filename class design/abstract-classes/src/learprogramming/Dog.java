package learprogramming;

public class Dog extends Animal {
    public Dog(){
        System.out.println("Dog");
    }

    @Override // optional
    public void greeting() { // we can give it a higher access modifier
        super.greeting();
    }

    @Override
    public void printWeight() {
        System.out.println("no declared weight here within "+Dog.class.getName());
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
