
public class Container {
    
    private int amount; 
    
    public Container () { 
        this.amount = 0;
    }
    
    public int contains (){ 
        return this.amount;
    }
    
    public void add (int amount){
        if (amount < 0){
            amount = 0;
        }
        this.amount += amount;
        if (this.amount > 100){
            this.amount = 100;
        }
    }
    
    public void remove (int amount){
        if (amount < 0){
            amount = 0;
        }
        this.amount -= amount; 
        if (this.amount < 0){
            this.amount = 0;
        }
    }
    
    @Override
    public String toString(){ 
        return this.amount + "/100";
    }
    
    public void move (int amount, Container receiver){
        if (this.amount < amount){
            amount = this.amount;
        }
        this.amount -= amount;
        receiver.amount += amount;
        if(receiver.amount > 100){
            receiver.amount = 100;
        }
    }

}
