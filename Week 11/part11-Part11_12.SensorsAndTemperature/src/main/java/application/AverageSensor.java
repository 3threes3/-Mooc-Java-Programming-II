package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> historic;

    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.historic = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for(Sensor iterator: this.sensors){
            if(!iterator.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for(Sensor iterator: this.sensors){
            iterator.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor iterator: this.sensors){
            iterator.setOff();
        }
    }

    @Override
    public int read() {
        if(this.sensors.isEmpty() || !this.isOn()){
            throw new IllegalStateException();
        }
        int averageRead = 0;
        for(Sensor iterator: this.sensors){
            averageRead += iterator.read();
        }
        averageRead = averageRead / this.sensors.size();
        this.historic.add(averageRead);
        return averageRead;
    }

    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    public List<Integer> readings(){
        return this.historic;
    }
}
