package by.gsu.epamlab;

public class Formatting {

    public static String printRuble(int sum) {    // Method for formatting money
        return String.format("%d.%02d", sum / 100, sum % 100);
    }

}