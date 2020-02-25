package inlab_week5;

public class Ex3 {
    public static void main(String[] args) {
        int responses[] = {1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6,
                10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6,
                4, 8, 6, 8, 10};

        int[] frequency = new int[11];
        int rating = 0;

        for (int answer = 0; answer < responses.length; answer++){
            frequency[responses[answer]] += 1;
        }

        System.out.printf("%-10s %-10s%n", "Rating", "Frequency");
        for (rating = 1; rating < frequency.length; rating++){
        System.out.printf("%-10d %-10d%n", rating, frequency[rating]);
        }
    }
}
