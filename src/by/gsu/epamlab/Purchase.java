package by.gsu.epamlab;

public class Purchase implements Comparable<Purchase> {
    public static final String NAME = "Crisps"; //product name
    public static final int PRICE = 180;
    private int unitsNumber; //number of purchased units,
    private double percent; //discount percent,
    private WeekDay weekDay; //enumeration WeekDay

    public Purchase() {
        this(0, 0, null); //no-arg constructor
    }

    public Purchase(int unitsNumber, double percent, WeekDay weekDay) { //parameterized constructor
        this.unitsNumber = unitsNumber;
        this.percent = percent;
        this.weekDay = weekDay;
    }

    public Purchase(int unitsNumber, double percent, int day) {
        this();
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }


    public int getCost() {
        return (int) Math.round(PRICE * unitsNumber * (100 - percent) / 100); //returns the purchase cost
    }

    @Override
    public int compareTo(Purchase purchase) {
        return unitsNumber - purchase.unitsNumber; //compares numbers of purchased units of purchases and the specified purchase
    }

    @Override
    public String toString() {
        return unitsNumber + ";" + percent + ";" + weekDay;
    }
}
