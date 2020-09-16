
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();

            if (input.split(" ")[0].equals("add")) {
                int toAdd = Integer.valueOf(input.split(" ")[1]);
                if (toAdd > 0) {
                    if (first + toAdd >= 100) {
                        first = 100;
                    } else {
                        first += toAdd;
                    }
                }
            } else if (input.split(" ")[0].equals("move")) {
                int toMove = Integer.valueOf(input.split(" ")[1]);
                if (toMove > 0) {
                    if (toMove > first) {
                        toMove = first;
                    }
                    if (second + toMove > 100) {
                        second = 100;
                        first -= toMove;
                    } else {
                        second += toMove;
                        first -= toMove;
                    }
                }
            } else if (input.split(" ")[0].equals("remove")){
                int toRemove = Integer.valueOf(input.split(" ")[1]);
                if(toRemove > second){
                    second = 0;
                } else { 
                    second -= toRemove;
                }
                
                
            } else if (input.equals("quit")) {
                break;
            }

        }
    }

}
