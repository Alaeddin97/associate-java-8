public class DealingWithExceptions {


    public static void main(String[] args) {
        
        try{
            int result=devide(4,0);
            System.out.println("Result="+result);
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("Exception dividing message: "+e.getMessage());
        }
    }


    public static int devide(int a,int b){
        return a/b;
    }

}
