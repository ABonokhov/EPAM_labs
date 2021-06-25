import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.WeekDay;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static by.gsu.epamlab.Formatting.printPoint;
import static by.gsu.epamlab.Formatting.printRuble;


public class Runner {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("src/in.txt"))) {
            scanner.useLocale(Locale.ENGLISH);
            final int PURCHASES_NUMBER = scanner.nextInt();
            Purchase[] purchases = new Purchase[PURCHASES_NUMBER];

            for (int i = 0; i < PURCHASES_NUMBER; i++) {
                int number = scanner.nextInt();
                int percent = scanner.nextInt();
                int day = scanner.nextInt();
                purchases[i] = new Purchase(number, percent, WeekDay.values()[day]);
            }
            int totalCost = 0;
            int maxCost = 0;
            Purchase maxPurchase = new Purchase();
            for (Purchase purchase : purchases) {
                if (purchase != null) {
                    totalCost += purchase.getCost() / purchases.length;
                    if (purchase.getCost() > maxCost) {
                        maxCost = purchase.getCost();// the maximum cost
                        maxPurchase = purchase;
                        if (purchase.getWeekDay() == WeekDay.MONDAY) {
                            System.out.println("The total cost of all purchases on Monday is " + printRuble(purchase.getCost())); // the total cost of all purchases on Monday
                        }
                    }
                }
            }

            System.out.println("The day with the maximum purchase cost is " + maxPurchase);
            System.out.println();
            System.out.println(Arrays.toString(purchases));
            System.out.println("The Mean cost of all purchases is " + printPoint(totalCost)); // Calculate the mean cost of all purchases

            Arrays.sort(purchases);
            Purchase purchase = new Purchase(5, 3, WeekDay.WEDNESDAY);
            System.out.println("Purchase with number equalled to 5 is " + Arrays.binarySearch(purchases, purchase)); //Find purchase with number equalled to 5 with the method binarySearch()

        } catch (FileNotFoundException e) {
            System.err.println("Input file is not found");

        }
    }
}
