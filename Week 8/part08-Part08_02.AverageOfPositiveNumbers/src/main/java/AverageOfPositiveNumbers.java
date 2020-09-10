
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int total = 0;
        int count = 0;

        while (true) {
            number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                total += number;
                count++;
            } else if (number == 0) {
                break;
            }
        }

        double avg = 1.0 * total / count;

        if (count > 0) {
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
