public class UsingFinally {

    public static void main(String[] args) {

        // finally is always executed...............
        try{
            throw new Exception("Exception");
        }catch (Exception e){
            System.out.println("I get the exception");
        }finally {
            System.out.println("I get executed anyway");
        }



        String str="";
        try{
            str+="a";
        }catch (Exception e){
            str+="b";
        }finally {
            str+="c";
        }

        str+="d";
        System.out.println(str);

    }
}
