package by.gsu.epamlab;

public class Purchase implements Comparable<Purchase> {
    private String Crisps; //product name
    private final int price = 180;
    private int number; //number of purchased units,
    private double percent; //discount percent,
    private WeekDay weekDay; //enumeration WeekDay

    public Purchase() {
        this(0, 0, null); //no-arg constructor
    }

    public Purchase(int number, double percent, WeekDay weekDay) { //parameterized constructor
        this.number = number;
        this.percent = percent;
        this.weekDay = weekDay;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public double getCost() {
        return price * number * (100 - percent) / 100; //returns the purchase cost
    }

    private static String printRuble(int sum) {       // Method for formatting money
        return String.format("%d.%02d", sum / 100, sum % 100);
    }

    @Override
    public int compareTo(Purchase purchase) {
        return Integer.compare(number, purchase.number); //compares numbers of purchased units of purchases and the specified purchase
    }

    @Override
    public String toString() {
        return Crisps + ";" + price + ";" + number + ";" + percent + ";" + weekDay;
    }
}




