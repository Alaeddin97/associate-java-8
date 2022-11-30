
class MuseumClosed extends RuntimeException{}
class MuseumClosedForLunch extends MuseumClosed{}

public class CatchingExceptions {
    public static void main(String[] args) {
        System.out.println(calcute());

        // must handle exception from subclasses before superclasses
    try{
        System.out.println("DOES NOT COMPILE BECAUSE WE CATCH MuseumClosed before MuseumClosedForLunch");
    }catch(MuseumClosed mce){
        System.out.println("Catch MuseumClosed");
    }//catch(MuseumClosedForLunch mcfle){ //Does not compile
      //  System.out.println("Catch MuseumClosedForLunch");
   // }


        try{
            System.out.println("DOES NOT COMPILE BECAUSE WE CATCH MuseumClosed before MuseumClosedForLunch");
        }catch(MuseumClosedForLunch mcfle){
            System.out.println("Catch MuseumClosed");
        }catch(MuseumClosed mce){
            System.out.println("Catch MuseumClosedForLunch");
        }
    }


    public static String calcute(){
        String result="";
        String str=null;

        try{
            try{
                result+="start";
                str.length();
                result+="end";
            }catch (NullPointerException e){
                result+="npe";
                throw new RuntimeException();
            }finally {
                result+="finally";
               throw new Exception();
            }
        }catch (Exception e){
            result+="finished";
        }

        return result;
    }
}
