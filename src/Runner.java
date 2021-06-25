import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.WeekDay;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("src/in.txt"))) {
            scanner.useLocale(Locale.ENGLISH);
            final int PURCHASES_NUMBER = scanner.nextInt();
            Purchase[] purchases = new Purchase[PURCHASES_NUMBER];

            for (int i = 0; i < PURCHASES_NUMBER; i++) {
                int number = scanner.nextInt();
                double percent = scanner.nextDouble();
                int day = scanner.nextInt();
                purchases[i] = new Purchase(number, percent, WeekDay.values()[day]);

            }
            System.out.println(Arrays.toString(purchases));


            Arrays.sort(purchases);
            int sort = Arrays.binarySearch(purchases, 5);// Find purchase with number equalled to 5 with the method binarySearch( )
            System.out.println(sort);


        } catch (FileNotFoundException e) {
            System.err.println("Input file is not found");

        }
    }


}

