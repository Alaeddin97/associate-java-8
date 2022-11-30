public class UnderstandingException {
    public static void main(String[] args) throws Exception{

        testException(); // does not compile : requires handling
        //testRuntimeException(); // compile : does not require handling



        //float a=2.3; does not compile, decimals are by default double // add f
        //long l=25555555555555555555555554; does not compile, all integers types are by default int (s)//add l

    }



    public static void testException() throws Exception{
        throw new Exception("Test Exception class");// Checked exception
    }

    public static void testRuntimeException() throws RuntimeException{
        throw new RuntimeException("Test Runtime Exception class");// Unchecked exception
    }
}
