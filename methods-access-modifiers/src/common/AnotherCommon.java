package common;

public class AnotherCommon {

    public static void main(String[] args) {
        Common common=new Common();
        common.printPublic();
        common.printProtected();
        common.printDefault();
       // common.printPrivate(); does not compile
    }

}
