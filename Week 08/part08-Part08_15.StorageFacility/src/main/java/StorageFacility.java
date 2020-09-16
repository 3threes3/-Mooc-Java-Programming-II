
import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() { 
        this.storage = new HashMap<>();
    }
    
    public void add (String unit, String item){
        if(this.storage.containsKey(unit)){
            this.storage.get(unit).add(item);
        } else { 
            this.storage.put(unit, new ArrayList<>());
            this.storage.get(unit).add(item);
        }
    }
    
    public ArrayList<String> contents(String storageUnit){
        ArrayList <String> results = new ArrayList<>();
        if(this.storage.containsKey(storageUnit)){
            results = this.storage.get(storageUnit);
        }
        return results;
    }
    
    public void remove(String storageUnit, String item){
        this.storage.get(storageUnit).remove(item);
        if(this.storage.get(storageUnit).isEmpty()){
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList <String> units = new ArrayList<>();
        for(String iterator: this.storage.keySet()){
            if (!this.storage.get(iterator).isEmpty()){
                units.add(iterator);
            }
        }
        return units;
    }

}
