public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    public Item (String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.unitPrice * this.qty;
    }

    public void increaseQuantity(){
        this.qty++;
    }

    public void decreaseQuantity(){
        this.qty--;
    }

    public String toString(){
        return this.product + ": " + this.qty;
    }

    public int getPrice(){
        return this.unitPrice;
    }

    public int getQty(){
        return this.qty;
    }
}
