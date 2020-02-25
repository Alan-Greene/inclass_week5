package inlab_week5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[5];
        int[] ages = new int[5];
        int youngest_index = 0;
        int oldest_index = 0;
        int i = 0;
        int j = 0;
        int ages_temp = 0;

        System.out.println("Please enter the names and ages of your staff members: ");
        for (i = 0; i < names.length; i++){
            System.out.printf("Staff #%d name", i+1);
            names[i] = in.next();
            System.out.printf("Please enter %s's age", names[i]);
            ages[i] = in.nextInt();

        }

        for (i = 0; i < ages.length; i++){
            if (ages[i] > ages[oldest_index]){
                oldest_index = i;
            }

            if (ages[i] < ages[youngest_index]){
                youngest_index = i;
            }
        }

        System.out.printf("%-10s %-10s%n", "Name", "Age");
        for (i = 0; i < names.length; i++){
            System.out.printf("%-10s %-10d%n", names[i], ages[i]);

        }

        System.out.printf("The oldest staff member is %s at an age of %d%n", names[oldest_index], ages[oldest_index]);
        System.out.printf("The youngest staff member is %s at an age of %d%n", names[youngest_index], ages[youngest_index]);


        for (i = 0; i < ages.length - 1; i++){
            for (j = 1; j < ages.length-1-i; j++){
                if (ages[j] > ages[j+1]){
                    ages_temp = ages[j];
                    ages[j] = ages[j+1];
                    ages[j+1] = ages_temp;
                }
            }
        }

        System.out.printf("Sorted ages list: %d %d %d %d %d", ages[0], ages[1], ages[2], ages[3], ages[4]);
    }
}
