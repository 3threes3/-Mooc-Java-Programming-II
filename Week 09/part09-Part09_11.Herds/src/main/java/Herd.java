import java.util.ArrayList;

public class Herd implements Movable{

    private ArrayList<Movable> units;

    public Herd(){
        this.units = new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable iterator: this.units){
            iterator.move(dx, dy);
        }
    }

    @Override
    public String toString(){
        String allUnits = "";
        for(Movable iterator: this.units){
            allUnits += iterator.toString() + "\n";
        }
        return allUnits;
    }

    public void addToHerd(Movable movable){
        this.units.add(movable);
    }
}
