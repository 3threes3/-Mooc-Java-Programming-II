import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Warehouse () {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct (String product, int price, int stock){
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }


    public int price (String product){
        for(String iterator: this.prices.keySet()){
            if(iterator.equals(product)){
                return this.prices.get(iterator);
            }
        }
        return -99;
    }

    public int stock (String product){
        for (String iterator: this.stock.keySet()){
            if (iterator.equals(product)){
                return this.stock.get(product);
            }
        }
        return 0;
    }

    public boolean take (String product) {
        for (String iterator: this.stock.keySet()) {
            if (iterator.equals(product)) {
                if (this.stock.get(product) >= 1) {
                    this.stock.replace(iterator, this.stock.get(product) - 1);
                    return true;
                }

            }
        }
        return false;
    }

    public Set<String> products(){
        return this.stock.keySet();
    }
 }
