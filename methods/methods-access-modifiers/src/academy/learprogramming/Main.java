package academy.learprogramming;

import common.Common;

public class Main {
    public static void main(String[] args) {
        Common common=new Common();
        common.printPublic(); // only public method can be access from outside the package
        //common.printProtected();
        //common.printDefault();
        //common.printPrivate();
    }
}