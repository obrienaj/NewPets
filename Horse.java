public class Horse extends Pet{
    
    private boolean hasBeenRidden; 
    private boolean HasBeenBrushed;
        
    public Horse(String name){
        super(name); 

    }
    public void brushed(){
        this.hasBeenBrushed =true; 
    }
    public void ridden(){
        this.hasBeenRidden= true; 
    }

    public boolean isHappy(){
        return hasBeenFed && hasBeenWalked && hasBeenPetted && hasBeenRidden && hasBeenBrushed;
    }

    public void talk(){
        System.out.println( isHappy() ? "Neighhh:)" : "Hey :(");
    }
}