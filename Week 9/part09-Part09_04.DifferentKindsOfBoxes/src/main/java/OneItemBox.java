import java.util.ArrayList;

public class OneItemBox extends Box{

    private ArrayList<Item> items;

    public OneItemBox(){
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.items.isEmpty()){
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(this.items.isEmpty()){
            return false;
        } else if (this.items.get(0).equals(item)){
            return true;
        }
        return false;
    }
}
