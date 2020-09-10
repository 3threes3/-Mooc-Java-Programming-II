
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Container first = new Container();
        Container second = new Container();
        String command; 
        
        while (true){
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            command = scanner.nextLine();
            if (command.equals("quit")){
                break;
            }
            int amount = Integer.valueOf(command.split(" ")[1]);
            if(command.split(" ")[0].equals("add")){
                first.add(amount);
            } else if (command.split(" ")[0].equals("move")){
                first.move(amount,second);
            } else if (command.split(" ")[0].equals("remove")){
                second.remove(amount);
            }
            
        }
    }
    
    

}
