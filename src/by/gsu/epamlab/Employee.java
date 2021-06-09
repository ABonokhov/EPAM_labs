package by.gsu.epamlab;

public class Employee {
    public  int rate; // daily allowance rate in BYN
    private String account; // employee`s account
    private int transport; // transportation expenses in BYN
    private int days; // number of days

    public Employee() {} // no-arg constructor

    public Employee(int rate, String account, int transport, int days) {  // parameterized constructor
        this.rate = rate;
        this.account = account;
        this.transport = transport;
        this.days = days;

    }


    public int getRate() {     // getters/setters;
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getTotal(){
        return transport + rate * days;}    // returns the total business trip expenses in BYN




    void show(){        // outputs all fields to the console

        System.out.println("rate = " + rate);
        System.out.println("account = " + account);
        System.out.println("transport = " + transport);
        System.out.println("days = " + days);
        System.out.println("total = " + getTotal());


    }

    @Override
    public String toString() {              // returns a string representation of a business trip in the csv–format
        return "BusinessTrip{" +
                "rate=" + rate +
                ", account='" + account + '\'' +
                ", transport=" + transport +
                ", days=" + days +
                '}';
    }
}







