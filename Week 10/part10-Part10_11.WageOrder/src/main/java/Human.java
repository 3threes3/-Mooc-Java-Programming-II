
public class Human implements Comparable{

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }


    @Override
    public int compareTo(Object o) {
        Human newOne = (Human) o;
        return newOne.getWage() - this.getWage();
    }


    public int compareTo(Human o) {
        return o.getWage() - this.getWage();
    }
}
