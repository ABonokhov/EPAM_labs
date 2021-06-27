import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.WeekDay;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

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


            printPurchases(purchases);
            int totalCost = 0;
            int totalCostMonday = 0;
            int maxCost = 0;
            double meanCost = 0.0;
            WeekDay maxCostDay = null;
            Purchase maxPurchase = new Purchase();
            for (Purchase purchase : purchases) {
                if (purchase != null) {
                    totalCost += purchase.getCost() / purchases.length;
                    if (purchase.getCost() > maxCost) {
                        maxCost = purchase.getCost();// the maximum cost
                        maxPurchase = purchase;
                        if (purchase.getWeekDay() == WeekDay.MONDAY) {
                            totalCostMonday = purchase.getCost();
                            if (purchases.length > 0) {
                                meanCost = ((double) totalCost) / purchases.length;
                            }

                        }
                    }
                }
            }

            System.out.println("The day with the maximum purchase cost is " + maxPurchase);
            System.out.println(Arrays.toString(purchases));
            System.out.println("The Mean cost of all purchases is " + meanCost); // Calculate the mean cost of all purchases
            System.out.println("The total cost of all purchases on Monday is " + printRuble(totalCostMonday));// the total cost of all purchases on Monday

            Arrays.sort(purchases);
            Purchase purchase = new Purchase(5, 3, WeekDay.WEDNESDAY);
            System.out.println("Purchase with number equalled to 5 is " + Arrays.binarySearch(purchases, purchase) + purchase); //Find purchase with number equalled to 5 with the method binarySearch()

        } catch (FileNotFoundException e) {
            System.err.println("Input file is not found");

        }

    }

    private static void printPurchases(Purchase[] purchases) {
        System.out.println(Purchase.NAME + "\n" + printRuble(Purchase.PRICE));
        for (Purchase purchase : purchases) {
            System.out.println(purchase);
        }
    }
}


