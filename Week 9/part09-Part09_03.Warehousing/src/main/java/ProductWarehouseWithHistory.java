public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory changes;

    public ProductWarehouseWithHistory (String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        changes = new ChangeHistory();
        changes.add(initialBalance);
    }

    public String history(){
        return changes.toString();
    }

    public void addToWarehouse (double amount){
        super.addToWarehouse(amount);
        this.changes.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount){
        Double amount2 = super.takeFromWarehouse(amount);
        this.changes.add(super.getBalance());
        return amount2;
    }

    public void printAnalysis() {
        String toReturn = "Product: " + super.getName() + "\n" +
                "History: " + this.changes.toString() + "\n" +
                "Largest amount of product: " + this.changes.maxValue() + "\n" +
                "Smallest amount of product: " + this.changes.minValue() + "\n" +
                "Average: " + this.changes.average();

        System.out.println(toReturn);
    }

}
