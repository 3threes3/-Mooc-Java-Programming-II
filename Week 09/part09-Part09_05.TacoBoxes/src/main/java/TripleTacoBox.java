public class TripleTacoBox implements TacoBox{

    private int tacos;

    public TripleTacoBox () {
        tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat () {
        if(this.tacos >= 1) {
            this.tacos--;
        }
    }
}
