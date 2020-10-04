
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int [][] array){
        String stuff = "";

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                stuff += array[i][j];
            }
            stuff += "\n";
        }

        return stuff;
    }

}
