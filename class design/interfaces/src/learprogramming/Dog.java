package learprogramming;

public class Dog extends Animal implements HasTail,Carnivore{

    public Dog(){
        System.out.println("Dog");
    }

    @Override // optional
    public void greeting() { // we can give it a higher access modifier
        super.greeting();
    }

    public String greeting(String welcomeWord){ // overload different signature
        return welcomeWord;
    }

    @Override
    public boolean isHasTail() {
        System.out.println("I have tail, I'm the dog");
        return true;
    }

    @Override
    public void HisCarnivore() {
        System.out.println("I am carnivore, I am the dog");
    }

    /*
    @Override
    void introduce(){
        super.introduce(); // can not override private of final method
    }
    */

}
