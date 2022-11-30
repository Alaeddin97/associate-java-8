import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static final int SIZE;
    public static final int INITIALISED=3;
    public static final List<String>NAMES;
    public static int notFinal;

    static {
        System.out.println("FIRST STATIC INITIALIZER");
        SIZE=10;
        //INITIALISED=4; // does not compile : already initialised
        NAMES=new ArrayList<>();
        NAMES.add("TOM");
        NAMES.add("JERRY");
    }
    static {
        System.out.println("SECOND STATIC INITIALIZER");
        // SIZE=4; // already initialised inside the first static initializer
        notFinal=3; // does compile : we can initialize all fields inside static initializer
        notFinal=5; // does compile : non-final fields can be initialised as many as we want
    }

    public static void main(String[] args) {
        // We'll execute firstly static initializers in order than main code
        System.out.println(NAMES);
    }
}
