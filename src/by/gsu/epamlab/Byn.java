package by.gsu.epamlab;

import java.util.Objects;

public class Byn extends Purchase implements Comparable<Byn> {
    private int financialValue; // value of a financial entity in kopecks

    public Byn() {
        this(0);
    }

    public Byn(int financialValue) {
        this.financialValue = financialValue;
    }

    public static String printRuble(int sum) {    // Method for formatting money
        return String.format("%d.%02d", sum / 100, sum % 100);
    }

    @Override
    public String toString() {
        return printRuble(financialValue);
    }

    @Override
    public boolean equals(Object obj) { // compares financial entities and returns true if their kopecks are equal, false otherwise
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Byn byn = (Byn) obj;
        return financialValue == byn.financialValue;
    }

    @Override
    public int compareTo(Byn byn) {
        return financialValue - byn.financialValue; //compares kopecks and returns a negative integer, zero, or a positive integer as this byn is less than, equal to, or greater than the specified byn.

    }
}
