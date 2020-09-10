
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (this.translations.containsKey(word)) {
            this.translations.get(word).add(translation);
        } else {
            this.translations.put(word, new ArrayList<>());
            this.translations.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> results = new ArrayList<>();
        if (this.translations.get(word) != null) {
            results = this.translations.get(word);
        }
        return results;
    }
    
    public void remove(String word){
        this.translations.remove(word);
    }

}
