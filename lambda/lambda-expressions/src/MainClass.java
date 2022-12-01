import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        Animal animal=new Animal("dog",true,false);
        Animal animal1=new Animal("fish",false,true);

        List<Animal>animals=new ArrayList<>();
        animals.add(animal);
        animals.add(animal1);

        printUsePredicate(animals,animal2 -> animal2.canJump());
        print(animals,animal2 -> animal2.canJump());

        List<String>strings=new ArrayList<>();
        strings.add("jhon");
        strings.add("aladin");
        strings.add("grigori");
        strings.add("mamadou");
        System.out.println(strings);

        strings.removeIf(s -> s.equals("jhon"));
        System.out.println(strings);
    }

    public static void print(List<Animal>animals,Check check){
        for (Animal animal:animals) {
            if(check.checkAnimal(animal)){
                System.out.println(animal.name);
            }
        }
    }

    public static void printUsePredicate(List<Animal>animals, Predicate<Animal>check){
        for (Animal animal:animals) {
            if(check.test(animal)){
                System.out.println(animal.name);
            }
        }
    }
}
