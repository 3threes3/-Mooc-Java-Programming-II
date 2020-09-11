public class ProductWarehouse extends Warehouse{

    private String name;

    public ProductWarehouse(){

    }
    public ProductWarehouse(String name, double capacity){
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String setName){
        this.name = setName;
    }

    public String toString(){
        return this.name + ": " + super.toString();
    }
}
