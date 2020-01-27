import java.util.Random;

public class TalkingCat extends Pet {

    public TalkingCat(String name){
        super(name);
    }

    Random rand = new Random();

    public boolean isHappy(){
        return hasBeenFed && !hasBeenWalked && !hasBeenPetted;
    }

    public void talk(){
        System.out.println(name + ", how are you today?");
        System.out.println(isHappy() ? compliment() : insult());
        System.out.println();
    }

    private String compliment(){
        int n = rand.nextInt(5);
        String[] comp = new String[5];
        
        comp[0] = "You look lovely today.";
        comp[1] = "I appreciate everything that you do for me.";
        comp[2] = "I hope you find happiness in life.";
        comp[3] = "God is smiling upon you.";
        comp[4] = "Your parents must be proud of you.";

        return comp[n];
    }

    private String insult(){
        int n = rand.nextInt(5);
        String[] ins = new String[5];
        
        ins[0] = "You are the scum of the earth.";
        ins[1] = "You are an insult to your family name.";
        ins[2] = "I hate your entire being.";
        ins[3] = "You're the ugliest creature that roams this cruel world.";
        ins[4] = "You suck.";

        return ins[n];

    }
}