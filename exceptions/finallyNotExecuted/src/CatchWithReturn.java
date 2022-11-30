public class CatchWithReturn {
    public static void main(String[] args) {
        System.out.println(calulate());
    }

    public static int calulate(){

        try{
            return 10/2;
        }catch (Exception e){
        //    System.exit(0);
            System.out.println("Can not divide by 0");
           // System.exit(0);
            return 1;
        }finally {
            System.exit(0); // Execute finally before return !!!!!!!!!!!!!!!!
            System.out.println("finally");
//            System.exit(0);

        }
    }
}
