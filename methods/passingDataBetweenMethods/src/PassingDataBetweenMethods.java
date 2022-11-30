public class PassingDataBetweenMethods {

    public static void main(String[] args) {
        // Here name in main and name pass as arg does not point to the same reference
        String name="JERRY";
        passByValue(name);
        System.out.println(name);
        // Here both stringBuilder and sb point to the same reference
        StringBuilder stringBuilder= new StringBuilder();
        passByRef(stringBuilder);
        System.out.println(stringBuilder);
    }

   public static void passByValue(String name){
        name="TOM";
    }

    public static void passByRef(StringBuilder sb){
        sb.append("TOM");
    }
}
