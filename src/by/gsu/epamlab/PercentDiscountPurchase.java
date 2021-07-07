package by.gsu.epamlab;

import java.util.Scanner;

public class PercentDiscountPurchase extends Purchase {
    private double discount;

    public PercentDiscountPurchase() {
        this(null, 0, 0, 0);
    }

    public PercentDiscountPurchase(String name, int price, int unitsNumber, double discount) {
    }

    public PercentDiscountPurchase(Scanner scanner) {
        this(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

}
