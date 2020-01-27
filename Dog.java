public class Dog extends Pet{

    public Dog(String name){
        super(name); 
    }

    public boolean isHappy(){
        return hasBeenFed && hasBeenWalked && hasBeenPetted;
    }

    public void talk(){
        System.out.println(name + ", how are you today?");
        System.out.println( isHappy() ? "woof :)" : "woof :(");
    }
}