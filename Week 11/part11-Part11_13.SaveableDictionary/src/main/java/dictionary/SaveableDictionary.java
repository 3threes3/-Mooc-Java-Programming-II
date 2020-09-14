package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dict;
    private String file;

    public SaveableDictionary(){
        this.dict = new HashMap<>();
    }

    public SaveableDictionary(String file) throws IOException {
        this.dict = new HashMap<>();
        this.file = file;
    }

    public boolean load(){
        try{
            Scanner scanner = new Scanner(Paths.get(this.file));
            while(scanner.hasNextLine()){
                String next = scanner.nextLine();
                String [] pieces = next.split(":");
                this.dict.put(pieces[0], pieces[1]);
            }
        } catch (Exception e0){
            return false;
        }
        return true;
    }

    public void add(String words, String translation){
        if(!this.dict.containsKey(words)){
            this.dict.put(words, translation);
        }
    }

    public String translate(String word){
        for(String iterator: this.dict.keySet()){
            if(iterator.equals(word)){
                return this.dict.get(word);
            }
        }

        for(String iterator: this.dict.keySet()){
            if(word.equals(this.dict.get(iterator))){
                return iterator;
            }
        }

        return null;
    }

    public void delete(String word){
        for(String iterator: this.dict.keySet()){
            if(iterator.equals(word)){
                this.dict.remove(word);
                break;
            }

            if(word.equals(this.dict.get(iterator))){
                this.dict.remove(iterator);
                break;
            }
        }



    }

    public boolean save(){
        try{
            PrintWriter printer = new PrintWriter(this.file);
            for(String iterator: this.dict.keySet()){
                System.out.println(iterator + ":" + this.dict.get(iterator));
                printer.println(iterator + ":" + this.dict.get(iterator));
            }
            printer.close();
        } catch (FileNotFoundException e) {
            return false;
        }
        return true;
    }

    public HashMap<String, String> getDict(){
        return this.dict;
    }
}
