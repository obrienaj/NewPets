public class Yorkie extends Pet{

    public Yorkie(String name){
        super(name); 
    }

    public boolean isHappy(){
        return hasBeenFed && hasBeenWalked && hasBeenPettedX10;
    }

    public void talk(){
        System.out.println(name + ", what's the tea, gov'ner?");
        System.out.println( isHappy() ? "yip woof :)" : "yip woof :(");
        System.out.println();
    }
}