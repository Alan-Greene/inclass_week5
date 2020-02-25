package inlab_week5;

public class Ex4 {
    public static void main(String[] args) {
        double sum = 0.0;
        int row = 0;
        int col = 0;
        double average = 0.0;

        double[][] rates = {{10.5, 12.0, 14.5, 16.75, 18.0},
                {20.5, 22.25, 24.0, 26.25,28.0},
                {34.0, 36.5, 38.0, 40.35, 43.0},
                {50.0, 60.0, 70.0, 80.0, 99.0}};

        for (row = 0; row < rates.length-3; row ++){
            for (col = 0; col < rates[row].length; col ++){
                sum += rates[row][col];
            }
        }

        average = sum / rates[row].length;

        System.out.printf("The average of the grade 1 programmer is: %.2f", average);
    }

}
