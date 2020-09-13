
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Comparator.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while(true){
            System.out.println();
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            if(title.equals("")){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book (title, age));
        }

        System.out.println(books.size() + " books in total.");

        Comparator<Book> comparator = comparing(Book::getAgeRecommended).thenComparing(Book::getTitle);
        Collections.sort(books, comparator);

        System.out.println();
        System.out.println("Books:");
        books.stream().forEach(p -> System.out.println(p));

    }

}
