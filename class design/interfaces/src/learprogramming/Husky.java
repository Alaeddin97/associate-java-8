package learprogramming;

public class Husky extends Dog {
    public Husky(){
        super(); // must be first statement
        System.out.println("learprogramming.Husky");
    }

    public Husky(String name){
        this();// must be first statement
        System.out.println("Name: "+name);
    }

}
