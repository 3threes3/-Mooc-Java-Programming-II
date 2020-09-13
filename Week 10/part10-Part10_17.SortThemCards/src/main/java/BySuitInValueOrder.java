import java.util.Collections;
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        SortBySuit sorter = new SortBySuit();
        if(sorter.compare(c1, c2) == 0){
            return c1.compareTo(c2);
        } else {
            return sorter.compare(c1, c2);
        }
    }
}
