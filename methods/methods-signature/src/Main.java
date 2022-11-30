public class Main {
    public static void main(String[] args) {
    }
    // Method design: order does not matter when it comes to specifier words before method return type
    public static final void methodDesign1(){}
    final static  public void methodDesign2(){}
    final public static void methodDesign3(){}
    public final static void methodDesign4(){}

    // Same rule for both variable and method identifier: no numbers at the beginning , no reserved words
    // no specific symbols except $ and _

    // int test{}: brackets are obligatory whether we have args or not

    // Methods with variable arguments:

    public static void methodWithVarArgs(int start,int ...numbers){
        // we can call this method with or without passing numbers as argument, null is not allowed for numbers
        // we will get numbers as empty array in case we do not pass it as arg
        System.out.println("start= "+start+" numbers length= "+numbers.length);
    }
    //public static void run(int ...numbers,int ...numbers2){} can not have tow var args for one method


}