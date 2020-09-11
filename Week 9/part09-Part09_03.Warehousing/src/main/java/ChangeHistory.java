import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changes;

    public ChangeHistory(){
        this.changes = new ArrayList<>();
    }

    public void add(double status){
        this.changes.add(status);
    }

    public void clear() {
        this.changes.clear();
    }

    public String toString(){
        return this.changes.toString();
    }

    public double maxValue(){
        if(this.changes.isEmpty()){
            return 0.0;
        }
        double max = this.changes.get(0);

        for (Double iterator: this.changes){
            if(iterator > max){
                max = iterator;
            }
        }

        return max;
    }

    public double minValue() {
        if(this.changes.isEmpty()){
            return 0.0;
        }

        double min = this.changes.get(0);

        for (Double iterator: this.changes){
            if(iterator < min){
                min = iterator;
            }
        }

        return min;
    }

    public double average (){

        if(this.changes.isEmpty()){
            return 0;
        }

        double sum = 0;

        for (Double iterator: this.changes){
            sum += iterator;
        }

        double average = sum / this.changes.size();

        return average;

    }
}
