public abstract class Pet{
    protected String name;
    protected boolean hasBeenFed;
    protected boolean hasBeenWalked;
    protected boolean hasBeenPetted;
      

    public Pet(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void feed(){
        this.hasBeenFed = true;
    }
    public void walk(){
        this.hasBeenWalked = true;
    }
    public void pet(){
        this.hasBeenPetted = true;
    }
    public abstract boolean isHappy(); 
    public abstract void talk(); 
}