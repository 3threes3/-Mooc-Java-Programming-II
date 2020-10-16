public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here

        int totalNumbers = size * size;
        int filledSpots = 1;
        int i = 0;
        int j = square.getWidth() / 2;

        square.placeValue(i, j, filledSpots);


        while (filledSpots < totalNumbers) {

            filledSpots++;

            if (i - 1 >= 0) {
                i--;
            } else {
                i = square.getHeight() - 1;
            }

            if (j + 1 < square.getWidth()) {
                j++;
            } else {
                j = 0;
            }

            if (square.readValue(i, j) != 0) {
                if(i + 2 >= square.getHeight()){
                    i = 1;
                    if(j - 1 < 0){
                        j = square.getHeight() - 1;
                    } else {
                        j = j - 1;
                    }
                } else {
                    i = i + 2;
                    if(j - 1 < 0){
                        j = square.getHeight() - 1;
                    } else {
                        j = j - 1;
                    }
                }

            }

            square.placeValue(i, j, filledSpots);

        }

        return square;
    }

}