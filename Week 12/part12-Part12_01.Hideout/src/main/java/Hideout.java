

public class Hideout <T>{

    private T whatever;

    public Hideout(){
    }

    public void putIntoHideout(T toHide){
        this.whatever = toHide;
    }

    public T takeFromHideout(){
        if(this.whatever == null){
            return null;
        } else {
            T temp = this.whatever;
            this.whatever = null;
            return temp;
        }
    }

    public boolean isInHideout(){
        return this.whatever != null;
    }


}
