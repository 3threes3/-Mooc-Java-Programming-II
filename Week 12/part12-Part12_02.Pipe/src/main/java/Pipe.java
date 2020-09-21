import java.util.ArrayList;

public class Pipe <T>{

    private ArrayList<T> myStuff;

     public Pipe (){
         this.myStuff = new ArrayList<>();
     }

     public void putIntoPipe(T value){
         this.myStuff.add(value);
     }

     public T takeFromPipe(){
         T temp = null;

         if(!this.myStuff.isEmpty()){
             temp = this.myStuff.get(0);
             this.myStuff.remove(this.myStuff.get(0));
         }
         return temp;
     }

     public boolean isInPipe(){
         return !this.myStuff.isEmpty();
     }


}
