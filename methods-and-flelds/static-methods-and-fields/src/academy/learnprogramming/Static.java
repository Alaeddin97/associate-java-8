package academy.learnprogramming;

public class Static {
    private String name="Static";

    public static void one(){ }
    public static void tow(){
        one(); // can call static method inside static method
        //three();// can not call nonstatic method inside a static method
        // System.out.println(name); can not call nonstatic field inside a static method
        new Static().three(); // must create an instance in order to call static method

    }
    public void three(){
        one();// can call static inside non static method
        tow();
        System.out.println(name);
    }

}
