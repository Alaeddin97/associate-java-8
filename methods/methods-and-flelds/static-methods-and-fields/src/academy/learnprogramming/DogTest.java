package academy.learnprogramming;

public class DogTest {

    public static void main(String[] args) {
        Dog dog=new Dog();
        System.out.println(dog.count); // it compiles but not the right way to call static (s)
        Dog.incrementCount();
        System.out.println(Dog.count); // this is the right way to call static variable

        Dog dog1=new Dog();
        dog1.count=10;
        System.out.println(dog.count); // will display 10 cos all instances share the same static value
    }
}
