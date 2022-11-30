package learprogramming;

public interface Herbivore {
     void hisHerbivore();
    //public static void hisNotCarnivore(); should have a body
    default void eatsPlants(){
        System.out.println("I am a herbivore, I eat plants");
    }

    public static void testStaticMethod(){
        System.out.println("I am static method within Herbivore interface");
    }
}
