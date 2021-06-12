package by.gsu.epamlab;

    public class BusinessTrip {
        private static final int DAILY_RATE = 950; // daily allowance rate in BYN (constant)
        private String account; // employee`s account
        private int expenses; // transportation expenses in BYN
        private int daysNumber; // number of days

        public BusinessTrip() { // no-arg constructor
            this(null,0,0);
        }

        public BusinessTrip(String account, int expenses, int daysNumber) {  // parameterized constructor
            this.account = account;
            this.expenses = expenses;
            this.daysNumber= daysNumber;
        }

        public void setExpenses(int expenses) {  // getters and setters
            this.expenses = expenses;
        } 

        public int getDaysNumber() {
            return daysNumber;
        }

        public int getTotal() {
            return expenses + DAILY_RATE * daysNumber;  // returns the total business trip expenses in BYN
        }

        public void show() {        // outputs all fields to the console
            System.out.println("rate = " + printRuble(DAILY_RATE) + ", " +  "account = " + account + ", " +  "transport = " +  printRuble(expenses) + ", " + "days = " + daysNumber + ", " + "total = " + printRuble(getTotal()));
        }

        @Override
        public String toString() {    // returns a string representation of a business trip in the csv–format
            return account + ";" + printRuble(expenses) + ";" + daysNumber + ";" + printRuble(getTotal());
        }

         private static String printRuble(int sum) {       // Method for formatting money
            return String.format("%d.%02d", sum / 100, sum % 100);
        }
    }










