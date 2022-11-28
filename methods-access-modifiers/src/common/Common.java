package common;

public class Common {

    public static void main(String[] args) {
        Common common=new Common();
        common.printPublic();
        common.printProtected();
        common.printDefault();
        common.printPrivate();

    }


    public static void printPublic(){
        System.out.println("Public ");
    }
    protected static void printProtected(){
        System.out.println("Protected ");
    }

    static void printDefault() {
        System.out.println("Default ");
    }
    private void printPrivate(){
        System.out.println("Private ");
    }
}
