public class MainClass {

    public static void main(String[] args) {
        System.out.println(walk("anyStr"));
        System.out.println(jump(2));
        count(true,new boolean[2]);
    }
    public static void count(boolean b,boolean ...b1){}
    public static void walk(int dis){}
    public static void walk(float dis){}
    public static void walk(double dis){}
    public static void walk(int[]is,int ...iss){};
    public static boolean walk(String s){return false; }
    public static String walk(int dis,String state){return state;}
    //public static int walk(int dis){return 1;} // does not compile: same args as the first one

    public static void jump(String s){}
    public static Object jump(Object o){return o;}

}
