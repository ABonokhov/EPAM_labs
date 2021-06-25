package by.gsu.epamlab;

public class Formatting {

    public static String printRuble(int sum) {    // Method for formatting money
        return String.format("%d.%02d", sum / 100, sum % 100);
    }

    public static String printPoint(int sum) {
        return String.format("%d.%02d", sum / 1000, sum % 1000); // Method for Calculate the mean cost of all purchases (3 digits after the point)
    }
}
