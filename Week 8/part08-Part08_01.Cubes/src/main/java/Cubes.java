
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String side;
        
        while(true){
            side = scanner.nextLine(); 
            if(side.equals("end")){
                break;
            }
            else {
                int cube = Integer.valueOf(side);
                System.out.println(cube * cube * cube);
            }
            
        }

    }
}
