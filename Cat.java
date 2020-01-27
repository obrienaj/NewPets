public class Cat extends Pet {

    public Cat(String name){
        super(name);
    }

    public boolean isHappy(){
        return hasBeenFed && !hasBeenWalked && !hasBeenPetted;
    }

    public void talk(){
        System.out.println(name + ", how are you today?");
        System.out.println(isHappy() ? "meow" : "hiss");
    }
}