
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.print("To add: ");
                this.list.add(this.scanner.nextLine());
            } else if (command.equals("list")) {
                this.list.print();
            } else if (command.equals("remove")) {
                System.out.print("WHich one is removed? ");
                this.list.remove(Integer.valueOf(this.scanner.nextLine()));
            }
        }
    }

}
