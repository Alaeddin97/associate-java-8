public class TestOrderInitializes {

    //Rules:
    // Rule 1: call static initializers and static variables
    // Rule 2: call instance initializers
    // Rule 3: call constructors

    private String name="class";

    {
        System.out.println(name);
    }

    private static int COUNT;

    static {
        System.out.println(COUNT);
    }

    {
        COUNT=+10;
        System.out.println(COUNT);
    }

    public TestOrderInitializes(){
        System.out.println("constructor");
    }
}


















