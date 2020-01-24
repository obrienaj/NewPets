public abstract class Pet{
    protected String name;
    protected boolean hasBeenFed;
    protected boolean hasBeenWalked;
    protected boolean hasBeenPetted;
    protected boolean hasBeenPettedX10; 
    protected int pats; 
      

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
    public void pettedX10(){
        this.hasBeenPettedX10 = true; 
    }
    public void numberOfPets(int pats){
        if(pats<10){
            this.hasBeenPettedX10= false; 
        }
        else{
            this.hasBeenPettedX10= true; 
        }
    }
    public abstract boolean isHappy(); 
    public abstract void talk(); 
}