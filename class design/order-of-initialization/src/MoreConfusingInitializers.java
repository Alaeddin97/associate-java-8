public class MoreConfusingInitializers {

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
    static{
        new MoreConfusingInitializers();
    }

    public MoreConfusingInitializers(){
        System.out.println("constructor >> more confusing ");
    }
}
