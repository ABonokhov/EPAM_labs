package by.gsu.epamlab;

import java.util.Objects;
import java.util.Scanner;

import static by.gsu.epamlab.Byn.printRuble;

public class Purchase {  // Super-class
    private String name; // product name
    private int price;  // price in BYN
    private int unitsNumber; //number of purchased units

    public Purchase(String name, int price, int unitsNumber) {
        this.name = name;
        this.price = price;
        this.unitsNumber = unitsNumber;
    }

    public Purchase() {
        this(null, 0, 0);
    }

    public Purchase(Scanner scanner) {
        this(scanner.next(), scanner.nextInt(), scanner.nextInt()); // constructor of reading from an instance of the class Scanner.
    }

    public String getName() {  //getters/setters
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUnitsNumber() {
        return unitsNumber;
    }

    public void setUnitsNumber(int unitsNumber) {
        this.unitsNumber = unitsNumber;
    }

    public int getCost() {
        return price * unitsNumber; //returns the purchase cost in BYN;
    }

    @Override
    public String toString() {
        return name + printRuble(price) + unitsNumber;
    }

    @Override
    public boolean equals(Object obj) {  // compares names and prices of purchases and returns true if these fields are equal, false otherwise.
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Purchase purchase = (Purchase) obj;
        return price == purchase.price && Objects.equals(name, purchase.name);
    }

}
