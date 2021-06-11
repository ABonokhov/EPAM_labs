package by.gsu.epamlab;
import java.util.Arrays;
import static by.gsu.epamlab.BusinessTrip.printRuble;

public class Runner {
    public static void main(String[] args) {

        BusinessTrip[]  businessTrips = {
                new BusinessTrip( "Karim Bataev", 1234, 12),
                new BusinessTrip( "Alexei Zareckiy", 1632, 11),
                null,
                new BusinessTrip( "Alesya Chernitskaya", 985, 7),
                new BusinessTrip(),
        };

        int max = 0;
        for (BusinessTrip  businessTrip :  businessTrips) {    // cycle for calculate business trip with maximum cost
            if ( businessTrip != null && businessTrip.getTotal() > max) {
                max = businessTrip.getTotal();
            }

            if (businessTrip!= null) {
                businessTrip.show();   // using show( ) method for output array to the console
                System.out.println("___________________");
            }

            businessTrips [4].setExpenses(1649);  // Update  transportation expenses for the last object of the array
        }

        System.out.println("Duration = " +  (businessTrips[0].getDaysNumber() + (businessTrips[1].getDaysNumber())));  // Output the total duration of two initial business trips
        System.out.println(Arrays.toString( businessTrips));   //  Output the array content to the console using toString()
        System.out.println("Maximum cost is  " + printRuble(max)); // Output the maximum cost of a business trip

    }
        }
















