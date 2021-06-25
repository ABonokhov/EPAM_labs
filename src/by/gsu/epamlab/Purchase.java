package by.gsu.epamlab;

import static by.gsu.epamlab.Formatting.printRuble;

public class Purchase implements Comparable<Purchase> {
    private static final String name = "Crisps"; //product name
    private static final int price = 180;
    private int number; //number of purchased units,
    private int percent; //discount percent,
    private WeekDay weekDay; //enumeration WeekDay

    public Purchase() {
        this(0, 0, null); //no-arg constructor
    }

    public Purchase(int number, int percent, WeekDay weekDay) { //parameterized constructor
        this.number = number;
        this.percent = percent;
        this.weekDay = weekDay;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }


    public int getCost() {
        return price * number * (100 - percent) / 100; //returns the purchase cost
    }

    @Override
    public int compareTo(Purchase purchase) {
        return Integer.compare(number, purchase.number); //compares numbers of purchased units of purchases and the specified purchase
    }

    @Override
    public String toString() {
        return name + ";" + printRuble(price) + ";" + number + ";" + percent + ";" + weekDay;
    }
}




