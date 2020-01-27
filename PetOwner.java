public class PetOwner {

    private String name;
    private Pet[] pets;

    public PetOwner(String name, Pet[] pets) {
        this.name = name;
        this.pets = pets;
    }

    public boolean isHappy() {
        for (int i = 0; i < pets.length; i++) {
            if (!pets[i].isHappy()) {
                return false;
            }
        }
        return true;
    }

    public void talk() {
        System.out.println(isHappy() ? "Yeeeeeet:)" : "sad boi hours:(");
    }

    public void feedAllPets(){
        for(int j=0; j<pets.length; j++)
            pets[j].feed(); 

    }
    public void walkNeedyPets(){
        for(int k=0; k<pets.length; k++){
            if (pets[k] instanceof Dog){
                pets[k].walk(); 
            }
            if(pets[k] instanceof Iguana){
                pets[k].walk(); 
            }
            if(pets[k] instanceof Horse){
                pets[k].walk(); 
            }
            if(pets[k] instanceof Yorkie){
                pets[k].walk(); 
            }
        }
    }

    public void petNeedyPets(){
        for (int r=0; r<pets.length; r++){
            if(pets[r] instanceof Dog){
                pets[r].pet(); 
            }
            if(pets[r] instanceof Yorkie){
                pets[r].numberOfPets(10); 
            }
            if(pets[r] instanceof Horse){
                pets[r].pet(); 
            }
        }
    }
    
    public void careHorse(){
        for( int h=0; h<pets.length; h++){
            if(pets[h] instanceof Horse){
                pets[h].ridden(); 
                pets[h].brushed(); 
                pets[h].pet();
                pets[h].walk();
                pets[h].feed();   
            }
        }
    }
}