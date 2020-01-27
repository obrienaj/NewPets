public class PetsTester{
    public static void main(String[] args){

        Cat c = new Cat("Scout");
        Dog d = new Dog("Spot"); 
        Iguana i = new Iguana("Sclaey"); 
        TalkingCat tc = new TalkingCat("Sophie");
        Cat sammy=new Cat("Sammy"); 
        Dog hans = new Dog("Hans"); 

        Pet pets[] = new Pet[3];
        pets[0] = c;
        pets[1] = d;
        pets[2] = i;

        PetOwner po = new PetOwner("Cassidy", pets);

        Pet alliePets[]= new Pet[2]; 
        alliePets[0]=sammy; 
        alliePets[1]=hans; 
        PetOwner allie= new PetOwner("Allie", alliePets); 

        c.talk(); 
        d.talk(); 
        i.talk();
        po.talk(); 

        d.feed();
        d.walk();
        d.pet();
        d.talk(); 

        c.feed(); 
        c.talk(); 

        i.feed(); 
        i.walk();
        i.talk();

        po.talk(); 

        c.walk(); 
        c.talk(); 
        po.talk(); 

        allie.feedAllPets();
        allie.walkNeedyPets(); 
        allie.petNeedyPets(); 

        sammy.talk();
        hans.talk(); 
        allie.talk(); 
        tc.talk();


    }
}