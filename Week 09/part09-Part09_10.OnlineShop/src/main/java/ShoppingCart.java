import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart(){
        this.cart = new HashMap<>();
    }

    public void add(String product, int price){
        if(this.cart.containsKey(product)){
            this.cart.get(product).increaseQuantity();
        } else {
            this.cart.put(product, new Item(product, 1, price));
        }
    }

    public int price(){
        int total = 0;
        for(String iterator: this.cart.keySet()){
            total += (this.cart.get(iterator).getPrice() * this.cart.get(iterator).getQty());
        }
        return total;
    }

    public void print() {
        for (String iterator : this.cart.keySet()) {
            System.out.println(this.cart.get(iterator));
        }
    }

    public Map getCart(){
        return this.cart;
    }



}
