
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> stuff = new ArrayList<>();

        while(true){
            String row = scanner.nextLine();
            if(row.equals("")){
                break;
            }
            stuff.add(row);
        }

        stuff.stream().forEach(line -> System.out.println(line));

    }
}
