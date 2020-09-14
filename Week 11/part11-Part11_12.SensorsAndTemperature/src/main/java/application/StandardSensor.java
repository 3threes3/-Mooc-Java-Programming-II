package application;

public class StandardSensor implements Sensor{

    private int number;
    private final boolean status = true;

    public StandardSensor(int number){
        this.number = number;
    }


    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return this.number;
    }
}
