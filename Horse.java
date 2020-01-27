public class Horse extends Pet{
    public Horse(String name){
        super(name); 
        protected boolean hasBeenRidden; 
        protected boolean HasBeenBrushed; 
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