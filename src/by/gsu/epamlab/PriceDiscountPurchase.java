package by.gsu.epamlab;

import java.util.Scanner;

public class PriceDiscountPurchase extends Purchase {
    private int discount;

    public PriceDiscountPurchase(){
        this(null,0,0,0);
    }

    public PriceDiscountPurchase(String name, int price, int unitsNumber, int discount){
        super(name,price,unitsNumber);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public PriceDiscountPurchase(Scanner scanner){
        this(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    @Override
    public String toString() {
        return super.toString() + discount;
    }
}
