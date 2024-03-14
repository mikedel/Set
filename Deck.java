import java.util.ArrayList;
import java.util.Random;

public class Deck {
    ArrayList<SetCardComponent> deck;
    
    //Constructor
    public Deck () {
        deck = new ArrayList<SetCardComponent>();
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    for (int l = 1; l <= 3; l++) {
                        this.addSetCard (new SetCardComponent (i, j, k, l));
                    }//end for l
                }//end for k
            }//end for j
        }//end for i
    }
    
    //Methods
    public void addSetCard (SetCardComponent newSetCard) {
        deck.add (newSetCard);
    }//end addSetCard
    
    public SetCardComponent removeSetCard (int num) {
        SetCardComponent removedCard = deck.get(num);
        deck.remove(num);
        return removedCard;
    }
    
    public int getSize() {
        return deck.size();
    }
    
    public SetCardComponent removeTopSetCard () {
        System.out.println("in remove top set card");
        int count = deck.size();
        System.out.println("count is: " + count);
        SetCardComponent topCard = deck.get(0);
        deck.remove(0);
        return topCard;
    }
    
    public void shuffle() {
        System.out.println("In shuffle");
        Random gen = new Random();
        int count = deck.size();
        System.out.println("count is: " + count);
        for (int i = 0; i < 2000; i++)
            this.addSetCard(this.removeSetCard(gen.nextInt (count)));
    } 
}
