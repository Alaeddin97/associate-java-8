package learprogramming;

public abstract class Animal {

    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
    protected void greeting(){
        System.out.println("Welcome !");
    }
    private void introduce(){
        System.out.println("The admin");
    }

    // public abstract static void run(); does not compile: can not define method both abstract and static
    // public abstract void run(){}; does not compile: can not define body for abstract method inside
    // the class where it is declared

    public abstract void printWeight();//must be implemented within all classes that extend Animal class

    public static void printName(){ // can have static method within abstract class : so that we can call
                                    // it without instantiate the class since it is abstract
        System.out.println("Name");
    }
}
