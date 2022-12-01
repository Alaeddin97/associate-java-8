public class Animal {

    public String name;
    public boolean canJump;
    public boolean canSwim;
    public Animal(String name,boolean canJump,boolean canSwim){
        this.name=name;
        this.canSwim=canSwim;
        this.canJump=canJump;
    }

    public boolean canJump(){
        return canJump;
    }

    public boolean canSwim(){
        return canSwim;
    }
}
