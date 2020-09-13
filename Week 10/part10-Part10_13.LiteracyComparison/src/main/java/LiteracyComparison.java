
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv")).map(line -> line.split(","))
                    .sorted((p1, p2) -> {
                        if(Double.valueOf(p1[5]) - Double.valueOf(p2[5]) > 0){
                            return 1;
                        } else if (Double.valueOf(p1[5]) - Double.valueOf(p2[5]) < 0){
                            return -1;
                        } else {
                            return 0;
                        }
                    })
                    .forEach(p -> System.out.println(p[3] + " (" + p[4] + "), " + p[2].trim().split(" ")[0] + ", " + p[5]));
            ;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
