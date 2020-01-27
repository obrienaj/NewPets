public class Horse extends Pet{
    
        
    public Horse(String name){
        super(name); 

    }
    public boolean isHappy(){
        return hasBeenFed && hasBeenWalked && hasBeenPetted && hasBeenRidden && hasBeenBrushed;
    }

    public void talk(){
        System.out.println( isHappy() ? "Neighhh:)" : "Hey :(");
    }
}