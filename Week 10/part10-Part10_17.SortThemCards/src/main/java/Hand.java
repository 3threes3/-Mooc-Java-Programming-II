import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> hand;

    public Hand(){
        this.hand = new ArrayList<>();
    }

    public void add(Card card){
        this.hand.add(card);
    }

    public void print(){
        for(Card iterator: this.hand){
            System.out.println(iterator.toString());
        }
    }

    public void sort(){
        Collections.sort(this.hand);
    }

    @Override
    public int compareTo(Hand hand) {
        int thisHand = 0;
        int otherHand = 0;
        for(Card iterator: this.hand){
            thisHand += iterator.getValue();
        }

        for(Card iterator: hand.hand){
            otherHand += iterator.getValue();
        }

        if(thisHand - otherHand < 0){
            return -1;
        } else if (thisHand - otherHand > 0){
            return 1;
        } else {
            return 0;
        }
    }

    public void sortBySuit(){
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
