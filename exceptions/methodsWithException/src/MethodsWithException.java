
class NoMoreMeatException extends Exception{}
class NoMorePlantException extends RuntimeException{}

interface Omnivore{
    void eatPlants(int amount);
    void eatMeat(int amount)throws NoMoreMeatException;
}

class Bear implements Omnivore{

    @Override
    public void eatPlants(int amount) {
        if(amount<=0){
            throw new NoMorePlantException();
        }
        System.out.println("Eat plants");
    }

    @Override
    public void eatMeat(int amount)throws NoMoreMeatException {
        if(amount<=0){
            throw new NoMoreMeatException();
        }
        System.out.println("Eat meat");
    }
}

public class MethodsWithException {
    public static void main(String[] args) {
        Bear bear=new Bear();
        try {
            bear.eatMeat(1);// executed
            bear.eatPlants(-3);//not handled
        } catch (NoMoreMeatException e) {
            e.printStackTrace();
        }
    }
    }
