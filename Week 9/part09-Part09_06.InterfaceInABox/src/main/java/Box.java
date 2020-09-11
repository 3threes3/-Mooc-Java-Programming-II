import java.util.ArrayList;

public class Box implements Packable{

    private ArrayList<Packable> contents;
    private double capacity;

    public Box (double capacity){
        this.contents = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add (Packable item){
        double currentWeight = this.weight();
        if(currentWeight + item.weight() <= capacity){
            this.contents.add(item);
        }
    }

    public double weight() {
        if(this.contents.isEmpty()){
            return 0;
        }
        double currentWeight = 0;
        for (Packable iterator: this.contents){
            currentWeight += iterator.weight();
        }
        return currentWeight;
    }

    public String toString() {
        return "Box: " + this.contents.size() + " items, total weight " + this.weight() + " kg";
    }

    public ArrayList<Packable> list(){
        return this.contents;
    }

}
