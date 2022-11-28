package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class Final {

    public static final int SIZE=10;
    public static final List<String>finalList=new ArrayList<>();
    public static final String[] finalArray= {"item1","item2"};


    public static void main(String[] args) {
        //  Size++;// does not compile
        finalList.add("New item");// legal
        //finalList=new ArrayList<>();// illegal for final variable of type list

        finalArray[0]="item2prim";//legal
        //finalArray={"reInit1","reInit2"};//illegal

        // --------! we can not re-assign final variable to point to another reference !---------------------
    }
}
