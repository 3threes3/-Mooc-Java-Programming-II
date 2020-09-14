package dictionary;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // You can test your dictionary here
        SaveableDictionary s = new SaveableDictionary("word-9998.txt");
        s.load();
        s.delete("below");
        s.add("tieokone", "computer");
        s.save();
    }
}
