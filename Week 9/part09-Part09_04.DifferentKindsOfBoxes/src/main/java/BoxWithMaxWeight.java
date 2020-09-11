import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight (int capacity){
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        int currentCapacity = 0;
        for(Item iterator: this.items){
            currentCapacity += iterator.getWeight();
        }
        if(!(currentCapacity + item.getWeight() > this.capacity)){
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        boolean found = false;
        for(Item iterator: this.items){
            if(iterator.equals(item)){
                return true;
            }
        }
        return false;
    }
}
