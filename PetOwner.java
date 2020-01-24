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
    }
    }

    public void petNeedyPets(){
        for (int r=0; r<pets.length; r++){
            if(pets[r] instanceof Dog){
                pets[r].pet(); 
            }
        }
    }
}