public class Iguana extends Pet {

    public Iguana(String name){
        super(name);
    }

    public boolean isHappy(){
        return hasBeenFed && hasBeenWalked && !hasBeenPetted;
    }

    public void talk(){
        System.out.println( isHappy() ? "schhhlurp" : "ggghhhhhrrggghhh:(");
    }
}