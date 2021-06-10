package by.gsu.epamlab;

    public class Employee {
        private static final int DAILY_RATE = 1750; // daily allowance rate in BYN (constant)
        private String account; // employee`s account
        private int transport; // transportation expenses in BYN
        private int days; // number of days
        public Employee() { // no-arg constructor
        }
        public Employee(String account, int transport, int days) {  // parameterized constructor
            this.account = account;
            this.transport = transport;
            this.days = days;
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
        public int getTotal() {
            return transport + DAILY_RATE * days;  // returns the total business trip expenses in BYN
        }
        void show() {        // outputs all fields to the console
            System.out.println("rate = " + DAILY_RATE + ", " +  "account = " + account + ", " +  "transport = " +  printRuble(transport) + ", " + "days = " +  days + ", " + "total = " + printRuble(getTotal()));
        }

        @Override
        public String toString() {             // returns a string representation of a business trip in the csv–format
            return "BusinessTrip{" +
                    "rate=" + DAILY_RATE +
                    ", account='" + account + '\'' +
                    ", transport=" + printRuble(transport) +
                    ", days=" + days +
                    ", total=" + printRuble(getTotal()) +
                    '}';
        }
        public static String printRuble(int sum) {       // Method for formatting money
            int kop = sum % 100;
            int rub = sum / 100;
            return String.format("%d.%02d", rub, kop);
        }
    }










