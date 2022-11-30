

public class Dog {
    private String name;
    private int height;
    private int weight;


    public Dog(String name){
        this(name,10); // should be the first non-commented line of code inside this constructor
        System.out.println("constructor 1");
    }

    public Dog(String name,int height){
        this(name,height,50);
        System.out.println("constructor 2");
    }

    public Dog(String name,int height,int weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
        System.out.println("constructor 3");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void Dog(){
        System.out.println("Same name as class with void as return type");
    }
}
